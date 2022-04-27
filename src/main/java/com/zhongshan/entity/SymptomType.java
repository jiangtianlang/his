package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName symptom_type
 */
@TableName(value ="symptom_type")
@Data
public class SymptomType implements Serializable {
    /**
     * 由医院编码1-9如1-癌症,非空
     */
    @TableId
    private String symptomNo;

    /**
     * 非空
     */
    private String symptomName;

    /**
     * 是应扣费的百分比。如应扣百分十即收费标准就是10,非空
     */
    private Integer symptomStandard;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}