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
 * @TableName patient_base
 */
@TableName(value ="patient_base")
@Data
public class PatientBase implements Serializable {
    /**
     * 非空。病人住院号唯一。前四位为年份，后四位为流水号。(YYYY9999)
     */
    @TableId
    private String patientNo;

    /**
     * 入院日期YYYYMMDD
     */
    private Date inDate;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

    /**
     * 出生日期
     */
    private Date birthDate;

    /**
     * 婚否
     */
    private Integer marry;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 
     */
    private String titleName;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 身份证号
     */
    private String capacityNo;

    /**
     * 医疗证号
     */
    private String staffNo;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 住址
     */
    private String homeAdder;

    /**
     * 联系人
     */
    private String heName;

    /**
     * 联系人电话
     */
    private String heTel;

    /**
     * 关系
     */
    private String relation;

    /**
     * 交费方式
     */
    private String costMode;

    /**
     * 个人分担
     */
    private Integer patientCost;

    /**
     * 非空。A--特约记帐      B--公费记帐      C--保险记帐      D--本校记帐      E—自费记帐若交费方式为公费则此项自动置为“D”，若交费方式为自费则此项自动置为“E”
     */
    private String costType;

    /**
     * 非空  F—现金结算      G--支票结算      H--外币结算      I--转帐结算
     */
    private String settleType;

    /**
     * 预交款.如果交费方式为公费、统筹或医疗保险，此字段应为空，其余交费方式下，此字段应非空
     */
    private Double payMoney;

    /**
     * 疾病诊断
     */
    private String diagnoseName;

    /**
     * ICD-9编码对应主键在Diagnose表中
     */
    private String icd9;

    /**
     * 科别
     */
    private String section;

    /**
     * 床号对应主键在ward表中
     */
    private String bedNo;

    /**
     * 出院日期，病人出院结算时自动填入
     */
    private Date outDate;

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
        PatientBase other = (PatientBase) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getInDate() == null ? other.getInDate() == null : this.getInDate().equals(other.getInDate()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientSex() == null ? other.getPatientSex() == null : this.getPatientSex().equals(other.getPatientSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getMarry() == null ? other.getMarry() == null : this.getMarry().equals(other.getMarry()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getTitleName() == null ? other.getTitleName() == null : this.getTitleName().equals(other.getTitleName()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getCapacityNo() == null ? other.getCapacityNo() == null : this.getCapacityNo().equals(other.getCapacityNo()))
            && (this.getStaffNo() == null ? other.getStaffNo() == null : this.getStaffNo().equals(other.getStaffNo()))
            && (this.getWorkPlace() == null ? other.getWorkPlace() == null : this.getWorkPlace().equals(other.getWorkPlace()))
            && (this.getHomeAdder() == null ? other.getHomeAdder() == null : this.getHomeAdder().equals(other.getHomeAdder()))
            && (this.getHeName() == null ? other.getHeName() == null : this.getHeName().equals(other.getHeName()))
            && (this.getHeTel() == null ? other.getHeTel() == null : this.getHeTel().equals(other.getHeTel()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getCostMode() == null ? other.getCostMode() == null : this.getCostMode().equals(other.getCostMode()))
            && (this.getPatientCost() == null ? other.getPatientCost() == null : this.getPatientCost().equals(other.getPatientCost()))
            && (this.getCostType() == null ? other.getCostType() == null : this.getCostType().equals(other.getCostType()))
            && (this.getSettleType() == null ? other.getSettleType() == null : this.getSettleType().equals(other.getSettleType()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()))
            && (this.getDiagnoseName() == null ? other.getDiagnoseName() == null : this.getDiagnoseName().equals(other.getDiagnoseName()))
            && (this.getIcd9() == null ? other.getIcd9() == null : this.getIcd9().equals(other.getIcd9()))
            && (this.getSection() == null ? other.getSection() == null : this.getSection().equals(other.getSection()))
            && (this.getBedNo() == null ? other.getBedNo() == null : this.getBedNo().equals(other.getBedNo()))
            && (this.getOutDate() == null ? other.getOutDate() == null : this.getOutDate().equals(other.getOutDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getInDate() == null) ? 0 : getInDate().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientSex() == null) ? 0 : getPatientSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getMarry() == null) ? 0 : getMarry().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getTitleName() == null) ? 0 : getTitleName().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getCapacityNo() == null) ? 0 : getCapacityNo().hashCode());
        result = prime * result + ((getStaffNo() == null) ? 0 : getStaffNo().hashCode());
        result = prime * result + ((getWorkPlace() == null) ? 0 : getWorkPlace().hashCode());
        result = prime * result + ((getHomeAdder() == null) ? 0 : getHomeAdder().hashCode());
        result = prime * result + ((getHeName() == null) ? 0 : getHeName().hashCode());
        result = prime * result + ((getHeTel() == null) ? 0 : getHeTel().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getCostMode() == null) ? 0 : getCostMode().hashCode());
        result = prime * result + ((getPatientCost() == null) ? 0 : getPatientCost().hashCode());
        result = prime * result + ((getCostType() == null) ? 0 : getCostType().hashCode());
        result = prime * result + ((getSettleType() == null) ? 0 : getSettleType().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        result = prime * result + ((getDiagnoseName() == null) ? 0 : getDiagnoseName().hashCode());
        result = prime * result + ((getIcd9() == null) ? 0 : getIcd9().hashCode());
        result = prime * result + ((getSection() == null) ? 0 : getSection().hashCode());
        result = prime * result + ((getBedNo() == null) ? 0 : getBedNo().hashCode());
        result = prime * result + ((getOutDate() == null) ? 0 : getOutDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientNo=").append(patientNo);
        sb.append(", inDate=").append(inDate);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientSex=").append(patientSex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", marry=").append(marry);
        sb.append(", occupation=").append(occupation);
        sb.append(", titleName=").append(titleName);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", nationality=").append(nationality);
        sb.append(", capacityNo=").append(capacityNo);
        sb.append(", staffNo=").append(staffNo);
        sb.append(", workPlace=").append(workPlace);
        sb.append(", homeAdder=").append(homeAdder);
        sb.append(", heName=").append(heName);
        sb.append(", heTel=").append(heTel);
        sb.append(", relation=").append(relation);
        sb.append(", costMode=").append(costMode);
        sb.append(", patientCost=").append(patientCost);
        sb.append(", costType=").append(costType);
        sb.append(", settleType=").append(settleType);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", diagnoseName=").append(diagnoseName);
        sb.append(", icd9=").append(icd9);
        sb.append(", section=").append(section);
        sb.append(", bedNo=").append(bedNo);
        sb.append(", outDate=").append(outDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}