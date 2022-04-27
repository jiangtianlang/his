package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh03_company_list
 */
@TableName(value ="uh03_company_list")
@Data
public class Uh03CompanyList implements Serializable {
    /**
     * 供应商代码
     */
    @TableId
    private String comNo;

    /**
     * 供应商名称
     */
    private String comName;

    /**
     * 地址
     */
    private String comAddress;

    /**
     * 联系电话
     */
    private String contactTel;

    /**
     * 联系人
     */
    private String contactPer;

    /**
     * 类别,1—供应商，
2—领药部门
     */
    private Integer comType;

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
        Uh03CompanyList other = (Uh03CompanyList) that;
        return (this.getComNo() == null ? other.getComNo() == null : this.getComNo().equals(other.getComNo()))
            && (this.getComName() == null ? other.getComName() == null : this.getComName().equals(other.getComName()))
            && (this.getComAddress() == null ? other.getComAddress() == null : this.getComAddress().equals(other.getComAddress()))
            && (this.getContactTel() == null ? other.getContactTel() == null : this.getContactTel().equals(other.getContactTel()))
            && (this.getContactPer() == null ? other.getContactPer() == null : this.getContactPer().equals(other.getContactPer()))
            && (this.getComType() == null ? other.getComType() == null : this.getComType().equals(other.getComType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComNo() == null) ? 0 : getComNo().hashCode());
        result = prime * result + ((getComName() == null) ? 0 : getComName().hashCode());
        result = prime * result + ((getComAddress() == null) ? 0 : getComAddress().hashCode());
        result = prime * result + ((getContactTel() == null) ? 0 : getContactTel().hashCode());
        result = prime * result + ((getContactPer() == null) ? 0 : getContactPer().hashCode());
        result = prime * result + ((getComType() == null) ? 0 : getComType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", comNo=").append(comNo);
        sb.append(", comName=").append(comName);
        sb.append(", comAddress=").append(comAddress);
        sb.append(", contactTel=").append(contactTel);
        sb.append(", contactPer=").append(contactPer);
        sb.append(", comType=").append(comType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}