package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IUserService userService;


    @RequestMapping("/toList")
    public String toList( Model model, User user){


        model.addAttribute("user",user);
        return "goodsList";
    }


//    @RequestMapping("/toList")
//    public String toList(HttpServletRequest request, HttpServletResponse response, Model model, @CookieValue("userTicket") String ticket){
//        //use session to find user valid? login?
//
//        if(StringUtils.isEmpty(ticket)){
//            return "login";
//        }
//
////        User user=(User) session.getAttribute(ticket);
//        User user=userService.getUserByCookie(ticket,request,response);
//
//        if(user==null){
//            return "login";
//        }
//
//        model.addAttribute("user",user);
//        return "goodsList";
//    }
}
