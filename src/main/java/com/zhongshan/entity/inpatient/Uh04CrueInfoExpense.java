package com.zhongshan.entity.inpatient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName uh04_crue_info_expense
 */
@TableName(value ="uh04_crue_info_expense")
@Data
@NoArgsConstructor
public class Uh04CrueInfoExpense implements Serializable {
    /**
     * 
     */

    @TableId(type = IdType.ASSIGN_ID)
    private String id;


    /**
     * 住院号
     */
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

    public Uh04CrueInfoExpense(Uh04LongRecipe longRecipe) {
        this.patientNo = longRecipe.getPatientNo();
        this.recipeDate = new Date();
//        this.sectionCode = longRecipe.getSectionCode();
//        this.cureType = longRecipe.getCureType();
        this.medicineCode = longRecipe.getMedicineCode();
        this.medicineName = longRecipe.getMedicineName();
        this.unitPrice = longRecipe.getUnitPrice();
        this.exponse = longRecipe.getExponse();
        this.quality = longRecipe.getQuality();
        this.yCode = longRecipe.getYsCode();
        this.hCode = longRecipe.getHsCode();
        this.writeAccountFlag = longRecipe.getWriteAccountFlag();
        this.outFlag = longRecipe.getOutFlag();
    }

    public Uh04CrueInfoExpense(Uh04TemporaryRecipe entity) {
        this.patientNo = entity.getPatientNo();
        this.recipeDate = new Date();
//        this.sectionCode = entity.getSectionCode();
//        this.cureType = entity.getCureType();
        this.medicineCode = entity.getMedicineCode();
        this.medicineName = entity.getMedicineName();
        this.unitPrice = entity.getUnitPrice();
        this.exponse = entity.getExponse();
        this.quality = entity.getQuality();
        this.yCode = entity.getYsCode();
        this.hCode = entity.getHsCode();
        this.writeAccountFlag = entity.getWriteAccountFlag();
        this.outFlag = entity.getOutFlag();
    }
}