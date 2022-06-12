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

    LOGIN_ERROR(500210,"username/password invalid"),
    MOBILE_ERROR(500211,"username pattern invalid"),
    BIND_ERROR(500212,"parameter validation error");

    private final Integer code;
    private final String message;

}
