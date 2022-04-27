package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_month_balance_c
 */
@TableName(value ="uh03_month_balance_c")
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
    private Integer inAmount;

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
    private String month;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}