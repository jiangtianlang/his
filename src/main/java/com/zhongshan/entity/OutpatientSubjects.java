package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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

    /**
     * 状态（正常，维护）
     */
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}