package com.nickwww.manager.service;

import com.github.pagehelper.PageInfo;
import com.nickwww.model.dto.system.SysRoleDto;
import com.nickwww.model.entity.system.SysRole;

public interface SysRoleService {
    PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer current, Integer limit);
}
