package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName pay_money
 */
@TableName(value ="pay_money")
@Data
@ApiModel
@NoArgsConstructor
public class PayMoney implements Serializable {


    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "预交款号")
    private Long payId;

    /**
     * 住院号
     */
    @ApiModelProperty(value = "病人住院号")
    private String patientNo;

    /**
     * 交款日期
     */
    @ApiModelProperty(value = "交款日期")
    private Date paydate;

    /**
     * 病人姓名
     */
    @ApiModelProperty(value = "病人姓名")
    private String patientName;

    /**
     * 预交款
     */
    @ApiModelProperty(value = "预交款")
    private Double money;

    /**
     * 出院否
     */
    @ApiModelProperty(value = "出院否1(true) 0(false)")
    private Integer outFlag;

    /**
     * 出院日期
     */
    @ApiModelProperty(value = "出院日期")
    private Date outDate;

    /*逻辑删除*/
    @TableLogic
    @ApiModelProperty(value = "逻辑删除1(true) 0(false)")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public PayMoney(PatientBase patientBase) {
        this.patientNo = patientBase.getPatientNo();
        this.patientName = patientBase.getPatientName();
        this.paydate = patientBase.getInDate();
        this.money = patientBase.getPayMoney();
        this.outFlag = 0;
        this.outDate = patientBase.getOutDate();
    }
}