package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author XC
 * @since 2022-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * user id
     */
    private Long userId;

    /**
     * product id
     */
    private Long goodsId;

    /**
     * address id
     */
    private Long deliveryAddrId;

    /**
     * name
     */
    private String goodsName;

    /**
     * num of product
     */
    private Integer goodsCount;

    /**
     * price
     */
    private BigDecimal goodsPrice;

    /**
     * 1 pc,2 android, 3 ios
     */
    private Integer orderChannel;

    /**
     * order sttaus，0 pending payment，1 paid，2 shipped，3 deliveried，4 returned，5 completed
     */
    private Integer status;

    /**
     * oder time
     */
    private Date createDate;

    /**
     * payment time
     */
    private Date payDate;


}
