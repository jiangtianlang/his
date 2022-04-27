package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName case_history
 */
@TableName(value ="case_history")
@Data
public class CaseHistory implements Serializable {
    /**
     * 非空，每个病人病案号唯一
     */
    @TableId
    private String chNum;

    /**
     * 非空
     */
    private Integer chTimes;

    /**
     * 非空
     */
    private String chName;

    /**
     * 
     */
    private String chDepartment;

    /**
     * 
     */
    private String chBed;

    /**
     * 
     */
    private Integer chXRayNum;

    /**
     * 
     */
    private Integer chCardiographNum;

    /**
     * 
     */
    private Integer chElectroencephogramNum;

    /**
     * 
     */
    private Integer chPathologyNum;

    /**
     * 
     */
    private String chInStatus;

    /**
     * 
     */
    private String chCureCourse;

    /**
     * 
     */
    private String chOutStatus;

    /**
     * 
     */
    private String chOutDoctorAdvice;

    /**
     * 
     */
    private String chSignatureDirectorDoctor;

    /**
     * 
     */
    private String chSignatureChargeDoctor;

    /**
     * 
     */
    private String chSignatureHouseDoctor;

    /**
     * 
     */
    private String chSignatureIntern;

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
        CaseHistory other = (CaseHistory) that;
        return (this.getChNum() == null ? other.getChNum() == null : this.getChNum().equals(other.getChNum()))
            && (this.getChTimes() == null ? other.getChTimes() == null : this.getChTimes().equals(other.getChTimes()))
            && (this.getChName() == null ? other.getChName() == null : this.getChName().equals(other.getChName()))
            && (this.getChDepartment() == null ? other.getChDepartment() == null : this.getChDepartment().equals(other.getChDepartment()))
            && (this.getChBed() == null ? other.getChBed() == null : this.getChBed().equals(other.getChBed()))
            && (this.getChXRayNum() == null ? other.getChXRayNum() == null : this.getChXRayNum().equals(other.getChXRayNum()))
            && (this.getChCardiographNum() == null ? other.getChCardiographNum() == null : this.getChCardiographNum().equals(other.getChCardiographNum()))
            && (this.getChElectroencephogramNum() == null ? other.getChElectroencephogramNum() == null : this.getChElectroencephogramNum().equals(other.getChElectroencephogramNum()))
            && (this.getChPathologyNum() == null ? other.getChPathologyNum() == null : this.getChPathologyNum().equals(other.getChPathologyNum()))
            && (this.getChInStatus() == null ? other.getChInStatus() == null : this.getChInStatus().equals(other.getChInStatus()))
            && (this.getChCureCourse() == null ? other.getChCureCourse() == null : this.getChCureCourse().equals(other.getChCureCourse()))
            && (this.getChOutStatus() == null ? other.getChOutStatus() == null : this.getChOutStatus().equals(other.getChOutStatus()))
            && (this.getChOutDoctorAdvice() == null ? other.getChOutDoctorAdvice() == null : this.getChOutDoctorAdvice().equals(other.getChOutDoctorAdvice()))
            && (this.getChSignatureDirectorDoctor() == null ? other.getChSignatureDirectorDoctor() == null : this.getChSignatureDirectorDoctor().equals(other.getChSignatureDirectorDoctor()))
            && (this.getChSignatureChargeDoctor() == null ? other.getChSignatureChargeDoctor() == null : this.getChSignatureChargeDoctor().equals(other.getChSignatureChargeDoctor()))
            && (this.getChSignatureHouseDoctor() == null ? other.getChSignatureHouseDoctor() == null : this.getChSignatureHouseDoctor().equals(other.getChSignatureHouseDoctor()))
            && (this.getChSignatureIntern() == null ? other.getChSignatureIntern() == null : this.getChSignatureIntern().equals(other.getChSignatureIntern()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChNum() == null) ? 0 : getChNum().hashCode());
        result = prime * result + ((getChTimes() == null) ? 0 : getChTimes().hashCode());
        result = prime * result + ((getChName() == null) ? 0 : getChName().hashCode());
        result = prime * result + ((getChDepartment() == null) ? 0 : getChDepartment().hashCode());
        result = prime * result + ((getChBed() == null) ? 0 : getChBed().hashCode());
        result = prime * result + ((getChXRayNum() == null) ? 0 : getChXRayNum().hashCode());
        result = prime * result + ((getChCardiographNum() == null) ? 0 : getChCardiographNum().hashCode());
        result = prime * result + ((getChElectroencephogramNum() == null) ? 0 : getChElectroencephogramNum().hashCode());
        result = prime * result + ((getChPathologyNum() == null) ? 0 : getChPathologyNum().hashCode());
        result = prime * result + ((getChInStatus() == null) ? 0 : getChInStatus().hashCode());
        result = prime * result + ((getChCureCourse() == null) ? 0 : getChCureCourse().hashCode());
        result = prime * result + ((getChOutStatus() == null) ? 0 : getChOutStatus().hashCode());
        result = prime * result + ((getChOutDoctorAdvice() == null) ? 0 : getChOutDoctorAdvice().hashCode());
        result = prime * result + ((getChSignatureDirectorDoctor() == null) ? 0 : getChSignatureDirectorDoctor().hashCode());
        result = prime * result + ((getChSignatureChargeDoctor() == null) ? 0 : getChSignatureChargeDoctor().hashCode());
        result = prime * result + ((getChSignatureHouseDoctor() == null) ? 0 : getChSignatureHouseDoctor().hashCode());
        result = prime * result + ((getChSignatureIntern() == null) ? 0 : getChSignatureIntern().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chNum=").append(chNum);
        sb.append(", chTimes=").append(chTimes);
        sb.append(", chName=").append(chName);
        sb.append(", chDepartment=").append(chDepartment);
        sb.append(", chBed=").append(chBed);
        sb.append(", chXRayNum=").append(chXRayNum);
        sb.append(", chCardiographNum=").append(chCardiographNum);
        sb.append(", chElectroencephogramNum=").append(chElectroencephogramNum);
        sb.append(", chPathologyNum=").append(chPathologyNum);
        sb.append(", chInStatus=").append(chInStatus);
        sb.append(", chCureCourse=").append(chCureCourse);
        sb.append(", chOutStatus=").append(chOutStatus);
        sb.append(", chOutDoctorAdvice=").append(chOutDoctorAdvice);
        sb.append(", chSignatureDirectorDoctor=").append(chSignatureDirectorDoctor);
        sb.append(", chSignatureChargeDoctor=").append(chSignatureChargeDoctor);
        sb.append(", chSignatureHouseDoctor=").append(chSignatureHouseDoctor);
        sb.append(", chSignatureIntern=").append(chSignatureIntern);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}