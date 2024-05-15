package com.nickwww.manager.service;

import com.nickwww.model.dto.system.LoginDto;
import com.nickwww.model.entity.system.SysUser;
import com.nickwww.model.vo.system.LoginVo;

public interface SysUserService {
    LoginVo login(LoginDto loginDto);

    SysUser getUserInfo(String token);

    void logout(String token);
}
