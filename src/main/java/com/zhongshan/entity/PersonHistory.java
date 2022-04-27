package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName person_history
 */
@TableName(value ="person_history")
@Data
public class PersonHistory implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 非空
     */
    private String historyFrom;

    /**
     * 非空
     */
    private String historyTo;

    /**
     * 非空
     */
    private String workPlace;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}