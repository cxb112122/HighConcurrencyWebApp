package com.xxxx.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill.pojo.Order;
import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XC
 * @since 2022-06-20
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, GoodsVo goods);
}
