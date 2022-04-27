package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName charge_type
 */
@TableName(value ="charge_type")
@Data
public class ChargeType implements Serializable {
    /**
     * 收费类型代号(由医院编码01-99非空)
     */
    @TableId
    private Integer chargeNo;

    /**
     * 收费类型名称
     */
    private String chargeName;

    /**
     * 门诊收费标准(是应扣费的百分比(如应扣百分十即收费标准就是10, 非空)
     */
    private Integer chargeStandard1;

    /**
     * 住院收费标准(是应扣费的百分比(如应扣百分十即收费标准就是10, 非空)
     */
    private Integer chargeStandard2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}