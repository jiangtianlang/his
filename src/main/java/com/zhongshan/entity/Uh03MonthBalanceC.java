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
        Uh03MonthBalanceC other = (Uh03MonthBalanceC) that;
        return (this.getMediNo() == null ? other.getMediNo() == null : this.getMediNo().equals(other.getMediNo()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getBalancePrice() == null ? other.getBalancePrice() == null : this.getBalancePrice().equals(other.getBalancePrice()))
            && (this.getInAmount() == null ? other.getInAmount() == null : this.getInAmount().equals(other.getInAmount()))
            && (this.getOutPrice() == null ? other.getOutPrice() == null : this.getOutPrice().equals(other.getOutPrice()))
            && (this.getOutAmount() == null ? other.getOutAmount() == null : this.getOutAmount().equals(other.getOutAmount()))
            && (this.getMonth() == null ? other.getMonth() == null : this.getMonth().equals(other.getMonth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMediNo() == null) ? 0 : getMediNo().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getBalancePrice() == null) ? 0 : getBalancePrice().hashCode());
        result = prime * result + ((getInAmount() == null) ? 0 : getInAmount().hashCode());
        result = prime * result + ((getOutPrice() == null) ? 0 : getOutPrice().hashCode());
        result = prime * result + ((getOutAmount() == null) ? 0 : getOutAmount().hashCode());
        result = prime * result + ((getMonth() == null) ? 0 : getMonth().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mediNo=").append(mediNo);
        sb.append(", specification=").append(specification);
        sb.append(", unit=").append(unit);
        sb.append(", balancePrice=").append(balancePrice);
        sb.append(", inAmount=").append(inAmount);
        sb.append(", outPrice=").append(outPrice);
        sb.append(", outAmount=").append(outAmount);
        sb.append(", month=").append(month);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}