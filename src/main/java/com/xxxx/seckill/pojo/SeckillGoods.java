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
@TableName("t_seckill_goods")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * flashsell product id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * product id
     */
    private Long goodsId;

    /**
     * price
     */
    private BigDecimal seckillPrice;

    /**
     * stock
     */
    private Integer stockCount;

    /**
     * start time
     */
    private Date startDate;

    /**
     * end time
     */
    private Date endDate;


}
