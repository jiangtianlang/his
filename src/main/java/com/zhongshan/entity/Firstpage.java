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
}