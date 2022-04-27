package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName symptom_type
 */
@TableName(value ="symptom_type")
@Data
public class SymptomType implements Serializable {
    /**
     * 由医院编码1-9如1-癌症,非空
     */
    @TableId
    private String symptomNo;

    /**
     * 非空
     */
    private String symptomName;

    /**
     * 是应扣费的百分比。如应扣百分十即收费标准就是10,非空
     */
    private Integer symptomStandard;

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
        SymptomType other = (SymptomType) that;
        return (this.getSymptomNo() == null ? other.getSymptomNo() == null : this.getSymptomNo().equals(other.getSymptomNo()))
            && (this.getSymptomName() == null ? other.getSymptomName() == null : this.getSymptomName().equals(other.getSymptomName()))
            && (this.getSymptomStandard() == null ? other.getSymptomStandard() == null : this.getSymptomStandard().equals(other.getSymptomStandard()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSymptomNo() == null) ? 0 : getSymptomNo().hashCode());
        result = prime * result + ((getSymptomName() == null) ? 0 : getSymptomName().hashCode());
        result = prime * result + ((getSymptomStandard() == null) ? 0 : getSymptomStandard().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", symptomNo=").append(symptomNo);
        sb.append(", symptomName=").append(symptomName);
        sb.append(", symptomStandard=").append(symptomStandard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}