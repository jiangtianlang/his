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
 * @TableName persons
 */
@TableName(value ="persons")
@Data
public class Persons implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 非空
     */
    private String personName;

    /**
     * 按学校统一编码
     */
    private String departmentNo;

    /**
     * 按高教统一编码
     */
    private String titleNo;

    /**
     * 男，女
     */
    private String personSex;

    /**
     * 由医院编码01-99, 非空
     */
    private String chargeNo;

    /**
     * 
     */
    private String personTel;

    /**
     * 
     */
    private String personAddress;

    /**
     * 对固定金卡所扣剩下的余额
     */
    private Double personMoney;

    /**
     * 
     */
    private Date birthDate;

    /**
     * 
     */
    private Date registerDate;

    /**
     * 
     */
    private String cardMark;

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
        Persons other = (Persons) that;
        return (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getPersonName() == null ? other.getPersonName() == null : this.getPersonName().equals(other.getPersonName()))
            && (this.getDepartmentNo() == null ? other.getDepartmentNo() == null : this.getDepartmentNo().equals(other.getDepartmentNo()))
            && (this.getTitleNo() == null ? other.getTitleNo() == null : this.getTitleNo().equals(other.getTitleNo()))
            && (this.getPersonSex() == null ? other.getPersonSex() == null : this.getPersonSex().equals(other.getPersonSex()))
            && (this.getChargeNo() == null ? other.getChargeNo() == null : this.getChargeNo().equals(other.getChargeNo()))
            && (this.getPersonTel() == null ? other.getPersonTel() == null : this.getPersonTel().equals(other.getPersonTel()))
            && (this.getPersonAddress() == null ? other.getPersonAddress() == null : this.getPersonAddress().equals(other.getPersonAddress()))
            && (this.getPersonMoney() == null ? other.getPersonMoney() == null : this.getPersonMoney().equals(other.getPersonMoney()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getCardMark() == null ? other.getCardMark() == null : this.getCardMark().equals(other.getCardMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        result = prime * result + ((getDepartmentNo() == null) ? 0 : getDepartmentNo().hashCode());
        result = prime * result + ((getTitleNo() == null) ? 0 : getTitleNo().hashCode());
        result = prime * result + ((getPersonSex() == null) ? 0 : getPersonSex().hashCode());
        result = prime * result + ((getChargeNo() == null) ? 0 : getChargeNo().hashCode());
        result = prime * result + ((getPersonTel() == null) ? 0 : getPersonTel().hashCode());
        result = prime * result + ((getPersonAddress() == null) ? 0 : getPersonAddress().hashCode());
        result = prime * result + ((getPersonMoney() == null) ? 0 : getPersonMoney().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getCardMark() == null) ? 0 : getCardMark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personNo=").append(personNo);
        sb.append(", personName=").append(personName);
        sb.append(", departmentNo=").append(departmentNo);
        sb.append(", titleNo=").append(titleNo);
        sb.append(", personSex=").append(personSex);
        sb.append(", chargeNo=").append(chargeNo);
        sb.append(", personTel=").append(personTel);
        sb.append(", personAddress=").append(personAddress);
        sb.append(", personMoney=").append(personMoney);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", cardMark=").append(cardMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}