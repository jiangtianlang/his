package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName charge_type
 */
@TableName(value ="charge_type")
@Data
public class ChargeType implements Serializable {
    /**
     * 收费类型代号(由医院编码01-99非空)
     */
    @TableId
    private Integer chargeNo;

    /**
     * 收费类型名称
     */
    private String chargeName;

    /**
     * 门诊收费标准(是应扣费的百分比(如应扣百分十即收费标准就是10, 非空)
     */
    private Integer chargeStandard1;

    /**
     * 住院收费标准(是应扣费的百分比(如应扣百分十即收费标准就是10, 非空)
     */
    private Integer chargeStandard2;

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
        ChargeType other = (ChargeType) that;
        return (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getChargeName() == null ? other.getChargeName() == null : this.getChargeName().equals(other.getChargeName()))
            && (this.getChargeStandard1() == null ? other.getChargeStandard1() == null : this.getChargeStandard1().equals(other.getChargeStandard1()))
            && (this.getChargeStandard2() == null ? other.getChargeStandard2() == null : this.getChargeStandard2().equals(other.getChargeStandard2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getChargeName() == null) ? 0 : getChargeName().hashCode());
        result = prime * result + ((getChargeStandard1() == null) ? 0 : getChargeStandard1().hashCode());
        result = prime * result + ((getChargeStandard2() == null) ? 0 : getChargeStandard2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", chargeName=").append(chargeName);
        sb.append(", chargeStandard1=").append(chargeStandard1);
        sb.append(", chargeStandard2=").append(chargeStandard2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}