package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.RespBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XC
 * @since 2022-06-09
 */
@Mapper
@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("info")
    @ResponseBody
    public RespBean info(User user){
        return RespBean.success(user);
    }

}
