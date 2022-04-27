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
    @TableId
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
        Uh03StoreOutC other = (Uh03StoreOutC) that;
        return (this.getOutNo() == null ? other.getOutNo() == null : this.getOutNo().equals(other.getOutNo()))
            && (this.getMediNo() == null ? other.getMediNo() == null : this.getMediNo().equals(other.getMediNo()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getOutDate() == null ? other.getOutDate() == null : this.getOutDate().equals(other.getOutDate()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutNo() == null) ? 0 : getOutNo().hashCode());
        result = prime * result + ((getMediNo() == null) ? 0 : getMediNo().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getOutDate() == null) ? 0 : getOutDate().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", outNo=").append(outNo);
        sb.append(", mediNo=").append(mediNo);
        sb.append(", specification=").append(specification);
        sb.append(", unit=").append(unit);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", quantity=").append(quantity);
        sb.append(", outDate=").append(outDate);
        sb.append(", department=").append(department);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}