package com.nickwww.common.exception;

import com.nickwww.model.vo.common.ResultCodeEnum;
import lombok.Data;

@Data
public class CustomException extends RuntimeException{
    private Integer code;
    private String message;
    private ResultCodeEnum resultCodeEnum;

    public CustomException(ResultCodeEnum resultCodeEnum){
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
        this.resultCodeEnum = resultCodeEnum;
    }
}
