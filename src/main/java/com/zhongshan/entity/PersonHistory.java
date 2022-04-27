package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName person_history
 */
@TableName(value ="person_history")
@Data
public class PersonHistory implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 非空
     */
    private String historyFrom;

    /**
     * 非空
     */
    private String historyTo;

    /**
     * 非空
     */
    private String workPlace;

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
        PersonHistory other = (PersonHistory) that;
        return (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getHistoryFrom() == null ? other.getHistoryFrom() == null : this.getHistoryFrom().equals(other.getHistoryFrom()))
            && (this.getHistoryTo() == null ? other.getHistoryTo() == null : this.getHistoryTo().equals(other.getHistoryTo()))
            && (this.getWorkPlace() == null ? other.getWorkPlace() == null : this.getWorkPlace().equals(other.getWorkPlace()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getHistoryFrom() == null) ? 0 : getHistoryFrom().hashCode());
        result = prime * result + ((getHistoryTo() == null) ? 0 : getHistoryTo().hashCode());
        result = prime * result + ((getWorkPlace() == null) ? 0 : getWorkPlace().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personNo=").append(personNo);
        sb.append(", historyFrom=").append(historyFrom);
        sb.append(", historyTo=").append(historyTo);
        sb.append(", workPlace=").append(workPlace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}