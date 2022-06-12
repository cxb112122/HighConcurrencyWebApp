package com.xxxx.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.seckill.exception.GlobalException;
import com.xxxx.seckill.mapper.UserMapper;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.IUserService;
import com.xxxx.seckill.utils.MD5Util;
import com.xxxx.seckill.utils.ValidatorUtil;
import com.xxxx.seckill.vo.LoginVo;
import com.xxxx.seckill.vo.RespBean;
import com.xxxx.seckill.vo.RespBeanEnum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * <p>
 *
 * </p>
 *
 * @author XC
 * @since 2022-06-09
 */
@Service
@Primary

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public RespBean doLogin(LoginVo loginVo) {
        String mobile=loginVo.getMobile();
        String password=loginVo.getPassword();

        //validation
//        if(StringUtils.isEmpty(mobile)||StringUtils.isEmpty(password)){
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//        }
//
//        if(!ValidatorUtil.isMobile(mobile)){
//            return RespBean.error(RespBeanEnum.MOBILE_ERROR);
//
//        }
        //get user by phone number
        User user=userMapper.selectById(mobile);
        if(null==user){
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        System.out.println(mobile);
        System.out.println(user.getPassword());
        System.out.println(user==null);
        System.out.println(MD5Util.formPassToDBPass(password, user.getSalt()));
//        if (!MD5Util.formPassToDBPass(password,user.getSalt()).equals(user.getPassword())) {
//            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
//        }
        if (!MD5Util.formPassToDBPass(password,user.getSalt()).equals(user.getPassword())){
            //correct paw
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);


        }
        return RespBean.success();
    }
}
//    INSERT INTO `seckill`.`t_user` (`id`, `nickname`, `password`, `salt`) VALUES ('18011111111', 'test', '6e0a7fe692684372437c9e508508990d', '1a2b3c4d');
