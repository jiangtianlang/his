package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName hospital_level
 */
@TableName(value ="hospital_level")
@Data
public class HospitalLevel implements Serializable {
    /**
     * 由医院编码1-9如1-省级 2-市级,非空
     */
    @TableId
    private String levelNo;

    /**
     * 非空
     */
    private String levelName;

    /**
     * 是应扣费的百分比。如应扣百分十即收费标准就是10,非空
     */
    private Integer chargeStandard;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}