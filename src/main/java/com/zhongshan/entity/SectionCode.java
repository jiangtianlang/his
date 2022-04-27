package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName section_code
 */
@TableName(value ="section_code")
@Data
public class SectionCode implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String sectionNo;

    /**
     * 非空
     */
    private String sectionName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}