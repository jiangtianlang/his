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
 * @TableName uh04_ward_bed_sum
 */
@TableName(value ="uh04_ward_bed_sum")
@Data
public class Uh04WardBedSum implements Serializable {
    /**
     * 日期
     */
    private Date totalDate;

    /**
     * 有效床位数
     */
    private Integer validBedNumber;

    /**
     * 占用床位数
     */
    private Integer useBedNumber;

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
        Uh04WardBedSum other = (Uh04WardBedSum) that;
        return (this.getTotalDate() == null ? other.getTotalDate() == null : this.getTotalDate().equals(other.getTotalDate()))
            && (this.getValidBedNumber() == null ? other.getValidBedNumber() == null : this.getValidBedNumber().equals(other.getValidBedNumber()))
            && (this.getUseBedNumber() == null ? other.getUseBedNumber() == null : this.getUseBedNumber().equals(other.getUseBedNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTotalDate() == null) ? 0 : getTotalDate().hashCode());
        result = prime * result + ((getValidBedNumber() == null) ? 0 : getValidBedNumber().hashCode());
        result = prime * result + ((getUseBedNumber() == null) ? 0 : getUseBedNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", totalDate=").append(totalDate);
        sb.append(", validBedNumber=").append(validBedNumber);
        sb.append(", useBedNumber=").append(useBedNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}