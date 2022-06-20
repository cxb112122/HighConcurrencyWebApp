package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * name
     */
    private String goodsName;

    /**
     * title
     */
    private String goodsTitle;

    /**
     * img
     */
    private String goodsImg;

    /**
     * detail
     */
    private String goodsDetail;

    /**
     * price
     */
    private BigDecimal goodsPrice;

    /**
     * stock
     */
    private Integer goodsStock;


}
