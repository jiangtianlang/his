package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_on_store_c
 */
@TableName(value ="uh03_on_store_c")
@Data
public class Uh03OnStoreC implements Serializable {
    /**
     * id
     */

    private Integer uhId;
    /**
     * 药品代码
     */
    @TableId
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
     * 状态
     */
    @TableLogic
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh03OnStoreC() {
    }

    public Uh03OnStoreC(String mediNo, String specification, String unit, Double unitPrice, Integer quantity) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Uh03OnStoreC(String mediNo, Double unitPrice, String specification, String unit, Integer quantity) {
    }

    public Uh03OnStoreC(Uh03StoreInC uh03StoreInC) {
    }

    public Uh03OnStoreC(String mediNo, Double unitPrice, String unit, Integer quantity,  String specification) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Uh03OnStoreC(String mediNo, Double unitPrice, String unit, String specification) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }
}