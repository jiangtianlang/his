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
 * @TableName uh03_store_out_c
 */
@TableName(value ="uh03_store_out_c")
@Data
public class Uh03StoreOutC implements Serializable {
    /**
     * 出库单号
     */
    @TableId
    private Integer outNo;

    /**
     *  药品代码
     */
    private String mediNo;

    /**
     *  规格
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
     * 出库日期
     */
    private Date outDate;

    /**
     * 部门
     */
    private String department;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}