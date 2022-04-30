package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @TableName ward
 */
@TableName(value ="ward")
@Data
public class Ward implements Serializable {
    @TableId
    @ApiModelProperty(value = "流水id")
    private Long wardId;
    /**
     * 床号
     */
    @ApiModelProperty(value = "床号")
    private String bedNo;

    /**
     * 科别
     */
    @ApiModelProperty(value = "科别")
    private String section;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String patientName;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String patientSex;
    /*逻辑删除*/
    @TableLogic
    @ApiModelProperty(value = "逻辑删除1(true) 0(false)")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}