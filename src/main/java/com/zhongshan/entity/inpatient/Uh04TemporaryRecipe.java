package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName uh04_temporary_recipe
 */
@TableName(value ="uh04_temporary_recipe")
@Data
public class Uh04TemporaryRecipe implements Serializable {

    @TableId
    private String recipeId;
    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 医嘱日期
     */
    @JsonFormat(pattern="yyyy-MM-dd")
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
    注，肌注，皮注
    心内注射等
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
  bid—1天两次
  12h—12小时一次
  tid—1天三次
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
    private String ysCode;

    /**
     * 护士编码
     */
    private String hsCode;

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