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
 * @TableName person_base
 */
@TableName(value ="person_base")
@Data
public class PersonBase implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String sectionNo;

    /**
     * 非空
     */
    private String personNo;

    /**
     * 
     */
    private String spellNo;

    /**
     * 非空
     */
    private String personName;

    /**
     * 
     */
    private String anotherNo;

    /**
     * 非空
     */
    private String personSex;

    /**
     * 
     */
    private Date birthDate;

    /**
     * 
     */
    private String capacityNo;

    /**
     * 非空。t--已婚 f—未婚
     */
    private String marry;

    /**
     * 编码
     */
    private String nativePlace;

    /**
     * 编码
     */
    private String nation;

    /**
     * 编码
     */
    private String birthPlace;

    /**
     * 
     */
    private String finishDate;

    /**
     * 
     */
    private String finishSchool;

    /**
     * 
     */
    private String familyAddres;

    /**
     * 编码
     */
    private String degree;

    /**
     * 
     */
    private String degreeDate;

    /**
     * 编码
     */
    private String highSchooling;

    /**
     * 
     */
    private String schoolName;

    /**
     * 编码
     */
    private String postNo;

    /**
     * 编码
     */
    private String titleNo;

    /**
     * 
     */
    private String postDate;

    /**
     * 
     */
    private Double postWage;

    /**
     * 
     */
    private String health;

    /**
     * 
     */
    private String inParty;

    /**
     * 
     */
    private String portyDate;

    /**
     * 
     */
    private String inWorkDate;

    /**
     * 
     */
    private String inZsuDate;

    /**
     * 
     */
    private String specialityDate;

    /**
     * 
     */
    private String remarks;

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
        PersonBase other = (PersonBase) that;
        return (this.getSectionNo() == null ? other.getSectionNo() == null : this.getSectionNo().equals(other.getSectionNo()))
            && (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getSpellNo() == null ? other.getSpellNo() == null : this.getSpellNo().equals(other.getSpellNo()))
            && (this.getPersonName() == null ? other.getPersonName() == null : this.getPersonName().equals(other.getPersonName()))
            && (this.getAnotherNo() == null ? other.getAnotherNo() == null : this.getAnotherNo().equals(other.getAnotherNo()))
            && (this.getPersonSex() == null ? other.getPersonSex() == null : this.getPersonSex().equals(other.getPersonSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getCapacityNo() == null ? other.getCapacityNo() == null : this.getCapacityNo().equals(other.getCapacityNo()))
            && (this.getMarry() == null ? other.getMarry() == null : this.getMarry().equals(other.getMarry()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getBirthPlace() == null ? other.getBirthPlace() == null : this.getBirthPlace().equals(other.getBirthPlace()))
            && (this.getFinishDate() == null ? other.getFinishDate() == null : this.getFinishDate().equals(other.getFinishDate()))
            && (this.getFinishSchool() == null ? other.getFinishSchool() == null : this.getFinishSchool().equals(other.getFinishSchool()))
            && (this.getFamilyAddres() == null ? other.getFamilyAddres() == null : this.getFamilyAddres().equals(other.getFamilyAddres()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getDegreeDate() == null ? other.getDegreeDate() == null : this.getDegreeDate().equals(other.getDegreeDate()))
            && (this.getHighSchooling() == null ? other.getHighSchooling() == null : this.getHighSchooling().equals(other.getHighSchooling()))
            && (this.getSchoolName() == null ? other.getSchoolName() == null : this.getSchoolName().equals(other.getSchoolName()))
            && (this.getPostNo() == null ? other.getPostNo() == null : this.getPostNo().equals(other.getPostNo()))
            && (this.getTitleNo() == null ? other.getTitleNo() == null : this.getTitleNo().equals(other.getTitleNo()))
            && (this.getPostDate() == null ? other.getPostDate() == null : this.getPostDate().equals(other.getPostDate()))
            && (this.getPostWage() == null ? other.getPostWage() == null : this.getPostWage().equals(other.getPostWage()))
            && (this.getHealth() == null ? other.getHealth() == null : this.getHealth().equals(other.getHealth()))
            && (this.getInParty() == null ? other.getInParty() == null : this.getInParty().equals(other.getInParty()))
            && (this.getPortyDate() == null ? other.getPortyDate() == null : this.getPortyDate().equals(other.getPortyDate()))
            && (this.getInWorkDate() == null ? other.getInWorkDate() == null : this.getInWorkDate().equals(other.getInWorkDate()))
            && (this.getInZsuDate() == null ? other.getInZsuDate() == null : this.getInZsuDate().equals(other.getInZsuDate()))
            && (this.getSpecialityDate() == null ? other.getSpecialityDate() == null : this.getSpecialityDate().equals(other.getSpecialityDate()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSectionNo() == null) ? 0 : getSectionNo().hashCode());
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getSpellNo() == null) ? 0 : getSpellNo().hashCode());
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        result = prime * result + ((getAnotherNo() == null) ? 0 : getAnotherNo().hashCode());
        result = prime * result + ((getPersonSex() == null) ? 0 : getPersonSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getCapacityNo() == null) ? 0 : getCapacityNo().hashCode());
        result = prime * result + ((getMarry() == null) ? 0 : getMarry().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getBirthPlace() == null) ? 0 : getBirthPlace().hashCode());
        result = prime * result + ((getFinishDate() == null) ? 0 : getFinishDate().hashCode());
        result = prime * result + ((getFinishSchool() == null) ? 0 : getFinishSchool().hashCode());
        result = prime * result + ((getFamilyAddres() == null) ? 0 : getFamilyAddres().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getDegreeDate() == null) ? 0 : getDegreeDate().hashCode());
        result = prime * result + ((getHighSchooling() == null) ? 0 : getHighSchooling().hashCode());
        result = prime * result + ((getSchoolName() == null) ? 0 : getSchoolName().hashCode());
        result = prime * result + ((getPostNo() == null) ? 0 : getPostNo().hashCode());
        result = prime * result + ((getTitleNo() == null) ? 0 : getTitleNo().hashCode());
        result = prime * result + ((getPostDate() == null) ? 0 : getPostDate().hashCode());
        result = prime * result + ((getPostWage() == null) ? 0 : getPostWage().hashCode());
        result = prime * result + ((getHealth() == null) ? 0 : getHealth().hashCode());
        result = prime * result + ((getInParty() == null) ? 0 : getInParty().hashCode());
        result = prime * result + ((getPortyDate() == null) ? 0 : getPortyDate().hashCode());
        result = prime * result + ((getInWorkDate() == null) ? 0 : getInWorkDate().hashCode());
        result = prime * result + ((getInZsuDate() == null) ? 0 : getInZsuDate().hashCode());
        result = prime * result + ((getSpecialityDate() == null) ? 0 : getSpecialityDate().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sectionNo=").append(sectionNo);
        sb.append(", personNo=").append(personNo);
        sb.append(", spellNo=").append(spellNo);
        sb.append(", personName=").append(personName);
        sb.append(", anotherNo=").append(anotherNo);
        sb.append(", personSex=").append(personSex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", capacityNo=").append(capacityNo);
        sb.append(", marry=").append(marry);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", nation=").append(nation);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", finishSchool=").append(finishSchool);
        sb.append(", familyAddres=").append(familyAddres);
        sb.append(", degree=").append(degree);
        sb.append(", degreeDate=").append(degreeDate);
        sb.append(", highSchooling=").append(highSchooling);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", postNo=").append(postNo);
        sb.append(", titleNo=").append(titleNo);
        sb.append(", postDate=").append(postDate);
        sb.append(", postWage=").append(postWage);
        sb.append(", health=").append(health);
        sb.append(", inParty=").append(inParty);
        sb.append(", portyDate=").append(portyDate);
        sb.append(", inWorkDate=").append(inWorkDate);
        sb.append(", inZsuDate=").append(inZsuDate);
        sb.append(", specialityDate=").append(specialityDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}