package com.zhongshan.entity.inpatient;

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
     * 非空。A--特约记帐
      B--公费记帐
      C--保险记帐
      D--本校记帐
      E—自费记帐
若交费方式为公费则此项自动置为“D”，若交费方式为自费则此项自动置为“E”
     */
    private String costType;

    /**
     * 非空  F—现金结算
      G--支票结算
      H--外币结算
      I--转帐结算
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
     * ICD-9编码
对应主键在Diagnose表中
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
}