package com.nickwww.common.exception;

import com.nickwww.model.vo.common.Result;
import com.nickwww.model.vo.common.ResultCodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Global Exception Handler
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(){
        return Result.build(null, ResultCodeEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result error(CustomException e){
        return Result.build(null, e.getResultCodeEnum());
    }

}
