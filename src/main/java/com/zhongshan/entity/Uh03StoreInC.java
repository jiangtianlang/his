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
 * @TableName uh03_store_in_c
 */
@TableName(value ="uh03_store_in_c")
@Data
public class Uh03StoreInC implements Serializable {
    /**
     * 入库单号
     */
    @TableId(type = IdType.AUTO)
    private Integer inNo;

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
        Uh03StoreInC other = (Uh03StoreInC) that;
        return (this.getInNo() == null ? other.getInNo() == null : this.getInNo().equals(other.getInNo()))
            && (this.getMediNo() == null ? other.getMediNo() == null : this.getMediNo().equals(other.getMediNo()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getInDate() == null ? other.getInDate() == null : this.getInDate().equals(other.getInDate()))
            && (this.getComNo() == null ? other.getComNo() == null : this.getComNo().equals(other.getComNo()))
            && (this.getBillNo() == null ? other.getBillNo() == null : this.getBillNo().equals(other.getBillNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInNo() == null) ? 0 : getInNo().hashCode());
        result = prime * result + ((getMediNo() == null) ? 0 : getMediNo().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getInDate() == null) ? 0 : getInDate().hashCode());
        result = prime * result + ((getComNo() == null) ? 0 : getComNo().hashCode());
        result = prime * result + ((getBillNo() == null) ? 0 : getBillNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inNo=").append(inNo);
        sb.append(", mediNo=").append(mediNo);
        sb.append(", specification=").append(specification);
        sb.append(", unit=").append(unit);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", quantity=").append(quantity);
        sb.append(", inDate=").append(inDate);
        sb.append(", comNo=").append(comNo);
        sb.append(", billNo=").append(billNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}