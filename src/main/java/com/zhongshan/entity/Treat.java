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
 * @TableName treat
 */
@TableName(value ="treat")
@Data
public class Treat implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;

    /**
     * 看病日期
     */
    private Date treatDate;

    /**
     * 药费总额
     */
    private Double mediTotal;

    /**
     * 应扣百分比
     */
    private Integer percentage;

    /**
     * 药品种类
     */
    private String mediType;

    /**
     * 挂号员号
     */
    private String opera;

    /**
     * 挂号标记(Y-已挂号，N-没挂号)
     */
    private String registerYn;

    /**
     *  打印标记
     */
    private Integer printNumber;

    /**
     * 处方流水号
     */
    private Integer presNumber;

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
        Treat other = (Treat) that;
        return (this.getPersonsNo() == null ? other.getPersonsNo() == null : this.getPersonsNo().equals(other.getPersonsNo()))
            && (this.getTreatDate() == null ? other.getTreatDate() == null : this.getTreatDate().equals(other.getTreatDate()))
            && (this.getMediTotal() == null ? other.getMediTotal() == null : this.getMediTotal().equals(other.getMediTotal()))
            && (this.getPercentage() == null ? other.getPercentage() == null : this.getPercentage().equals(other.getPercentage()))
            && (this.getMediType() == null ? other.getMediType() == null : this.getMediType().equals(other.getMediType()))
            && (this.getOpera() == null ? other.getOpera() == null : this.getOpera().equals(other.getOpera()))
            && (this.getRegisterYn() == null ? other.getRegisterYn() == null : this.getRegisterYn().equals(other.getRegisterYn()))
            && (this.getPrintNumber() == null ? other.getPrintNumber() == null : this.getPrintNumber().equals(other.getPrintNumber()))
            && (this.getPresNumber() == null ? other.getPresNumber() == null : this.getPresNumber().equals(other.getPresNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonsNo() == null) ? 0 : getPersonsNo().hashCode());
        result = prime * result + ((getTreatDate() == null) ? 0 : getTreatDate().hashCode());
        result = prime * result + ((getMediTotal() == null) ? 0 : getMediTotal().hashCode());
        result = prime * result + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        result = prime * result + ((getMediType() == null) ? 0 : getMediType().hashCode());
        result = prime * result + ((getOpera() == null) ? 0 : getOpera().hashCode());
        result = prime * result + ((getRegisterYn() == null) ? 0 : getRegisterYn().hashCode());
        result = prime * result + ((getPrintNumber() == null) ? 0 : getPrintNumber().hashCode());
        result = prime * result + ((getPresNumber() == null) ? 0 : getPresNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personsNo=").append(personsNo);
        sb.append(", treatDate=").append(treatDate);
        sb.append(", mediTotal=").append(mediTotal);
        sb.append(", percentage=").append(percentage);
        sb.append(", mediType=").append(mediType);
        sb.append(", opera=").append(opera);
        sb.append(", registerYn=").append(registerYn);
        sb.append(", printNumber=").append(printNumber);
        sb.append(", presNumber=").append(presNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}