package com.nickwww.manager.service.impl;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.nickwww.common.exception.CustomException;
import com.nickwww.manager.mapper.SysUserMapper;
import com.nickwww.manager.service.SysUserService;
import com.nickwww.model.dto.system.LoginDto;
import com.nickwww.model.entity.system.SysUser;
import com.nickwww.model.vo.common.ResultCodeEnum;
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
        String key = loginDto.getCodeKey();
        String codeCaptcha = loginDto.getCaptcha();
        String codeFromRedis = redisTemplate.opsForValue().get("user:validate"+key);

        if(StrUtil.isEmpty(codeFromRedis) || !StrUtil.equalsAnyIgnoreCase(codeFromRedis, codeCaptcha)){
            throw new CustomException(ResultCodeEnum.VALIDATECODE_ERROR);
        }

        redisTemplate.delete("user:validate"+key);

        // Retrieve User name
        String username = loginDto.getUserName();

        // Retrieve info from DB sys_user
        SysUser sysUser = sysUserMapper.selectUserInfoByUserName(username);

        // Check if user exist
        if(sysUser == null){
            throw new CustomException(ResultCodeEnum.LOGIN_ERROR);
        }

        // If user exists, check the password
        String db_password = sysUser.getPassword();
        String input_password = DigestUtils.md5DigestAsHex(loginDto.getPassword().getBytes());

        if(!input_password.equals(db_password)){
             throw new CustomException(ResultCodeEnum.LOGIN_ERROR);
        }

        // If the password matches, generate token
        String token = UUID.randomUUID().toString().replace("-", "");
        redisTemplate.opsForValue().set("user_id" + token, JSON.toJSONString(sysUser), 7,  TimeUnit.DAYS );

        //Return login VO
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);

        return loginVo;
    }

    @Override
    public SysUser getUserInfo(String token) {
        String userJson = redisTemplate.opsForValue().get("user:login" + token);
        SysUser sysUser = JSON.parseObject(userJson, SysUser.class);
        return sysUser;
    }

    @Override
    public void logout(String token) {
        redisTemplate.delete("user:login" + token);
    }
}
