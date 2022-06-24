package com.xxxx.seckill.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"SERVER ERROR"),
    EMPTY_STOCK(500500,"EMPTY_STOCK ERROR"),
    REPEAT_ERROR(500501,"One User One Order"),
    MOBILE_NOT_EXIST(500213,"username/password invalid"),
    PASSWORD_UPDATE_FAIL(500214,"PASSWORD_UPDATE_FAIL"),
    LOGIN_ERROR(500210,"username/password invalid"),
    MOBILE_ERROR(500211,"username pattern invalid"),
    BIND_ERROR(500212,"parameter validation error");


    private final Integer code;
    private final String message;

}
