package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName uh03_month_balance_c
 */
@TableName(value ="uh03_month_balance_c")
@NoArgsConstructor
@Data
public class Uh03MonthBalanceC implements Serializable {
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
     * 上月结余（均价）
     */
    private Double balancePrice;

    /**
     * 本月入库(均价)
     */
    private Double inAmount;

    /**
     * 本月出库(均价)
     */
    private Double outPrice;

    /**
     * 本月出库（数量）
     */
    private Integer outAmount;

    /**
     * 月份
     */
    private Integer month;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh03MonthBalanceC(String mediNo, Double unitPrice, String unit, String specification) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.inAmount = unitPrice;
    }

    public Uh03MonthBalanceC(String mediNo, String specification, String unit, Double balancePrice, Double inAmount, Double outPrice, Integer outAmount, Integer month) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.balancePrice = balancePrice;
        this.inAmount = inAmount;
        this.outPrice = outPrice;
        this.outAmount = outAmount;
        this.month = month;
    }

    public Uh03MonthBalanceC(String mediNo, Double unitPrice, String unit, String specification, Integer quantity) {
        this.mediNo = mediNo;
        this.specification = specification;
        this.unit = unit;
        this.outPrice = unitPrice;
        this.outAmount=quantity;
    }
}