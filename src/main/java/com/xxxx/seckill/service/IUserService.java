package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.LoginVo;
import com.xxxx.seckill.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XC
 * @since 2022-06-09
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo);
}
