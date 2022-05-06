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
 * @TableName uh04_own_expense
 */
@TableName(value ="uh04_own_expense")
@Data
public class Uh04OwnExpense implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 入院日期
     */
    private Date inHospitalDate;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 已交金额
     */
    private Double alreadyMoney;

    /**
     * 支出金额
     */
    private Double payMoney;

    /**
     * 1-已出院  0-未出院
     */
    private Boolean outHospitalFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Uh04OwnExpense(PatientBase patientBase) {
        this.patientNo = patientBase.getPatientNo();
        this.inHospitalDate = patientBase.getInDate();
        this.patientName = patientBase.getPatientName();
        this.alreadyMoney = 0.0;
        this.payMoney = patientBase.getPayMoney();
        this.outHospitalFlag = false;
    }

    public Uh04OwnExpense() {

    }
}