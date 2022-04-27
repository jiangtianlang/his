package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName standard_expense
 */
@TableName(value ="standard_expense")
@Data
public class StandardExpense implements Serializable {
    /**
     * 收费项目
     */
    @TableId
    private String expenseItem;

    /**
     * 收费编号
     */
    private String expenseCode;

    /**
     * 收费名称
     */
    private String expenseName;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 计价单位
     */
    private String gaugeUnit;

    /**
     * 收费标准
     */
    private Double expense;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}