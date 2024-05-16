package com.nickwww.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nickwww.manager.mapper.SysRoleMapper;
import com.nickwww.manager.service.SysRoleService;
import com.nickwww.model.dto.system.SysRoleDto;
import com.nickwww.model.entity.system.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer current, Integer limit) {
        PageHelper.startPage(current, limit);
        List<SysRole> list = sysRoleMapper.findByPage(sysRoleDto);
        PageInfo<SysRole> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
