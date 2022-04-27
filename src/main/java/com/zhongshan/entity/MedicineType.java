package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medicine_type
 */
@TableName(value ="medicine_type")
@Data
public class MedicineType implements Serializable {
    /**
     * 药费代号
     */
    @TableId
    private String mediNo;

    /**
     * 药费名称
     */
    private String mediName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}