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
 * @TableName day_money
 */
@TableName(value ="day_money")
@Data
public class DayMoney implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;

    /**
     * 追加日期
     */
    private Date dayDate;

    /**
     * 金额
     */
    private Double dayMoney;

    /**
     * 余额
     */
    private Double daySup;

    /**
     *  操作员号
     */
    private String opera;

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
        DayMoney other = (DayMoney) that;
        return (this.getPersonsNo() == null ? other.getPersonsNo() == null : this.getPersonsNo().equals(other.getPersonsNo()))
            && (this.getDayDate() == null ? other.getDayDate() == null : this.getDayDate().equals(other.getDayDate()))
            && (this.getDayMoney() == null ? other.getDayMoney() == null : this.getDayMoney().equals(other.getDayMoney()))
            && (this.getDaySup() == null ? other.getDaySup() == null : this.getDaySup().equals(other.getDaySup()))
            && (this.getOpera() == null ? other.getOpera() == null : this.getOpera().equals(other.getOpera()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonsNo() == null) ? 0 : getPersonsNo().hashCode());
        result = prime * result + ((getDayDate() == null) ? 0 : getDayDate().hashCode());
        result = prime * result + ((getDayMoney() == null) ? 0 : getDayMoney().hashCode());
        result = prime * result + ((getDaySup() == null) ? 0 : getDaySup().hashCode());
        result = prime * result + ((getOpera() == null) ? 0 : getOpera().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personsNo=").append(personsNo);
        sb.append(", dayDate=").append(dayDate);
        sb.append(", dayMoney=").append(dayMoney);
        sb.append(", daySup=").append(daySup);
        sb.append(", opera=").append(opera);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}