package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName hospital_level
 */
@TableName(value ="hospital_level")
@Data
public class HospitalLevel implements Serializable {
    /**
     * 由医院编码1-9如1-省级 2-市级,非空
     */
    @TableId
    private String levelNo;

    /**
     * 非空
     */
    private String levelName;

    /**
     * 是应扣费的百分比。如应扣百分十即收费标准就是10,非空
     */
    private Integer chargeStandard;

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
        HospitalLevel other = (HospitalLevel) that;
        return (this.getLevelNo() == null ? other.getLevelNo() == null : this.getLevelNo().equals(other.getLevelNo()))
            && (this.getLevelName() == null ? other.getLevelName() == null : this.getLevelName().equals(other.getLevelName()))
            && (this.getChargeStandard() == null ? other.getChargeStandard() == null : this.getChargeStandard().equals(other.getChargeStandard()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLevelNo() == null) ? 0 : getLevelNo().hashCode());
        result = prime * result + ((getLevelName() == null) ? 0 : getLevelName().hashCode());
        result = prime * result + ((getChargeStandard() == null) ? 0 : getChargeStandard().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", levelNo=").append(levelNo);
        sb.append(", levelName=").append(levelName);
        sb.append(", chargeStandard=").append(chargeStandard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}