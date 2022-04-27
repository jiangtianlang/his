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
 * @TableName uh04_hospital_account
 */
@TableName(value ="uh04_hospital_account")
@Data
public class Uh04HospitalAccount implements Serializable {
    /**
     * 科目编码
     */
    private String subjectCode;

    /**
     * 日期
     */
    private Date accountDate;

    /**
     * 本日发生数
     */
    private Double dayMoney;

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
        Uh04HospitalAccount other = (Uh04HospitalAccount) that;
        return (this.getSubjectCode() == null ? other.getSubjectCode() == null : this.getSubjectCode().equals(other.getSubjectCode()))
            && (this.getAccountDate() == null ? other.getAccountDate() == null : this.getAccountDate().equals(other.getAccountDate()))
            && (this.getDayMoney() == null ? other.getDayMoney() == null : this.getDayMoney().equals(other.getDayMoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubjectCode() == null) ? 0 : getSubjectCode().hashCode());
        result = prime * result + ((getAccountDate() == null) ? 0 : getAccountDate().hashCode());
        result = prime * result + ((getDayMoney() == null) ? 0 : getDayMoney().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subjectCode=").append(subjectCode);
        sb.append(", accountDate=").append(accountDate);
        sb.append(", dayMoney=").append(dayMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}