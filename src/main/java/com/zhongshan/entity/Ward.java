package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ward
 */
@TableName(value ="ward")
@Data
public class Ward implements Serializable {
    /**
     * 床号
     */
    @TableId
    private String bedNo;

    /**
     * 科别
     */
    private String section;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

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
        Ward other = (Ward) that;
        return (this.getBedNo() == null ? other.getBedNo() == null : this.getBedNo().equals(other.getBedNo()))
            && (this.getSection() == null ? other.getSection() == null : this.getSection().equals(other.getSection()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientSex() == null ? other.getPatientSex() == null : this.getPatientSex().equals(other.getPatientSex()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBedNo() == null) ? 0 : getBedNo().hashCode());
        result = prime * result + ((getSection() == null) ? 0 : getSection().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientSex() == null) ? 0 : getPatientSex().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bedNo=").append(bedNo);
        sb.append(", section=").append(section);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientSex=").append(patientSex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}