package com.nickwww.model.vo.common;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(200 , "Operation Successful") ,
    LOGIN_ERROR(201 , "Username or password incorrect"),
    VALIDATECODE_ERROR(202 , "Verification code error") ,
    LOGIN_AUTH(208 , "User not logged in"),
    USER_NAME_IS_EXISTS(209 , "Username already exists"),
    SYSTEM_ERROR(9999 , "There is a problem with your network, please try again later"),
    NODE_ERROR( 217, "This node has child nodes and cannot be deleted"),
    DATA_ERROR(204, "Data anomaly"),

    ACCOUNT_STOP( 216, "Account has been disabled"),

    STOCK_LESS( 219, "Insufficient stock"),
    ;

    private Integer code ;
    private String message ;

    private ResultCodeEnum(Integer code , String message) {
        this.code = code ;
        this.message = message ;
    }
}
