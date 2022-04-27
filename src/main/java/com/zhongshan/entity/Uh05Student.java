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
 * @TableName uh05_student
 */
@TableName(value ="uh05_student")
@Data
public class Uh05Student implements Serializable {
    /**
     * 学号
     */
    @TableId
    private String studentNo;

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
     * 籍贯
     */
    private String nativePlace;

    /**
     * 考区
     */
    private String arear;

    /**
     * 考号
     */
    private String examNo;

    /**
     * 既往病史
     */
    private String mediHist;

    /**
     * 家族病史
     */
    private String mediHistFamily;

    /**
     * 系所号
     */
    private String departmentNo;

    /**
     * 专业号(第1,2位：系所
第3位：类别
第4位：序号
第5,6位：年度)
     */
    private String majorFieldNo;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学历类别(博士 硕士
本科 专科)
     */
    private String degreeLevel;

    /**
     * 当前状态('S' - 休学
'L' - 退学
'F' - 毕业)
     */
    private String status;

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
        Uh05Student other = (Uh05Student) that;
        return (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getArear() == null ? other.getArear() == null : this.getArear().equals(other.getArear()))
            && (this.getExamNo() == null ? other.getExamNo() == null : this.getExamNo().equals(other.getExamNo()))
            && (this.getMediHist() == null ? other.getMediHist() == null : this.getMediHist().equals(other.getMediHist()))
            && (this.getMediHistFamily() == null ? other.getMediHistFamily() == null : this.getMediHistFamily().equals(other.getMediHistFamily()))
            && (this.getDepartmentNo() == null ? other.getDepartmentNo() == null : this.getDepartmentNo().equals(other.getDepartmentNo()))
            && (this.getMajorFieldNo() == null ? other.getMajorFieldNo() == null : this.getMajorFieldNo().equals(other.getMajorFieldNo()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getDegreeLevel() == null ? other.getDegreeLevel() == null : this.getDegreeLevel().equals(other.getDegreeLevel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getArear() == null) ? 0 : getArear().hashCode());
        result = prime * result + ((getExamNo() == null) ? 0 : getExamNo().hashCode());
        result = prime * result + ((getMediHist() == null) ? 0 : getMediHist().hashCode());
        result = prime * result + ((getMediHistFamily() == null) ? 0 : getMediHistFamily().hashCode());
        result = prime * result + ((getDepartmentNo() == null) ? 0 : getDepartmentNo().hashCode());
        result = prime * result + ((getMajorFieldNo() == null) ? 0 : getMajorFieldNo().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getDegreeLevel() == null) ? 0 : getDegreeLevel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentNo=").append(studentNo);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", arear=").append(arear);
        sb.append(", examNo=").append(examNo);
        sb.append(", mediHist=").append(mediHist);
        sb.append(", mediHistFamily=").append(mediHistFamily);
        sb.append(", departmentNo=").append(departmentNo);
        sb.append(", majorFieldNo=").append(majorFieldNo);
        sb.append(", grade=").append(grade);
        sb.append(", degreeLevel=").append(degreeLevel);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}