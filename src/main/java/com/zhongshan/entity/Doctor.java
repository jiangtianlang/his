package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName doctor
 */
@TableName(value ="doctor")
@Data
public class Doctor implements Serializable {
    /**
     * 医生代号
     */
    @TableId
    private String doctorNo;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 科室代号
     */
    private String subjectNo;

    /**
     * 科室名称
     */
    private String subjectName;

    /**
     * 兼科代号
     */
    private String subjectNo1;

    /**
     * 工资代号
     */
    private String personNo;

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
        Doctor other = (Doctor) that;
        return (this.getDoctorNo() == null ? other.getDoctorNo() == null : this.getDoctorNo().equals(other.getDoctorNo()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()))
            && (this.getSubjectNo() == null ? other.getSubjectNo() == null : this.getSubjectNo().equals(other.getSubjectNo()))
            && (this.getSubjectName() == null ? other.getSubjectName() == null : this.getSubjectName().equals(other.getSubjectName()))
            && (this.getSubjectNo1() == null ? other.getSubjectNo1() == null : this.getSubjectNo1().equals(other.getSubjectNo1()))
            && (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctorNo() == null) ? 0 : getDoctorNo().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        result = prime * result + ((getSubjectNo() == null) ? 0 : getSubjectNo().hashCode());
        result = prime * result + ((getSubjectName() == null) ? 0 : getSubjectName().hashCode());
        result = prime * result + ((getSubjectNo1() == null) ? 0 : getSubjectNo1().hashCode());
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorNo=").append(doctorNo);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", subjectNo=").append(subjectNo);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", subjectNo1=").append(subjectNo1);
        sb.append(", personNo=").append(personNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}