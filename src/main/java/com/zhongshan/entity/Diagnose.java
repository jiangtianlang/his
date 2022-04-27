package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName diagnose
 */
@TableName(value ="diagnose")
@Data
public class Diagnose implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String diseaseIcd9;

    /**
     * 
     */
    private String diseaseCode;

    /**
     * 后来去掉
     */
    private String diseaseType;

    /**
     * 
     */
    private String diseaseName;

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
        Diagnose other = (Diagnose) that;
        return (this.getDiseaseIcd9() == null ? other.getDiseaseIcd9() == null : this.getDiseaseIcd9().equals(other.getDiseaseIcd9()))
            && (this.getDiseaseCode() == null ? other.getDiseaseCode() == null : this.getDiseaseCode().equals(other.getDiseaseCode()))
            && (this.getDiseaseType() == null ? other.getDiseaseType() == null : this.getDiseaseType().equals(other.getDiseaseType()))
            && (this.getDiseaseName() == null ? other.getDiseaseName() == null : this.getDiseaseName().equals(other.getDiseaseName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiseaseIcd9() == null) ? 0 : getDiseaseIcd9().hashCode());
        result = prime * result + ((getDiseaseCode() == null) ? 0 : getDiseaseCode().hashCode());
        result = prime * result + ((getDiseaseType() == null) ? 0 : getDiseaseType().hashCode());
        result = prime * result + ((getDiseaseName() == null) ? 0 : getDiseaseName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diseaseIcd9=").append(diseaseIcd9);
        sb.append(", diseaseCode=").append(diseaseCode);
        sb.append(", diseaseType=").append(diseaseType);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}