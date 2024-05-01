package com.nickwww.model.vo.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Result Entity")
public class Result<T> {

    @Schema(description = "Code")
    private Integer code;

    @Schema(description = "Response message")
    private String message;

    @Schema(description = "Data")
    private T data;

    private Result() {}

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<>();
        result.setData(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result build(T body , ResultCodeEnum resultCodeEnum) {
        return build(body , resultCodeEnum.getCode() , resultCodeEnum.getMessage()) ;
    }
}
