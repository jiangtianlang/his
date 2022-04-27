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
 * @TableName public_expense
 */
@TableName(value ="public_expense")
@Data
public class PublicExpense implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 
     */
    private Date beginDate;

    /**
     * 
     */
    private Date endDate;

    /**
     * 
     */
    private Integer inDays;

    /**
     * 
     */
    private Double chargeForMedicine;

    /**
     * 
     */
    private Double chargeForCheck;

    /**
     * 
     */
    private Double chargeForBed;

    /**
     * 
     */
    private Double otherCharge;

    /**
     * 
     */
    private String levelNo;

    /**
     * 
     */
    private String symptomNo;

    /**
     * 
     */
    private Double orgaTotal;

    /**
     * 
     */
    private Double personTotal;

    /**
     * 非空
     */
    private Date submitDate;

    /**
     * 
     */
    private String remarks;

    /**
     * 非空
     */
    private Integer sequenceNo;

    /**
     * 
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
        PublicExpense other = (PublicExpense) that;
        return (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getInDays() == null ? other.getInDays() == null : this.getInDays().equals(other.getInDays()))
            && (this.getChargeForMedicine() == null ? other.getChargeForMedicine() == null : this.getChargeForMedicine().equals(other.getChargeForMedicine()))
            && (this.getChargeForCheck() == null ? other.getChargeForCheck() == null : this.getChargeForCheck().equals(other.getChargeForCheck()))
            && (this.getChargeForBed() == null ? other.getChargeForBed() == null : this.getChargeForBed().equals(other.getChargeForBed()))
            && (this.getOtherCharge() == null ? other.getOtherCharge() == null : this.getOtherCharge().equals(other.getOtherCharge()))
            && (this.getLevelNo() == null ? other.getLevelNo() == null : this.getLevelNo().equals(other.getLevelNo()))
            && (this.getSymptomNo() == null ? other.getSymptomNo() == null : this.getSymptomNo().equals(other.getSymptomNo()))
            && (this.getOrgaTotal() == null ? other.getOrgaTotal() == null : this.getOrgaTotal().equals(other.getOrgaTotal()))
            && (this.getPersonTotal() == null ? other.getPersonTotal() == null : this.getPersonTotal().equals(other.getPersonTotal()))
            && (this.getSubmitDate() == null ? other.getSubmitDate() == null : this.getSubmitDate().equals(other.getSubmitDate()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getSequenceNo() == null ? other.getSequenceNo() == null : this.getSequenceNo().equals(other.getSequenceNo()))
            && (this.getChargeStandard() == null ? other.getChargeStandard() == null : this.getChargeStandard().equals(other.getChargeStandard()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getInDays() == null) ? 0 : getInDays().hashCode());
        result = prime * result + ((getChargeForMedicine() == null) ? 0 : getChargeForMedicine().hashCode());
        result = prime * result + ((getChargeForCheck() == null) ? 0 : getChargeForCheck().hashCode());
        result = prime * result + ((getChargeForBed() == null) ? 0 : getChargeForBed().hashCode());
        result = prime * result + ((getOtherCharge() == null) ? 0 : getOtherCharge().hashCode());
        result = prime * result + ((getLevelNo() == null) ? 0 : getLevelNo().hashCode());
        result = prime * result + ((getSymptomNo() == null) ? 0 : getSymptomNo().hashCode());
        result = prime * result + ((getOrgaTotal() == null) ? 0 : getOrgaTotal().hashCode());
        result = prime * result + ((getPersonTotal() == null) ? 0 : getPersonTotal().hashCode());
        result = prime * result + ((getSubmitDate() == null) ? 0 : getSubmitDate().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getSequenceNo() == null) ? 0 : getSequenceNo().hashCode());
        result = prime * result + ((getChargeStandard() == null) ? 0 : getChargeStandard().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personNo=").append(personNo);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", inDays=").append(inDays);
        sb.append(", chargeForMedicine=").append(chargeForMedicine);
        sb.append(", chargeForCheck=").append(chargeForCheck);
        sb.append(", chargeForBed=").append(chargeForBed);
        sb.append(", otherCharge=").append(otherCharge);
        sb.append(", levelNo=").append(levelNo);
        sb.append(", symptomNo=").append(symptomNo);
        sb.append(", orgaTotal=").append(orgaTotal);
        sb.append(", personTotal=").append(personTotal);
        sb.append(", submitDate=").append(submitDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", sequenceNo=").append(sequenceNo);
        sb.append(", chargeStandard=").append(chargeStandard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}