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
 * @TableName prescription
 */
@TableName(value ="prescription")
@Data
public class Prescription implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;

    /**
     * 药品代号
     */
    private String mediNo;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Double pay;

    /**
     * 金额
     */
    private Double mediMoney;

    /**
     * 单位
     */
    private String unit;

    /**
     * 医生代号
     */
    private String doctorNo;

    /**
     * 计价日期
     */
    private Date todayDate;

    /**
     * 门诊科目
     */
    private String subjectNo;

    /**
     * 计价员号
     */
    private String opera;

    /**
     * 处方流水号
     */
    private Integer presNumber;

    /**
     * 日结标记(1.已日结 0.没日结)
     */
    private Integer todayTotalYn;

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
        Prescription other = (Prescription) that;
        return (this.getPersonsNo() == null ? other.getPersonsNo() == null : this.getPersonsNo().equals(other.getPersonsNo()))
            && (this.getMediNo() == null ? other.getMediNo() == null : this.getMediNo().equals(other.getMediNo()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPay() == null ? other.getPay() == null : this.getPay().equals(other.getPay()))
            && (this.getMediMoney() == null ? other.getMediMoney() == null : this.getMediMoney().equals(other.getMediMoney()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getDoctorNo() == null ? other.getDoctorNo() == null : this.getDoctorNo().equals(other.getDoctorNo()))
            && (this.getTodayDate() == null ? other.getTodayDate() == null : this.getTodayDate().equals(other.getTodayDate()))
            && (this.getSubjectNo() == null ? other.getSubjectNo() == null : this.getSubjectNo().equals(other.getSubjectNo()))
            && (this.getOpera() == null ? other.getOpera() == null : this.getOpera().equals(other.getOpera()))
            && (this.getPresNumber() == null ? other.getPresNumber() == null : this.getPresNumber().equals(other.getPresNumber()))
            && (this.getTodayTotalYn() == null ? other.getTodayTotalYn() == null : this.getTodayTotalYn().equals(other.getTodayTotalYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonsNo() == null) ? 0 : getPersonsNo().hashCode());
        result = prime * result + ((getMediNo() == null) ? 0 : getMediNo().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPay() == null) ? 0 : getPay().hashCode());
        result = prime * result + ((getMediMoney() == null) ? 0 : getMediMoney().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getDoctorNo() == null) ? 0 : getDoctorNo().hashCode());
        result = prime * result + ((getTodayDate() == null) ? 0 : getTodayDate().hashCode());
        result = prime * result + ((getSubjectNo() == null) ? 0 : getSubjectNo().hashCode());
        result = prime * result + ((getOpera() == null) ? 0 : getOpera().hashCode());
        result = prime * result + ((getPresNumber() == null) ? 0 : getPresNumber().hashCode());
        result = prime * result + ((getTodayTotalYn() == null) ? 0 : getTodayTotalYn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personsNo=").append(personsNo);
        sb.append(", mediNo=").append(mediNo);
        sb.append(", quantity=").append(quantity);
        sb.append(", pay=").append(pay);
        sb.append(", mediMoney=").append(mediMoney);
        sb.append(", unit=").append(unit);
        sb.append(", doctorNo=").append(doctorNo);
        sb.append(", todayDate=").append(todayDate);
        sb.append(", subjectNo=").append(subjectNo);
        sb.append(", opera=").append(opera);
        sb.append(", presNumber=").append(presNumber);
        sb.append(", todayTotalYn=").append(todayTotalYn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}