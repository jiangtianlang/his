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
    @ApiModelProperty(value = "床号")
    private String bedNo;

    /**
     * 科别
     */
    @ApiModelProperty(value = "科别")
    private String section;
    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    private Double price;
    /*是否空床*/
    @ApiModelProperty(value = "是否空床1(true) 0(false)")
    private Integer isNull;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Ward(WardUse wardUse,Integer isNull) {
        this.bedNo = wardUse.getBedNo();
        this.section = wardUse.getSection();
        this.isNull = isNull;
    }

    public Ward() {

    }
}