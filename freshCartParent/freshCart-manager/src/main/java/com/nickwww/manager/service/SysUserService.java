package com.nickwww.manager.service;

import com.nickwww.model.dto.system.LoginDto;
import com.nickwww.model.vo.system.LoginVo;

public interface SysUserService {
    LoginVo login(LoginDto loginDto);
}
