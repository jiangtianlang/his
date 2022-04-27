package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sp05_disease_code
 */
@TableName(value ="sp05_disease_code")
@Data
public class Sp05DiseaseCode implements Serializable {
    /**
     * 
     */
    @TableId
    private String diseaseCode;

    /**
     * 
     */
    private String diseaseName;

    /**
     * 
     */
    private String chineseChar;

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
        Sp05DiseaseCode other = (Sp05DiseaseCode) that;
        return (this.getDiseaseCode() == null ? other.getDiseaseCode() == null : this.getDiseaseCode().equals(other.getDiseaseCode()))
            && (this.getDiseaseName() == null ? other.getDiseaseName() == null : this.getDiseaseName().equals(other.getDiseaseName()))
            && (this.getChineseChar() == null ? other.getChineseChar() == null : this.getChineseChar().equals(other.getChineseChar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiseaseCode() == null) ? 0 : getDiseaseCode().hashCode());
        result = prime * result + ((getDiseaseName() == null) ? 0 : getDiseaseName().hashCode());
        result = prime * result + ((getChineseChar() == null) ? 0 : getChineseChar().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diseaseCode=").append(diseaseCode);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", chineseChar=").append(chineseChar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}