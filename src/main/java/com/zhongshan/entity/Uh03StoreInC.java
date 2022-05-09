package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName uh03_store_in_c
 */
@TableName(value ="uh03_store_in_c")
@NoArgsConstructor
@Data
public class Uh03StoreInC implements Serializable {
    /**
     * 入库Id
     */
    @TableId(type = IdType.AUTO)
    private Integer inId;
    /**
     * 入库单号
     */
    private String inNo;

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
    /**
     * 状态
     */
    @TableLogic
    private Integer State;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}