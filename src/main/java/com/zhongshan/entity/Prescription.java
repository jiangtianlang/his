package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName prescription
 */
@TableName(value ="prescription")
@Data
public class Prescription implements Serializable {
    /**
     * 医疗卡号
     */
    @TableId
    private String personsNo;
    private String name;

    /**
     * 药品名称
     */
    private String mediName;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Double pay;

    /**
     * 金额
     */
    private Double mediMoney;

    /**
     * 单位
     */
    private String unit;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 计价日期
     */
    private Date todayDate;

    /**
     * 门诊科目
     */
    private String subjectNo;

    /**
     * 计价员号
     */
    private String opera;

    /**
     * 处方流水号
     */
    private Integer presNumber;

    /**
     * 日结标记(1.已日结 0.没日结)
     */
    private Integer todayTotalYn;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}