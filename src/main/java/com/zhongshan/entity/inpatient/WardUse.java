package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName ward_use
 */
@TableName(value ="ward_use")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WardUse implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String wardId;

    /**
     * 床号
     */
    private String bedNo;

    /**
     * 科别
     */
    private String section;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

    /**
     * 是否出院
     */
    @TableLogic
    private Integer isDelete;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public WardUse(PatientBase patientBase) {
        this.bedNo = patientBase.getBedNo();
        this.section = patientBase.getSection();
        this.patientNo = patientBase.getPatientNo();
        this.patientName = patientBase.getPatientName();
        this.patientSex = patientBase.getPatientSex();
    }
}