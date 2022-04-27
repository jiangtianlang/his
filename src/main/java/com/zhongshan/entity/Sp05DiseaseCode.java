package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sp05_disease_code
 */
@TableName(value ="sp05_disease_code")
@Data
public class Sp05DiseaseCode implements Serializable {
    /**
     * 
     */
    @TableId
    private String diseaseCode;

    /**
     * 
     */
    private String diseaseName;

    /**
     * 
     */
    private String chineseChar;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}