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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StandardExpense other = (StandardExpense) that;
        return (this.getExpenseItem() == null ? other.getExpenseItem() == null : this.getExpenseItem().equals(other.getExpenseItem()))
            && (this.getExpenseCode() == null ? other.getExpenseCode() == null : this.getExpenseCode().equals(other.getExpenseCode()))
            && (this.getExpenseName() == null ? other.getExpenseName() == null : this.getExpenseName().equals(other.getExpenseName()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getGaugeUnit() == null ? other.getGaugeUnit() == null : this.getGaugeUnit().equals(other.getGaugeUnit()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpenseItem() == null) ? 0 : getExpenseItem().hashCode());
        result = prime * result + ((getExpenseCode() == null) ? 0 : getExpenseCode().hashCode());
        result = prime * result + ((getExpenseName() == null) ? 0 : getExpenseName().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getGaugeUnit() == null) ? 0 : getGaugeUnit().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expenseItem=").append(expenseItem);
        sb.append(", expenseCode=").append(expenseCode);
        sb.append(", expenseName=").append(expenseName);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", gaugeUnit=").append(gaugeUnit);
        sb.append(", expense=").append(expense);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}