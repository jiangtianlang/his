package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName ward
 */
@TableName(value ="ward")
@Data
public class Ward implements Serializable {
    /**
     * 床号
     */
    @TableId
    private String bedNo;

    /**
     * 科别
     */
    private String section;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}