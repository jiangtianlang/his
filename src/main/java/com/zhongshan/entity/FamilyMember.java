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
 * @TableName family_member
 */
@TableName(value ="family_member")
@Data
public class FamilyMember implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 非空
     */
    private String memberName;

    /**
     * 非空
     */
    private String memberSex;

    /**
     * 
     */
    private Date memberBirthDate;

    /**
     * 
     */
    private String memberParty;

    /**
     * 
     */
    private String memberWorkUnit;

    /**
     * 非空
     */
    private String relation;

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
        FamilyMember other = (FamilyMember) that;
        return (this.getPersonNo() == null ? other.getPersonNo() == null : this.getPersonNo().equals(other.getPersonNo()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberSex() == null ? other.getMemberSex() == null : this.getMemberSex().equals(other.getMemberSex()))
            && (this.getMemberBirthDate() == null ? other.getMemberBirthDate() == null : this.getMemberBirthDate().equals(other.getMemberBirthDate()))
            && (this.getMemberParty() == null ? other.getMemberParty() == null : this.getMemberParty().equals(other.getMemberParty()))
            && (this.getMemberWorkUnit() == null ? other.getMemberWorkUnit() == null : this.getMemberWorkUnit().equals(other.getMemberWorkUnit()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonNo() == null) ? 0 : getPersonNo().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberSex() == null) ? 0 : getMemberSex().hashCode());
        result = prime * result + ((getMemberBirthDate() == null) ? 0 : getMemberBirthDate().hashCode());
        result = prime * result + ((getMemberParty() == null) ? 0 : getMemberParty().hashCode());
        result = prime * result + ((getMemberWorkUnit() == null) ? 0 : getMemberWorkUnit().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personNo=").append(personNo);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberSex=").append(memberSex);
        sb.append(", memberBirthDate=").append(memberBirthDate);
        sb.append(", memberParty=").append(memberParty);
        sb.append(", memberWorkUnit=").append(memberWorkUnit);
        sb.append(", relation=").append(relation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}