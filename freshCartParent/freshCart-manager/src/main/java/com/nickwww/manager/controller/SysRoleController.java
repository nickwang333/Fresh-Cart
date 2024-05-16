package com.nickwww.manager.controller;

import com.github.pagehelper.PageInfo;
import com.nickwww.manager.service.SysRoleService;
import com.nickwww.model.dto.system.SysRoleDto;
import com.nickwww.model.entity.system.SysRole;
import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin/system/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    //Current: current page number
    //Limit: No of items displayed
    @PostMapping("/findByPage/{current}/{limit}")
    public Result findByPage(@PathVariable("current") Integer current,
                             @PathVariable("limit") Integer limit,
                             @RequestBody SysRoleDto sysRoleDto) {
        PageInfo<SysRole> pageInfo = sysRoleService.findByPage(sysRoleDto, current, limit);
        return Result.build(pageInfo, ResultCodeEnum.SUCCESS);
    }
}