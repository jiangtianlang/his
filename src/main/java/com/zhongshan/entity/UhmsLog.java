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
 * @TableName uhms_log
 */
@TableName(value ="uhms_log")
@Data
public class UhmsLog implements Serializable {
    /**
     * 日志编号
     */
    @TableId(type = IdType.AUTO)
    private Integer logNo;

    /**
     * 子系统名
     */
    private String subSystemName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 进入操作时间
     */
    private Date inTime;

    /**
     * 操作内容
     */
    private String operation;

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
        UhmsLog other = (UhmsLog) that;
        return (this.getLogNo() == null ? other.getLogNo() == null : this.getLogNo().equals(other.getLogNo()))
            && (this.getSubSystemName() == null ? other.getSubSystemName() == null : this.getSubSystemName().equals(other.getSubSystemName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogNo() == null) ? 0 : getLogNo().hashCode());
        result = prime * result + ((getSubSystemName() == null) ? 0 : getSubSystemName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getInTime() == null) ? 0 : getInTime().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logNo=").append(logNo);
        sb.append(", subSystemName=").append(subSystemName);
        sb.append(", userName=").append(userName);
        sb.append(", inTime=").append(inTime);
        sb.append(", operation=").append(operation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}