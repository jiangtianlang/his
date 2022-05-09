package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @TableName outpatient_subjects
 */
@TableName(value ="outpatient_subjects")
@Data
public class OutpatientSubjects implements Serializable {
    /**
     * 门诊科目代号(由医院编码01-99非空)
     */
    @TableId
    private Integer subjectNo;

    /**
     * 门诊科目名称
     */
    private String subjectName;

    /**
     * 挂号费
     */
    private Double registerMoney;
    @TableLogic
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}