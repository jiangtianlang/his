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
 * @TableName uh05_staff
 */
@TableName(value ="uh05_staff")
@Data
public class Uh05Staff implements Serializable {
    /**
     * 工资号
     */
    @TableId
    private String staffNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别(男，女)
     */
    private String sex;

    /**
     * 出生日期
     */
    private Date birthDate;

    /**
     * 部门代码
     */
    private String departmentNo;

    /**
     * 职称代码
     */
    private String titleNo;

    /**
     * 职务代码
     */
    private String postNo;

    /**
     * 级别
     */
    private String rank;

    /**
     * 籍贯代码
     */
    private String nativePlace;

    /**
     * 既往病史
     */
    private String mediHist;

    /**
     * 家族病史
     */
    private String mediHistFamily;

    /**
     * 家庭住址
     */
    private String homeAdd;

    /**
     * 住宅电话
     */
    private String homeTel;

    /**
     * 当前状态('1'-在职  '2'-调出  '3'-离休  
'4'-退休  '5'-死亡)
     */
    private String status;

    /**
     * 配偶姓名
     */
    private String spouseName;

    /**
     * 配偶单位
     */
    private String spouseOrga;

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
        Uh05Staff other = (Uh05Staff) that;
        return (this.getStaffNo() == null ? other.getStaffNo() == null : this.getStaffNo().equals(other.getStaffNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getDepartmentNo() == null ? other.getDepartmentNo() == null : this.getDepartmentNo().equals(other.getDepartmentNo()))
            && (this.getTitleNo() == null ? other.getTitleNo() == null : this.getTitleNo().equals(other.getTitleNo()))
            && (this.getPostNo() == null ? other.getPostNo() == null : this.getPostNo().equals(other.getPostNo()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getMediHist() == null ? other.getMediHist() == null : this.getMediHist().equals(other.getMediHist()))
            && (this.getMediHistFamily() == null ? other.getMediHistFamily() == null : this.getMediHistFamily().equals(other.getMediHistFamily()))
            && (this.getHomeAdd() == null ? other.getHomeAdd() == null : this.getHomeAdd().equals(other.getHomeAdd()))
            && (this.getHomeTel() == null ? other.getHomeTel() == null : this.getHomeTel().equals(other.getHomeTel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSpouseName() == null ? other.getSpouseName() == null : this.getSpouseName().equals(other.getSpouseName()))
            && (this.getSpouseOrga() == null ? other.getSpouseOrga() == null : this.getSpouseOrga().equals(other.getSpouseOrga()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStaffNo() == null) ? 0 : getStaffNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getDepartmentNo() == null) ? 0 : getDepartmentNo().hashCode());
        result = prime * result + ((getTitleNo() == null) ? 0 : getTitleNo().hashCode());
        result = prime * result + ((getPostNo() == null) ? 0 : getPostNo().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getMediHist() == null) ? 0 : getMediHist().hashCode());
        result = prime * result + ((getMediHistFamily() == null) ? 0 : getMediHistFamily().hashCode());
        result = prime * result + ((getHomeAdd() == null) ? 0 : getHomeAdd().hashCode());
        result = prime * result + ((getHomeTel() == null) ? 0 : getHomeTel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSpouseName() == null) ? 0 : getSpouseName().hashCode());
        result = prime * result + ((getSpouseOrga() == null) ? 0 : getSpouseOrga().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staffNo=").append(staffNo);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", departmentNo=").append(departmentNo);
        sb.append(", titleNo=").append(titleNo);
        sb.append(", postNo=").append(postNo);
        sb.append(", rank=").append(rank);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", mediHist=").append(mediHist);
        sb.append(", mediHistFamily=").append(mediHistFamily);
        sb.append(", homeAdd=").append(homeAdd);
        sb.append(", homeTel=").append(homeTel);
        sb.append(", status=").append(status);
        sb.append(", spouseName=").append(spouseName);
        sb.append(", spouseOrga=").append(spouseOrga);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}