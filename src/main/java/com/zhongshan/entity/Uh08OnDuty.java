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
 * @TableName uh08_on_duty
 */
@TableName(value ="uh08_on_duty")
@Data
public class Uh08OnDuty implements Serializable {
    /**
     * 
     */
    @TableId
    private String staffNo;

    /**
     * 
     */
    private String department;

    /**
     * 上班日期
     */
    private Date workDate;

    /**
     * 分正01常班、02值班、03早班、04中班、05晚班
     */
    private String branchOfWork;

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
        Uh08OnDuty other = (Uh08OnDuty) that;
        return (this.getStaffNo() == null ? other.getStaffNo() == null : this.getStaffNo().equals(other.getStaffNo()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getWorkDate() == null ? other.getWorkDate() == null : this.getWorkDate().equals(other.getWorkDate()))
            && (this.getBranchOfWork() == null ? other.getBranchOfWork() == null : this.getBranchOfWork().equals(other.getBranchOfWork()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStaffNo() == null) ? 0 : getStaffNo().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getWorkDate() == null) ? 0 : getWorkDate().hashCode());
        result = prime * result + ((getBranchOfWork() == null) ? 0 : getBranchOfWork().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staffNo=").append(staffNo);
        sb.append(", department=").append(department);
        sb.append(", workDate=").append(workDate);
        sb.append(", branchOfWork=").append(branchOfWork);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}