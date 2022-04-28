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
 * @TableName uh04_temporary_recipe
 */
@TableName(value ="uh04_temporary_recipe")
@Data
public class Uh04TemporaryRecipe implements Serializable {
    /**
     * 住院号
     */
    @TableId
    private String patientNo;

    /**
     * 医嘱日期
     */
    private Date recipeDate;

    /**
     * 科室编码，取自人事编码表
     */
    private String sectionCode;

    /**
     * 收费类别，取自一级科目码
     */
    private String cureType;

    /**
     * 药品代码
     */
    private String medicineCode;

    /**
     * 药品名称
     */
    private String medicineName;

    /**
     * 药品用法，如：口服，静滴，静 
     */
    private String medicineUse;

    /**
     * 药品用量
     */
    private Double medicineNum;

    /**
     * 药品规格
     */
    private String medicineGauge;

    /**
     * 用药时间；字母转小写：
     */
    private String imtervalTime;

    /**
     * 隔天数
     */
    private Integer imtervalDate;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 费用
     */
    private Double exponse;

    /**
     * 1—自费  0—公费
     */
    private String quality;

    /**
     * 医生编码
     */
    private String yCode;

    /**
     * 护士编码
     */
    private String hCode;

    /**
     * 记账标志
     */
    private Boolean writeAccountFlag;

    /**
     * 出院否
     */
    private Boolean outFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}