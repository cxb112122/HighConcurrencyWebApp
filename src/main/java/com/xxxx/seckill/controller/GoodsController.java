package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/toList")
    public String toList(HttpSession session,Model model,@CookieValue("userTicket") String ticket){
        //use session to find user valid? login?

        if(StringUtils.isEmpty(ticket)){
            return "login";
        }

        User user=(User) session.getAttribute(ticket);
        if(user==null){
            return "login";
        }

        model.addAttribute("user",user);
        return "goodsList";
    }
}
