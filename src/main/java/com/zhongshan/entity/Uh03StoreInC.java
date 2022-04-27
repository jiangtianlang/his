package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName uh03_store_in_c
 */
@TableName(value ="uh03_store_in_c")
@Data
public class Uh03StoreInC implements Serializable {
    /**
     * 入库单号
     */
    @TableId(type = IdType.AUTO)
    private Integer inNo;

    /**
     * 药品代码
     */
    private String mediNo;

    /**
     * 规格
     */
    private String specification;

    /**
     * 单位
     */
    private String unit;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 日期
     */
    private Date inDate;

    /**
     * 供应商代号
     */
    private String comNo;

    /**
     * 发票号码
     */
    private String billNo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}