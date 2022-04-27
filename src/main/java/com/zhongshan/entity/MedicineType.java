package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medicine_type
 */
@TableName(value ="medicine_type")
@Data
public class MedicineType implements Serializable {
    /**
     * 药费代号
     */
    @TableId
    private String mediNo;

    /**
     * 药费名称
     */
    private String mediName;

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
        MedicineType other = (MedicineType) that;
        return (this.getMediNo() == null ? other.getMediNo() == null : this.getMediNo().equals(other.getMediNo()))
            && (this.getMediName() == null ? other.getMediName() == null : this.getMediName().equals(other.getMediName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMediNo() == null) ? 0 : getMediNo().hashCode());
        result = prime * result + ((getMediName() == null) ? 0 : getMediName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mediNo=").append(mediNo);
        sb.append(", mediName=").append(mediName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}