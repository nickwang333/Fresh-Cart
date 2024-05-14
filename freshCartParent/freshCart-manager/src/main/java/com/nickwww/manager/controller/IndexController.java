package com.nickwww.manager.controller;

import com.nickwww.manager.service.SysUserService;
import com.nickwww.manager.service.ValidateCodeService;
import com.nickwww.model.dto.system.LoginDto;
import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import com.nickwww.model.vo.system.LoginVo;
import com.nickwww.model.vo.system.ValidateCodeVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "User Controller")
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private ValidateCodeService validateCodeService;


    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo, ResultCodeEnum.SUCCESS);
    }

    @PostMapping("login")
    public Result login(@RequestBody LoginDto loginDto){
        LoginVo loginVo = sysUserService.login(loginDto);
        return Result.build(loginVo, ResultCodeEnum.SUCCESS);
    }
}
