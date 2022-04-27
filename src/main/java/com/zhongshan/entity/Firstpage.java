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
 * @TableName firstpage
 */
@TableName(value ="firstpage")
@Data
public class Firstpage implements Serializable {
    /**
     * 非空，每个病人病案号唯一
     */
    @TableId
    private String fgNum;

    /**
     * 非空，病案号+本字段 在表中唯一
     */
    private Integer fgTimes;

    /**
     * 
     */
    private String fgName;

    /**
     * 
     */
    private String fgSex;

    /**
     * 
     */
    private Date fgBirthday;

    /**
     * t/f 已/未婚
     */
    private String fgMarriage;

    /**
     * 
     */
    private String fgOccupation;

    /**
     * 
     */
    private String fgBirthplace;

    /**
     * 
     */
    private String fgNationality;

    /**
     * 
     */
    private String fgIdNum;

    /**
     * 
     */
    private String fgUnit;

    /**
     * 
     */
    private String fgPhonenum;

    /**
     * 
     */
    private String fgUnitPostalcodet;

    /**
     * 
     */
    private String fgAddress;

    /**
     * 
     */
    private String fgHomePostalcode;

    /**
     * 
     */
    private String fgLinkmanName;

    /**
     * 
     */
    private String fgLinkmanRelation;

    /**
     * 
     */
    private String fgLinkmanAddress;

    /**
     * 
     */
    private String fgLinkmanPhonenum;

    /**
     * 内科|外科
     */
    private String fgDepartment;

    /**
     * 
     */
    private String fgRoom;

    /**
     * 
     */
    private Date fgInTime;

    /**
     * 非空，1=危  2=急  3=一般
     */
    private String fgInStatus;

    /**
     * 非空，1=统筹 2=-公费 3=劳保 4=医疗保险 5=自费及其他
     */
    private String fgPayway;

    /**
     * 
     */
    private String fgChangedepartment;

    /**
     * 
     */
    private String fgOutDepartment;

    /**
     * 
     */
    private String fgOutRoom;

    /**
     * 
     */
    private Date fgOutDate;

    /**
     * 疾病名称
     */
    private String fgOutDiagnose;

    /**
     * icd-9编码
     */
    private String fgOutDiagnoseCode;

    /**
     * 疾病名称
     */
    private String fgInDiagnose;

    /**
     * icd-9编码
     */
    private String fgInDiagnoseCode;

    /**
     * 
     */
    private Date fgDiagnoseDate;

    /**
     * 
     */
    private String fgMainDiagnose;

    /**
     * icd-9编码
     */
    private String fgMainDiagnoseCode;

    /**
     * 
     */
    private String fgSubordinationDiagnose;

    /**
     * icd-9编码
     */
    private String fgSubordinationDiagnoseCode;

    /**
     * 
     */
    private String fgIntercurrentDisease;

    /**
     * icd-9编码
     */
    private String fgIntercurrentDiseaseCode;

    /**
     * 治愈|好转|未愈|未治|死亡|其他
     */
    private String fgOutStatus;

    /**
     * 
     */
    private String fgNameInfect;

    /**
     * 
     */
    private String fgOuterReasonMarAndToxicosis;

    /**
     * 
     */
    private String fgPathologicDiagnose;

    /**
     * 
     */
    private String fgAllergicMedicament;

    /**
     * a|b|ab|o|rh因子
     */
    private String fgBloodType;

    /**
     * 甲|乙|丙
     */
    private String fgDiseaseCaseQuality;

    /**
     * 
     */
    private Integer fgTimesSave;

    /**
     * 
     */
    private Integer fgTimesSuccess;

    /**
     * 是|否
     */
    private String fgFollowDiagnose;

    /**
     * 
     */
    private Date fgFollowDiagnoseLimit;

    /**
     * 是|否
     */
    private String fgAshesCheck;

    /**
     * 
     */
    private Double fgTotalCharge;

    /**
     * 
     */
    private Integer fgBedCharge;

    /**
     * 
     */
    private Double fgWesternMedicineCharge;

    /**
     * 
     */
    private Double fgChineseMedicineCharge;

    /**
     * 
     */
    private Integer fgCheckCharge;

    /**
     * 
     */
    private Integer fgCureCharge;

    /**
     * 
     */
    private Integer fgRadiateCharge;

    /**
     * 
     */
    private Integer fgOperationCharge;

    /**
     * 
     */
    private Double fgAssayCharge;

    /**
     * 
     */
    private Integer fgTransfuseCharge;

    /**
     * 
     */
    private Double fgOxygenTherapyCharge;

    /**
     * 
     */
    private Integer fgAccoucheCharge;

    /**
     * 
     */
    private Double fgRestCharge;

    /**
     * 
     */
    private String fgWholeNum;

    /**
     * 
     */
    private Integer fgIndividualShares;

    /**
     * f=现金 g=支票 h=外币 i=转帐
     */
    private String fgCheckoutWay;

    /**
     * t=已出院 f=未出院
     */
    private String fgLeaveHospital;

    /**
     * t=是 f=否
     */
    private String fgShowDiseasecase;

    /**
     * 
     */
    private String fgSignatureDirectorDoctor;

    /**
     * 
     */
    private String fgSignatureChargeDoctor;

    /**
     * 
     */
    private String fgSignatureHouseDoctor;

    /**
     * 
     */
    private String fgSignatureIntern;

    /**
     * 
     */
    private String fgSignatureCoder;

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
        Firstpage other = (Firstpage) that;
        return (this.getFgNum() == null ? other.getFgNum() == null : this.getFgNum().equals(other.getFgNum()))
            && (this.getFgTimes() == null ? other.getFgTimes() == null : this.getFgTimes().equals(other.getFgTimes()))
            && (this.getFgName() == null ? other.getFgName() == null : this.getFgName().equals(other.getFgName()))
            && (this.getFgSex() == null ? other.getFgSex() == null : this.getFgSex().equals(other.getFgSex()))
            && (this.getFgBirthday() == null ? other.getFgBirthday() == null : this.getFgBirthday().equals(other.getFgBirthday()))
            && (this.getFgMarriage() == null ? other.getFgMarriage() == null : this.getFgMarriage().equals(other.getFgMarriage()))
            && (this.getFgOccupation() == null ? other.getFgOccupation() == null : this.getFgOccupation().equals(other.getFgOccupation()))
            && (this.getFgBirthplace() == null ? other.getFgBirthplace() == null : this.getFgBirthplace().equals(other.getFgBirthplace()))
            && (this.getFgNationality() == null ? other.getFgNationality() == null : this.getFgNationality().equals(other.getFgNationality()))
            && (this.getFgIdNum() == null ? other.getFgIdNum() == null : this.getFgIdNum().equals(other.getFgIdNum()))
            && (this.getFgUnit() == null ? other.getFgUnit() == null : this.getFgUnit().equals(other.getFgUnit()))
            && (this.getFgPhonenum() == null ? other.getFgPhonenum() == null : this.getFgPhonenum().equals(other.getFgPhonenum()))
            && (this.getFgUnitPostalcodet() == null ? other.getFgUnitPostalcodet() == null : this.getFgUnitPostalcodet().equals(other.getFgUnitPostalcodet()))
            && (this.getFgAddress() == null ? other.getFgAddress() == null : this.getFgAddress().equals(other.getFgAddress()))
            && (this.getFgHomePostalcode() == null ? other.getFgHomePostalcode() == null : this.getFgHomePostalcode().equals(other.getFgHomePostalcode()))
            && (this.getFgLinkmanName() == null ? other.getFgLinkmanName() == null : this.getFgLinkmanName().equals(other.getFgLinkmanName()))
            && (this.getFgLinkmanRelation() == null ? other.getFgLinkmanRelation() == null : this.getFgLinkmanRelation().equals(other.getFgLinkmanRelation()))
            && (this.getFgLinkmanAddress() == null ? other.getFgLinkmanAddress() == null : this.getFgLinkmanAddress().equals(other.getFgLinkmanAddress()))
            && (this.getFgLinkmanPhonenum() == null ? other.getFgLinkmanPhonenum() == null : this.getFgLinkmanPhonenum().equals(other.getFgLinkmanPhonenum()))
            && (this.getFgDepartment() == null ? other.getFgDepartment() == null : this.getFgDepartment().equals(other.getFgDepartment()))
            && (this.getFgRoom() == null ? other.getFgRoom() == null : this.getFgRoom().equals(other.getFgRoom()))
            && (this.getFgInTime() == null ? other.getFgInTime() == null : this.getFgInTime().equals(other.getFgInTime()))
            && (this.getFgInStatus() == null ? other.getFgInStatus() == null : this.getFgInStatus().equals(other.getFgInStatus()))
            && (this.getFgPayway() == null ? other.getFgPayway() == null : this.getFgPayway().equals(other.getFgPayway()))
            && (this.getFgChangedepartment() == null ? other.getFgChangedepartment() == null : this.getFgChangedepartment().equals(other.getFgChangedepartment()))
            && (this.getFgOutDepartment() == null ? other.getFgOutDepartment() == null : this.getFgOutDepartment().equals(other.getFgOutDepartment()))
            && (this.getFgOutRoom() == null ? other.getFgOutRoom() == null : this.getFgOutRoom().equals(other.getFgOutRoom()))
            && (this.getFgOutDate() == null ? other.getFgOutDate() == null : this.getFgOutDate().equals(other.getFgOutDate()))
            && (this.getFgOutDiagnose() == null ? other.getFgOutDiagnose() == null : this.getFgOutDiagnose().equals(other.getFgOutDiagnose()))
            && (this.getFgOutDiagnoseCode() == null ? other.getFgOutDiagnoseCode() == null : this.getFgOutDiagnoseCode().equals(other.getFgOutDiagnoseCode()))
            && (this.getFgInDiagnose() == null ? other.getFgInDiagnose() == null : this.getFgInDiagnose().equals(other.getFgInDiagnose()))
            && (this.getFgInDiagnoseCode() == null ? other.getFgInDiagnoseCode() == null : this.getFgInDiagnoseCode().equals(other.getFgInDiagnoseCode()))
            && (this.getFgDiagnoseDate() == null ? other.getFgDiagnoseDate() == null : this.getFgDiagnoseDate().equals(other.getFgDiagnoseDate()))
            && (this.getFgMainDiagnose() == null ? other.getFgMainDiagnose() == null : this.getFgMainDiagnose().equals(other.getFgMainDiagnose()))
            && (this.getFgMainDiagnoseCode() == null ? other.getFgMainDiagnoseCode() == null : this.getFgMainDiagnoseCode().equals(other.getFgMainDiagnoseCode()))
            && (this.getFgSubordinationDiagnose() == null ? other.getFgSubordinationDiagnose() == null : this.getFgSubordinationDiagnose().equals(other.getFgSubordinationDiagnose()))
            && (this.getFgSubordinationDiagnoseCode() == null ? other.getFgSubordinationDiagnoseCode() == null : this.getFgSubordinationDiagnoseCode().equals(other.getFgSubordinationDiagnoseCode()))
            && (this.getFgIntercurrentDisease() == null ? other.getFgIntercurrentDisease() == null : this.getFgIntercurrentDisease().equals(other.getFgIntercurrentDisease()))
            && (this.getFgIntercurrentDiseaseCode() == null ? other.getFgIntercurrentDiseaseCode() == null : this.getFgIntercurrentDiseaseCode().equals(other.getFgIntercurrentDiseaseCode()))
            && (this.getFgOutStatus() == null ? other.getFgOutStatus() == null : this.getFgOutStatus().equals(other.getFgOutStatus()))
            && (this.getFgNameInfect() == null ? other.getFgNameInfect() == null : this.getFgNameInfect().equals(other.getFgNameInfect()))
            && (this.getFgOuterReasonMarAndToxicosis() == null ? other.getFgOuterReasonMarAndToxicosis() == null : this.getFgOuterReasonMarAndToxicosis().equals(other.getFgOuterReasonMarAndToxicosis()))
            && (this.getFgPathologicDiagnose() == null ? other.getFgPathologicDiagnose() == null : this.getFgPathologicDiagnose().equals(other.getFgPathologicDiagnose()))
            && (this.getFgAllergicMedicament() == null ? other.getFgAllergicMedicament() == null : this.getFgAllergicMedicament().equals(other.getFgAllergicMedicament()))
            && (this.getFgBloodType() == null ? other.getFgBloodType() == null : this.getFgBloodType().equals(other.getFgBloodType()))
            && (this.getFgDiseaseCaseQuality() == null ? other.getFgDiseaseCaseQuality() == null : this.getFgDiseaseCaseQuality().equals(other.getFgDiseaseCaseQuality()))
            && (this.getFgTimesSave() == null ? other.getFgTimesSave() == null : this.getFgTimesSave().equals(other.getFgTimesSave()))
            && (this.getFgTimesSuccess() == null ? other.getFgTimesSuccess() == null : this.getFgTimesSuccess().equals(other.getFgTimesSuccess()))
            && (this.getFgFollowDiagnose() == null ? other.getFgFollowDiagnose() == null : this.getFgFollowDiagnose().equals(other.getFgFollowDiagnose()))
            && (this.getFgFollowDiagnoseLimit() == null ? other.getFgFollowDiagnoseLimit() == null : this.getFgFollowDiagnoseLimit().equals(other.getFgFollowDiagnoseLimit()))
            && (this.getFgAshesCheck() == null ? other.getFgAshesCheck() == null : this.getFgAshesCheck().equals(other.getFgAshesCheck()))
            && (this.getFgTotalCharge() == null ? other.getFgTotalCharge() == null : this.getFgTotalCharge().equals(other.getFgTotalCharge()))
            && (this.getFgBedCharge() == null ? other.getFgBedCharge() == null : this.getFgBedCharge().equals(other.getFgBedCharge()))
            && (this.getFgWesternMedicineCharge() == null ? other.getFgWesternMedicineCharge() == null : this.getFgWesternMedicineCharge().equals(other.getFgWesternMedicineCharge()))
            && (this.getFgChineseMedicineCharge() == null ? other.getFgChineseMedicineCharge() == null : this.getFgChineseMedicineCharge().equals(other.getFgChineseMedicineCharge()))
            && (this.getFgCheckCharge() == null ? other.getFgCheckCharge() == null : this.getFgCheckCharge().equals(other.getFgCheckCharge()))
            && (this.getFgCureCharge() == null ? other.getFgCureCharge() == null : this.getFgCureCharge().equals(other.getFgCureCharge()))
            && (this.getFgRadiateCharge() == null ? other.getFgRadiateCharge() == null : this.getFgRadiateCharge().equals(other.getFgRadiateCharge()))
            && (this.getFgOperationCharge() == null ? other.getFgOperationCharge() == null : this.getFgOperationCharge().equals(other.getFgOperationCharge()))
            && (this.getFgAssayCharge() == null ? other.getFgAssayCharge() == null : this.getFgAssayCharge().equals(other.getFgAssayCharge()))
            && (this.getFgTransfuseCharge() == null ? other.getFgTransfuseCharge() == null : this.getFgTransfuseCharge().equals(other.getFgTransfuseCharge()))
            && (this.getFgOxygenTherapyCharge() == null ? other.getFgOxygenTherapyCharge() == null : this.getFgOxygenTherapyCharge().equals(other.getFgOxygenTherapyCharge()))
            && (this.getFgAccoucheCharge() == null ? other.getFgAccoucheCharge() == null : this.getFgAccoucheCharge().equals(other.getFgAccoucheCharge()))
            && (this.getFgRestCharge() == null ? other.getFgRestCharge() == null : this.getFgRestCharge().equals(other.getFgRestCharge()))
            && (this.getFgWholeNum() == null ? other.getFgWholeNum() == null : this.getFgWholeNum().equals(other.getFgWholeNum()))
            && (this.getFgIndividualShares() == null ? other.getFgIndividualShares() == null : this.getFgIndividualShares().equals(other.getFgIndividualShares()))
            && (this.getFgCheckoutWay() == null ? other.getFgCheckoutWay() == null : this.getFgCheckoutWay().equals(other.getFgCheckoutWay()))
            && (this.getFgLeaveHospital() == null ? other.getFgLeaveHospital() == null : this.getFgLeaveHospital().equals(other.getFgLeaveHospital()))
            && (this.getFgShowDiseasecase() == null ? other.getFgShowDiseasecase() == null : this.getFgShowDiseasecase().equals(other.getFgShowDiseasecase()))
            && (this.getFgSignatureDirectorDoctor() == null ? other.getFgSignatureDirectorDoctor() == null : this.getFgSignatureDirectorDoctor().equals(other.getFgSignatureDirectorDoctor()))
            && (this.getFgSignatureChargeDoctor() == null ? other.getFgSignatureChargeDoctor() == null : this.getFgSignatureChargeDoctor().equals(other.getFgSignatureChargeDoctor()))
            && (this.getFgSignatureHouseDoctor() == null ? other.getFgSignatureHouseDoctor() == null : this.getFgSignatureHouseDoctor().equals(other.getFgSignatureHouseDoctor()))
            && (this.getFgSignatureIntern() == null ? other.getFgSignatureIntern() == null : this.getFgSignatureIntern().equals(other.getFgSignatureIntern()))
            && (this.getFgSignatureCoder() == null ? other.getFgSignatureCoder() == null : this.getFgSignatureCoder().equals(other.getFgSignatureCoder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFgNum() == null) ? 0 : getFgNum().hashCode());
        result = prime * result + ((getFgTimes() == null) ? 0 : getFgTimes().hashCode());
        result = prime * result + ((getFgName() == null) ? 0 : getFgName().hashCode());
        result = prime * result + ((getFgSex() == null) ? 0 : getFgSex().hashCode());
        result = prime * result + ((getFgBirthday() == null) ? 0 : getFgBirthday().hashCode());
        result = prime * result + ((getFgMarriage() == null) ? 0 : getFgMarriage().hashCode());
        result = prime * result + ((getFgOccupation() == null) ? 0 : getFgOccupation().hashCode());
        result = prime * result + ((getFgBirthplace() == null) ? 0 : getFgBirthplace().hashCode());
        result = prime * result + ((getFgNationality() == null) ? 0 : getFgNationality().hashCode());
        result = prime * result + ((getFgIdNum() == null) ? 0 : getFgIdNum().hashCode());
        result = prime * result + ((getFgUnit() == null) ? 0 : getFgUnit().hashCode());
        result = prime * result + ((getFgPhonenum() == null) ? 0 : getFgPhonenum().hashCode());
        result = prime * result + ((getFgUnitPostalcodet() == null) ? 0 : getFgUnitPostalcodet().hashCode());
        result = prime * result + ((getFgAddress() == null) ? 0 : getFgAddress().hashCode());
        result = prime * result + ((getFgHomePostalcode() == null) ? 0 : getFgHomePostalcode().hashCode());
        result = prime * result + ((getFgLinkmanName() == null) ? 0 : getFgLinkmanName().hashCode());
        result = prime * result + ((getFgLinkmanRelation() == null) ? 0 : getFgLinkmanRelation().hashCode());
        result = prime * result + ((getFgLinkmanAddress() == null) ? 0 : getFgLinkmanAddress().hashCode());
        result = prime * result + ((getFgLinkmanPhonenum() == null) ? 0 : getFgLinkmanPhonenum().hashCode());
        result = prime * result + ((getFgDepartment() == null) ? 0 : getFgDepartment().hashCode());
        result = prime * result + ((getFgRoom() == null) ? 0 : getFgRoom().hashCode());
        result = prime * result + ((getFgInTime() == null) ? 0 : getFgInTime().hashCode());
        result = prime * result + ((getFgInStatus() == null) ? 0 : getFgInStatus().hashCode());
        result = prime * result + ((getFgPayway() == null) ? 0 : getFgPayway().hashCode());
        result = prime * result + ((getFgChangedepartment() == null) ? 0 : getFgChangedepartment().hashCode());
        result = prime * result + ((getFgOutDepartment() == null) ? 0 : getFgOutDepartment().hashCode());
        result = prime * result + ((getFgOutRoom() == null) ? 0 : getFgOutRoom().hashCode());
        result = prime * result + ((getFgOutDate() == null) ? 0 : getFgOutDate().hashCode());
        result = prime * result + ((getFgOutDiagnose() == null) ? 0 : getFgOutDiagnose().hashCode());
        result = prime * result + ((getFgOutDiagnoseCode() == null) ? 0 : getFgOutDiagnoseCode().hashCode());
        result = prime * result + ((getFgInDiagnose() == null) ? 0 : getFgInDiagnose().hashCode());
        result = prime * result + ((getFgInDiagnoseCode() == null) ? 0 : getFgInDiagnoseCode().hashCode());
        result = prime * result + ((getFgDiagnoseDate() == null) ? 0 : getFgDiagnoseDate().hashCode());
        result = prime * result + ((getFgMainDiagnose() == null) ? 0 : getFgMainDiagnose().hashCode());
        result = prime * result + ((getFgMainDiagnoseCode() == null) ? 0 : getFgMainDiagnoseCode().hashCode());
        result = prime * result + ((getFgSubordinationDiagnose() == null) ? 0 : getFgSubordinationDiagnose().hashCode());
        result = prime * result + ((getFgSubordinationDiagnoseCode() == null) ? 0 : getFgSubordinationDiagnoseCode().hashCode());
        result = prime * result + ((getFgIntercurrentDisease() == null) ? 0 : getFgIntercurrentDisease().hashCode());
        result = prime * result + ((getFgIntercurrentDiseaseCode() == null) ? 0 : getFgIntercurrentDiseaseCode().hashCode());
        result = prime * result + ((getFgOutStatus() == null) ? 0 : getFgOutStatus().hashCode());
        result = prime * result + ((getFgNameInfect() == null) ? 0 : getFgNameInfect().hashCode());
        result = prime * result + ((getFgOuterReasonMarAndToxicosis() == null) ? 0 : getFgOuterReasonMarAndToxicosis().hashCode());
        result = prime * result + ((getFgPathologicDiagnose() == null) ? 0 : getFgPathologicDiagnose().hashCode());
        result = prime * result + ((getFgAllergicMedicament() == null) ? 0 : getFgAllergicMedicament().hashCode());
        result = prime * result + ((getFgBloodType() == null) ? 0 : getFgBloodType().hashCode());
        result = prime * result + ((getFgDiseaseCaseQuality() == null) ? 0 : getFgDiseaseCaseQuality().hashCode());
        result = prime * result + ((getFgTimesSave() == null) ? 0 : getFgTimesSave().hashCode());
        result = prime * result + ((getFgTimesSuccess() == null) ? 0 : getFgTimesSuccess().hashCode());
        result = prime * result + ((getFgFollowDiagnose() == null) ? 0 : getFgFollowDiagnose().hashCode());
        result = prime * result + ((getFgFollowDiagnoseLimit() == null) ? 0 : getFgFollowDiagnoseLimit().hashCode());
        result = prime * result + ((getFgAshesCheck() == null) ? 0 : getFgAshesCheck().hashCode());
        result = prime * result + ((getFgTotalCharge() == null) ? 0 : getFgTotalCharge().hashCode());
        result = prime * result + ((getFgBedCharge() == null) ? 0 : getFgBedCharge().hashCode());
        result = prime * result + ((getFgWesternMedicineCharge() == null) ? 0 : getFgWesternMedicineCharge().hashCode());
        result = prime * result + ((getFgChineseMedicineCharge() == null) ? 0 : getFgChineseMedicineCharge().hashCode());
        result = prime * result + ((getFgCheckCharge() == null) ? 0 : getFgCheckCharge().hashCode());
        result = prime * result + ((getFgCureCharge() == null) ? 0 : getFgCureCharge().hashCode());
        result = prime * result + ((getFgRadiateCharge() == null) ? 0 : getFgRadiateCharge().hashCode());
        result = prime * result + ((getFgOperationCharge() == null) ? 0 : getFgOperationCharge().hashCode());
        result = prime * result + ((getFgAssayCharge() == null) ? 0 : getFgAssayCharge().hashCode());
        result = prime * result + ((getFgTransfuseCharge() == null) ? 0 : getFgTransfuseCharge().hashCode());
        result = prime * result + ((getFgOxygenTherapyCharge() == null) ? 0 : getFgOxygenTherapyCharge().hashCode());
        result = prime * result + ((getFgAccoucheCharge() == null) ? 0 : getFgAccoucheCharge().hashCode());
        result = prime * result + ((getFgRestCharge() == null) ? 0 : getFgRestCharge().hashCode());
        result = prime * result + ((getFgWholeNum() == null) ? 0 : getFgWholeNum().hashCode());
        result = prime * result + ((getFgIndividualShares() == null) ? 0 : getFgIndividualShares().hashCode());
        result = prime * result + ((getFgCheckoutWay() == null) ? 0 : getFgCheckoutWay().hashCode());
        result = prime * result + ((getFgLeaveHospital() == null) ? 0 : getFgLeaveHospital().hashCode());
        result = prime * result + ((getFgShowDiseasecase() == null) ? 0 : getFgShowDiseasecase().hashCode());
        result = prime * result + ((getFgSignatureDirectorDoctor() == null) ? 0 : getFgSignatureDirectorDoctor().hashCode());
        result = prime * result + ((getFgSignatureChargeDoctor() == null) ? 0 : getFgSignatureChargeDoctor().hashCode());
        result = prime * result + ((getFgSignatureHouseDoctor() == null) ? 0 : getFgSignatureHouseDoctor().hashCode());
        result = prime * result + ((getFgSignatureIntern() == null) ? 0 : getFgSignatureIntern().hashCode());
        result = prime * result + ((getFgSignatureCoder() == null) ? 0 : getFgSignatureCoder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fgNum=").append(fgNum);
        sb.append(", fgTimes=").append(fgTimes);
        sb.append(", fgName=").append(fgName);
        sb.append(", fgSex=").append(fgSex);
        sb.append(", fgBirthday=").append(fgBirthday);
        sb.append(", fgMarriage=").append(fgMarriage);
        sb.append(", fgOccupation=").append(fgOccupation);
        sb.append(", fgBirthplace=").append(fgBirthplace);
        sb.append(", fgNationality=").append(fgNationality);
        sb.append(", fgIdNum=").append(fgIdNum);
        sb.append(", fgUnit=").append(fgUnit);
        sb.append(", fgPhonenum=").append(fgPhonenum);
        sb.append(", fgUnitPostalcodet=").append(fgUnitPostalcodet);
        sb.append(", fgAddress=").append(fgAddress);
        sb.append(", fgHomePostalcode=").append(fgHomePostalcode);
        sb.append(", fgLinkmanName=").append(fgLinkmanName);
        sb.append(", fgLinkmanRelation=").append(fgLinkmanRelation);
        sb.append(", fgLinkmanAddress=").append(fgLinkmanAddress);
        sb.append(", fgLinkmanPhonenum=").append(fgLinkmanPhonenum);
        sb.append(", fgDepartment=").append(fgDepartment);
        sb.append(", fgRoom=").append(fgRoom);
        sb.append(", fgInTime=").append(fgInTime);
        sb.append(", fgInStatus=").append(fgInStatus);
        sb.append(", fgPayway=").append(fgPayway);
        sb.append(", fgChangedepartment=").append(fgChangedepartment);
        sb.append(", fgOutDepartment=").append(fgOutDepartment);
        sb.append(", fgOutRoom=").append(fgOutRoom);
        sb.append(", fgOutDate=").append(fgOutDate);
        sb.append(", fgOutDiagnose=").append(fgOutDiagnose);
        sb.append(", fgOutDiagnoseCode=").append(fgOutDiagnoseCode);
        sb.append(", fgInDiagnose=").append(fgInDiagnose);
        sb.append(", fgInDiagnoseCode=").append(fgInDiagnoseCode);
        sb.append(", fgDiagnoseDate=").append(fgDiagnoseDate);
        sb.append(", fgMainDiagnose=").append(fgMainDiagnose);
        sb.append(", fgMainDiagnoseCode=").append(fgMainDiagnoseCode);
        sb.append(", fgSubordinationDiagnose=").append(fgSubordinationDiagnose);
        sb.append(", fgSubordinationDiagnoseCode=").append(fgSubordinationDiagnoseCode);
        sb.append(", fgIntercurrentDisease=").append(fgIntercurrentDisease);
        sb.append(", fgIntercurrentDiseaseCode=").append(fgIntercurrentDiseaseCode);
        sb.append(", fgOutStatus=").append(fgOutStatus);
        sb.append(", fgNameInfect=").append(fgNameInfect);
        sb.append(", fgOuterReasonMarAndToxicosis=").append(fgOuterReasonMarAndToxicosis);
        sb.append(", fgPathologicDiagnose=").append(fgPathologicDiagnose);
        sb.append(", fgAllergicMedicament=").append(fgAllergicMedicament);
        sb.append(", fgBloodType=").append(fgBloodType);
        sb.append(", fgDiseaseCaseQuality=").append(fgDiseaseCaseQuality);
        sb.append(", fgTimesSave=").append(fgTimesSave);
        sb.append(", fgTimesSuccess=").append(fgTimesSuccess);
        sb.append(", fgFollowDiagnose=").append(fgFollowDiagnose);
        sb.append(", fgFollowDiagnoseLimit=").append(fgFollowDiagnoseLimit);
        sb.append(", fgAshesCheck=").append(fgAshesCheck);
        sb.append(", fgTotalCharge=").append(fgTotalCharge);
        sb.append(", fgBedCharge=").append(fgBedCharge);
        sb.append(", fgWesternMedicineCharge=").append(fgWesternMedicineCharge);
        sb.append(", fgChineseMedicineCharge=").append(fgChineseMedicineCharge);
        sb.append(", fgCheckCharge=").append(fgCheckCharge);
        sb.append(", fgCureCharge=").append(fgCureCharge);
        sb.append(", fgRadiateCharge=").append(fgRadiateCharge);
        sb.append(", fgOperationCharge=").append(fgOperationCharge);
        sb.append(", fgAssayCharge=").append(fgAssayCharge);
        sb.append(", fgTransfuseCharge=").append(fgTransfuseCharge);
        sb.append(", fgOxygenTherapyCharge=").append(fgOxygenTherapyCharge);
        sb.append(", fgAccoucheCharge=").append(fgAccoucheCharge);
        sb.append(", fgRestCharge=").append(fgRestCharge);
        sb.append(", fgWholeNum=").append(fgWholeNum);
        sb.append(", fgIndividualShares=").append(fgIndividualShares);
        sb.append(", fgCheckoutWay=").append(fgCheckoutWay);
        sb.append(", fgLeaveHospital=").append(fgLeaveHospital);
        sb.append(", fgShowDiseasecase=").append(fgShowDiseasecase);
        sb.append(", fgSignatureDirectorDoctor=").append(fgSignatureDirectorDoctor);
        sb.append(", fgSignatureChargeDoctor=").append(fgSignatureChargeDoctor);
        sb.append(", fgSignatureHouseDoctor=").append(fgSignatureHouseDoctor);
        sb.append(", fgSignatureIntern=").append(fgSignatureIntern);
        sb.append(", fgSignatureCoder=").append(fgSignatureCoder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}