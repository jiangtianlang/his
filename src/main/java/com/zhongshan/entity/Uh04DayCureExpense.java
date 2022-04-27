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
 * @TableName uh04_day_cure_expense
 */
@TableName(value ="uh04_day_cure_expense")
@Data
public class Uh04DayCureExpense implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 日期
     */
    private Date cureDate;

    /**
     * 科目码
     */
    private String subjectCode;

    /**
     * 本日发生数
     */
    private Double ownExpense;

    /**
     * 出院否
     */
    private String outHospitalFlag;

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
        Uh04DayCureExpense other = (Uh04DayCureExpense) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getCureDate() == null ? other.getCureDate() == null : this.getCureDate().equals(other.getCureDate()))
            && (this.getSubjectCode() == null ? other.getSubjectCode() == null : this.getSubjectCode().equals(other.getSubjectCode()))
            && (this.getOwnExpense() == null ? other.getOwnExpense() == null : this.getOwnExpense().equals(other.getOwnExpense()))
            && (this.getOutHospitalFlag() == null ? other.getOutHospitalFlag() == null : this.getOutHospitalFlag().equals(other.getOutHospitalFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getCureDate() == null) ? 0 : getCureDate().hashCode());
        result = prime * result + ((getSubjectCode() == null) ? 0 : getSubjectCode().hashCode());
        result = prime * result + ((getOwnExpense() == null) ? 0 : getOwnExpense().hashCode());
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
        sb.append(", cureDate=").append(cureDate);
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", ownExpense=").append(ownExpense);
        sb.append(", outHospitalFlag=").append(outHospitalFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}