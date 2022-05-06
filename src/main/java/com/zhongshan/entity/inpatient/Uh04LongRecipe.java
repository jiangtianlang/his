package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName uh04_long_recipe
 */
@TableName(value ="uh04_long_recipe")
@Data
public class Uh04LongRecipe implements Serializable {
    /**
     * 医嘱码
     */
    @TableId
    private String recipeId;
    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 停止时间
     */
    private Date stopTime;

    /**
     * 科室代码，取自人事编码表
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