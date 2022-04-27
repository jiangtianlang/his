package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName paraments
 */
@TableName(value ="paraments")
@Data
public class Paraments implements Serializable {
    /**
     * 
     */
    @TableId
    private String paramentNo;

    /**
     * 
     */
    private String paramentValue;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}