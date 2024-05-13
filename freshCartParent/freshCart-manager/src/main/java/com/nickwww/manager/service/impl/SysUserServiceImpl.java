package com.nickwww.manager.service.impl;

import com.alibaba.fastjson.JSON;
import com.nickwww.manager.mapper.SysUserMapper;
import com.nickwww.manager.service.SysUserService;
import com.nickwww.model.dto.system.LoginDto;
import com.nickwww.model.entity.system.SysUser;
import com.nickwww.model.vo.system.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public LoginVo login(LoginDto loginDto) {
        // Retrieve User name
        String username = loginDto.getUserName();

        // Retrieve info from DB sys_user
        SysUser sysUser = sysUserMapper.selectUserInfoByUserName(username);

        // Check if user exist
        if(sysUser == null){
            throw new RuntimeException("User not exist");
        }

        // If user exists, check the password
        String db_password = sysUser.getPassword();
        String input_password = DigestUtils.md5DigestAsHex(loginDto.getPassword().getBytes());

        if(!input_password.equals(db_password)){
             throw new RuntimeException("Incorrect Password");
        }

        // If the password matches, generate token
        String token = UUID.randomUUID().toString().replace("-", "");
        redisTemplate.opsForValue().set("user_id" + token, JSON.toJSONString(sysUser), 7,  TimeUnit.DAYS );

        //Return login VO
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);

        return loginVo;
    }
}
