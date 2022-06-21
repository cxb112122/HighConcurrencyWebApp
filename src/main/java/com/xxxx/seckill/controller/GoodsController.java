package com.xxxx.seckill.controller;


import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.IGoodsService;
import com.xxxx.seckill.service.IUserService;
import com.xxxx.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IGoodsService goodsService;


    @RequestMapping("/toList")
    public String toList( Model model, User user){


        model.addAttribute("user",user);
        model.addAttribute("goodsList",goodsService.findGoodsVo());
        return "goodsList";
    }

    @RequestMapping("/toDetail/{goodsId}")
    public String toDetail(Model model, User user,@PathVariable Long goodsId){
        model.addAttribute("user",user);
        GoodsVo goodsVo=goodsService.findGoodsVoByGoodsId(goodsId);
        model.addAttribute("goods",goodsVo);
        Date startDate=goodsVo.getStartDate();
        Date endDate=goodsVo.getEndDate();
        Date nowDate=new Date();
        int secKillStatus=0;
        if(nowDate.before(startDate)){

        }else if(nowDate.after(endDate)){
            secKillStatus=2;
        }

        else{
            secKillStatus=1;

        }
        model.addAttribute("secKillStatus",secKillStatus);
        return "goodsDetail";
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
