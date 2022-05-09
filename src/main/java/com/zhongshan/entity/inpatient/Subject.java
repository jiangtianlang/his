package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName subject
 */
@TableName(value ="subject")
@Data
public class Subject implements Serializable {
    /**
     * 门诊科目代号(由医院编码01-99非空)
     */
    @TableId(type = IdType.AUTO)
    private Integer subjectNo;

    /**
     * 门诊科目名称
     */
    private String subjectName;

    /**
     * 挂号费
     */
    private Double registerMoney;

    /**
     * 状态
     */
    @TableLogic
    private String state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}