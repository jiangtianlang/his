package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_auth
 */
@TableName(value ="user_auth")
@Data
public class UserAuth implements Serializable {
    /**
     * 
     */
    @TableId
    private String subsystemName;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String passworde;

    /**
     * 
     */
    private String userLevel;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}