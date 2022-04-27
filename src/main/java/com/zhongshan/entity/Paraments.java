package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName paraments
 */
@TableName(value ="paraments")
@Data
public class Paraments implements Serializable {
    /**
     * 
     */
    @TableId
    private String paramentNo;

    /**
     * 
     */
    private String paramentValue;

    /**
     * 
     */
    private String remark;

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
        Paraments other = (Paraments) that;
        return (this.getParamentNo() == null ? other.getParamentNo() == null : this.getParamentNo().equals(other.getParamentNo()))
            && (this.getParamentValue() == null ? other.getParamentValue() == null : this.getParamentValue().equals(other.getParamentValue()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParamentNo() == null) ? 0 : getParamentNo().hashCode());
        result = prime * result + ((getParamentValue() == null) ? 0 : getParamentValue().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paramentNo=").append(paramentNo);
        sb.append(", paramentValue=").append(paramentValue);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}