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
 * @TableName uh04_own_expense
 */
@TableName(value ="uh04_own_expense")
@Data
public class Uh04OwnExpense implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 入院日期
     */
    private Date inHospitalDate;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 已交金额
     */
    private Double alreadyMoney;

    /**
     * 支出金额
     */
    private Double payMoney;

    /**
     * 1-已出院  0-未出院
     */
    private Boolean outHospitalFlag;

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
        Uh04OwnExpense other = (Uh04OwnExpense) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getInHospitalDate() == null ? other.getInHospitalDate() == null : this.getInHospitalDate().equals(other.getInHospitalDate()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getAlreadyMoney() == null ? other.getAlreadyMoney() == null : this.getAlreadyMoney().equals(other.getAlreadyMoney()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()))
            && (this.getOutHospitalFlag() == null ? other.getOutHospitalFlag() == null : this.getOutHospitalFlag().equals(other.getOutHospitalFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getInHospitalDate() == null) ? 0 : getInHospitalDate().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getAlreadyMoney() == null) ? 0 : getAlreadyMoney().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        result = prime * result + ((getOutHospitalFlag() == null) ? 0 : getOutHospitalFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientNo=").append(patientNo);
        sb.append(", inHospitalDate=").append(inHospitalDate);
        sb.append(", patientName=").append(patientName);
        sb.append(", alreadyMoney=").append(alreadyMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", outHospitalFlag=").append(outHospitalFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}