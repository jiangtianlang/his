package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName title
 */
@TableName(value ="title")
@Data
public class Title implements Serializable {
    /**
     * 按高教统一编码
     */
    @TableId
    private Integer titleNo;

    /**
     * 
     */
    private String titleName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}