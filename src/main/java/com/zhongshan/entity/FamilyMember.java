package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
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
    @TableLogic
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}