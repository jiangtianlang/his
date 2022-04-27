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
 * @TableName pay_money
 */
@TableName(value ="pay_money")
@Data
public class PayMoney implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 交款日期
     */
    private Date paydate;

    /**
     * 病人姓名
     */
    private String patientName;

    /**
     * 预交款
     */
    private Double money;

    /**
     * 出院否
     */
    private Integer outFlag;

    /**
     * 出院日期
     */
    private Date outDate;

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
        PayMoney other = (PayMoney) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getOutFlag() == null ? other.getOutFlag() == null : this.getOutFlag().equals(other.getOutFlag()))
            && (this.getOutDate() == null ? other.getOutDate() == null : this.getOutDate().equals(other.getOutDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getOutFlag() == null) ? 0 : getOutFlag().hashCode());
        result = prime * result + ((getOutDate() == null) ? 0 : getOutDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientNo=").append(patientNo);
        sb.append(", paydate=").append(paydate);
        sb.append(", patientName=").append(patientName);
        sb.append(", money=").append(money);
        sb.append(", outFlag=").append(outFlag);
        sb.append(", outDate=").append(outDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}