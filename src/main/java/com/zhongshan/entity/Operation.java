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
 * @TableName operation
 */
@TableName(value ="operation")
@Data
public class Operation implements Serializable {
    /**
     * 非空，每个病人病案号唯一
     */
    @TableId
    private String operationNum;

    /**
     * 非空
     */
    private Integer operationTimes;

    /**
     * 
     */
    private Date operationDate;

    /**
     * 
     */
    private String operationName;

    /**
     * icd-9编码
     */
    private String operationCode;

    /**
     * 静脉麻|吸入麻|局麻|硬膜外麻|硬膜外麻+局麻|静脉麻+局麻
     */
    private String operationHocus;

    /**
     * 手术野 + 伤口愈合情况
     */
    private String operationCut;

    /**
     * 
     */
    private String operationDoctorName;

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
        Operation other = (Operation) that;
        return (this.getOperationNum() == null ? other.getOperationNum() == null : this.getOperationNum().equals(other.getOperationNum()))
            && (this.getOperationTimes() == null ? other.getOperationTimes() == null : this.getOperationTimes().equals(other.getOperationTimes()))
            && (this.getOperationDate() == null ? other.getOperationDate() == null : this.getOperationDate().equals(other.getOperationDate()))
            && (this.getOperationName() == null ? other.getOperationName() == null : this.getOperationName().equals(other.getOperationName()))
            && (this.getOperationCode() == null ? other.getOperationCode() == null : this.getOperationCode().equals(other.getOperationCode()))
            && (this.getOperationHocus() == null ? other.getOperationHocus() == null : this.getOperationHocus().equals(other.getOperationHocus()))
            && (this.getOperationCut() == null ? other.getOperationCut() == null : this.getOperationCut().equals(other.getOperationCut()))
            && (this.getOperationDoctorName() == null ? other.getOperationDoctorName() == null : this.getOperationDoctorName().equals(other.getOperationDoctorName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationNum() == null) ? 0 : getOperationNum().hashCode());
        result = prime * result + ((getOperationTimes() == null) ? 0 : getOperationTimes().hashCode());
        result = prime * result + ((getOperationDate() == null) ? 0 : getOperationDate().hashCode());
        result = prime * result + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        result = prime * result + ((getOperationCode() == null) ? 0 : getOperationCode().hashCode());
        result = prime * result + ((getOperationHocus() == null) ? 0 : getOperationHocus().hashCode());
        result = prime * result + ((getOperationCut() == null) ? 0 : getOperationCut().hashCode());
        result = prime * result + ((getOperationDoctorName() == null) ? 0 : getOperationDoctorName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationNum=").append(operationNum);
        sb.append(", operationTimes=").append(operationTimes);
        sb.append(", operationDate=").append(operationDate);
        sb.append(", operationName=").append(operationName);
        sb.append(", operationCode=").append(operationCode);
        sb.append(", operationHocus=").append(operationHocus);
        sb.append(", operationCut=").append(operationCut);
        sb.append(", operationDoctorName=").append(operationDoctorName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}