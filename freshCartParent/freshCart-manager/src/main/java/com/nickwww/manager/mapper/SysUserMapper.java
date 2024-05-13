package com.nickwww.manager.mapper;

import com.nickwww.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper {
    public SysUser selectUserInfoByUserName(String username);
}
