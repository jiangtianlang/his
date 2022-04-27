package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName check_standard
 */
@TableName(value ="check_standard")
@Data
public class CheckStandard implements Serializable {
    /**
     * 检查项目代号
     */
    @TableId
    private String checkNo;

    /**
     * 名称
     */
    private String checkName;

    /**
     * 价格
     */
    private Double checkPay;

    /**
     * 单位
     */
    private String checkUnit;

    /**
     * 类型
     */
    private String checkType;

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
        CheckStandard other = (CheckStandard) that;
        return (this.getCheckNo() == null ? other.getCheckNo() == null : this.getCheckNo().equals(other.getCheckNo()))
            && (this.getCheckName() == null ? other.getCheckName() == null : this.getCheckName().equals(other.getCheckName()))
            && (this.getCheckPay() == null ? other.getCheckPay() == null : this.getCheckPay().equals(other.getCheckPay()))
            && (this.getCheckUnit() == null ? other.getCheckUnit() == null : this.getCheckUnit().equals(other.getCheckUnit()))
            && (this.getCheckType() == null ? other.getCheckType() == null : this.getCheckType().equals(other.getCheckType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckNo() == null) ? 0 : getCheckNo().hashCode());
        result = prime * result + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        result = prime * result + ((getCheckPay() == null) ? 0 : getCheckPay().hashCode());
        result = prime * result + ((getCheckUnit() == null) ? 0 : getCheckUnit().hashCode());
        result = prime * result + ((getCheckType() == null) ? 0 : getCheckType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkNo=").append(checkNo);
        sb.append(", checkName=").append(checkName);
        sb.append(", checkPay=").append(checkPay);
        sb.append(", checkUnit=").append(checkUnit);
        sb.append(", checkType=").append(checkType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}