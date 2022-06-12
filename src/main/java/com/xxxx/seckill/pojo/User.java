package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author XC
 * @since 2022-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * userid, phonenumber
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass+salt)+salt)
     */
    private String password;

    private String salt;

    /**
     * avetar
     */
    private String head;

    /**
     * registration time
     */
    private Date registerDate;

    /**
     * latest login
     */
    private Date lastLoginDate;

    /**
     * login attemps
     */
    private Integer loginCount;


}
