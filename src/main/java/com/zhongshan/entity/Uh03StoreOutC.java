package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName uh03_store_out_c
 */
@TableName(value ="uh03_store_out_c")
@NoArgsConstructor
@Data
public class Uh03StoreOutC implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer outId;

    /**
     * 出库单号
     */
    private String outNo;

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
    /**
     * 状态
     */
    @TableLogic
    private Integer State;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh03StoreOutC(Double unitPrice, String mediNo, String outNo, String specification, String unit, Integer quantity, String department) {
        this.outNo = outNo;
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.quantity = quantity;
        this.department = department;
        this.unitPrice=unitPrice;
    }


}