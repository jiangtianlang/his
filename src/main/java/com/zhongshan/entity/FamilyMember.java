package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName family_member
 */
@TableName(value ="family_member")
@Data
public class FamilyMember implements Serializable {
    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 非空
     */
    private String memberName;

    /**
     * 非空
     */
    private String memberSex;

    /**
     * 
     */
    private Date memberBirthDate;

    /**
     * 
     */
    private String memberParty;

    /**
     * 
     */
    private String memberWorkUnit;

    /**
     * 非空
     */
    private String relation;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}