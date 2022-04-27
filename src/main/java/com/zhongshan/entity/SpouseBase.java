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
 * @TableName spouse_base
 */
@TableName(value ="spouse_base")
@Data
public class SpouseBase implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 
     */
    private String spouseName;

    /**
     * 
     */
    private Date spouseBirthDate;

    /**
     * 
     */
    private String spouseParty;

    /**
     * 
     */
    private String spouseSchooling;

    /**
     * 
     */
    private Date marryDate;

    /**
     * 
     */
    private String workUnit;

    /**
     * 
     */
    private String spouseNative;

    /**
     * 全民或集体
     */
    private String workQuality;

    /**
     * t—干部   f—工人
     */
    private String cadre;

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
        SpouseBase other = (SpouseBase) that;
        return (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getSpouseName() == null ? other.getSpouseName() == null : this.getSpouseName().equals(other.getSpouseName()))
            && (this.getSpouseBirthDate() == null ? other.getSpouseBirthDate() == null : this.getSpouseBirthDate().equals(other.getSpouseBirthDate()))
            && (this.getSpouseParty() == null ? other.getSpouseParty() == null : this.getSpouseParty().equals(other.getSpouseParty()))
            && (this.getSpouseSchooling() == null ? other.getSpouseSchooling() == null : this.getSpouseSchooling().equals(other.getSpouseSchooling()))
            && (this.getMarryDate() == null ? other.getMarryDate() == null : this.getMarryDate().equals(other.getMarryDate()))
            && (this.getWorkUnit() == null ? other.getWorkUnit() == null : this.getWorkUnit().equals(other.getWorkUnit()))
            && (this.getSpouseNative() == null ? other.getSpouseNative() == null : this.getSpouseNative().equals(other.getSpouseNative()))
            && (this.getWorkQuality() == null ? other.getWorkQuality() == null : this.getWorkQuality().equals(other.getWorkQuality()))
            && (this.getCadre() == null ? other.getCadre() == null : this.getCadre().equals(other.getCadre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getSpouseName() == null) ? 0 : getSpouseName().hashCode());
        result = prime * result + ((getSpouseBirthDate() == null) ? 0 : getSpouseBirthDate().hashCode());
        result = prime * result + ((getSpouseParty() == null) ? 0 : getSpouseParty().hashCode());
        result = prime * result + ((getSpouseSchooling() == null) ? 0 : getSpouseSchooling().hashCode());
        result = prime * result + ((getMarryDate() == null) ? 0 : getMarryDate().hashCode());
        result = prime * result + ((getWorkUnit() == null) ? 0 : getWorkUnit().hashCode());
        result = prime * result + ((getSpouseNative() == null) ? 0 : getSpouseNative().hashCode());
        result = prime * result + ((getWorkQuality() == null) ? 0 : getWorkQuality().hashCode());
        result = prime * result + ((getCadre() == null) ? 0 : getCadre().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personNo=").append(personNo);
        sb.append(", spouseName=").append(spouseName);
        sb.append(", spouseBirthDate=").append(spouseBirthDate);
        sb.append(", spouseParty=").append(spouseParty);
        sb.append(", spouseSchooling=").append(spouseSchooling);
        sb.append(", marryDate=").append(marryDate);
        sb.append(", workUnit=").append(workUnit);
        sb.append(", spouseNative=").append(spouseNative);
        sb.append(", workQuality=").append(workQuality);
        sb.append(", cadre=").append(cadre);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}