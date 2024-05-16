package com.nickwww.manager.mapper;

import com.nickwww.model.dto.system.SysRoleDto;
import com.nickwww.model.entity.system.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    List<SysRole> findByPage(SysRoleDto sysRoleDto);
}
