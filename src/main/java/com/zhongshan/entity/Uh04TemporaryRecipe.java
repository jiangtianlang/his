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
     * 药品用法，如：口服，静滴，静     注，肌注，皮注    心内注射等
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
     * 用药时间；字母转小写：  bid—1天两次  12h—12小时一次  tid—1天三次
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Uh04TemporaryRecipe other = (Uh04TemporaryRecipe) that;
        return (this.getPatientNo() == null ? other.getPatientNo() == null : this.getPatientNo().equals(other.getPatientNo()))
            && (this.getRecipeDate() == null ? other.getRecipeDate() == null : this.getRecipeDate().equals(other.getRecipeDate()))
            && (this.getSectionCode() == null ? other.getSectionCode() == null : this.getSectionCode().equals(other.getSectionCode()))
            && (this.getCureType() == null ? other.getCureType() == null : this.getCureType().equals(other.getCureType()))
            && (this.getMedicineCode() == null ? other.getMedicineCode() == null : this.getMedicineCode().equals(other.getMedicineCode()))
            && (this.getMedicineName() == null ? other.getMedicineName() == null : this.getMedicineName().equals(other.getMedicineName()))
            && (this.getMedicineUse() == null ? other.getMedicineUse() == null : this.getMedicineUse().equals(other.getMedicineUse()))
            && (this.getMedicineNum() == null ? other.getMedicineNum() == null : this.getMedicineNum().equals(other.getMedicineNum()))
            && (this.getMedicineGauge() == null ? other.getMedicineGauge() == null : this.getMedicineGauge().equals(other.getMedicineGauge()))
            && (this.getImtervalTime() == null ? other.getImtervalTime() == null : this.getImtervalTime().equals(other.getImtervalTime()))
            && (this.getImtervalDate() == null ? other.getImtervalDate() == null : this.getImtervalDate().equals(other.getImtervalDate()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getExponse() == null ? other.getExponse() == null : this.getExponse().equals(other.getExponse()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getyCode() == null ? other.getyCode() == null : this.getyCode().equals(other.getyCode()))
            && (this.gethCode() == null ? other.gethCode() == null : this.gethCode().equals(other.gethCode()))
            && (this.getWriteAccountFlag() == null ? other.getWriteAccountFlag() == null : this.getWriteAccountFlag().equals(other.getWriteAccountFlag()))
            && (this.getOutFlag() == null ? other.getOutFlag() == null : this.getOutFlag().equals(other.getOutFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientNo() == null) ? 0 : getPatientNo().hashCode());
        result = prime * result + ((getRecipeDate() == null) ? 0 : getRecipeDate().hashCode());
        result = prime * result + ((getSectionCode() == null) ? 0 : getSectionCode().hashCode());
        result = prime * result + ((getCureType() == null) ? 0 : getCureType().hashCode());
        result = prime * result + ((getMedicineCode() == null) ? 0 : getMedicineCode().hashCode());
        result = prime * result + ((getMedicineName() == null) ? 0 : getMedicineName().hashCode());
        result = prime * result + ((getMedicineUse() == null) ? 0 : getMedicineUse().hashCode());
        result = prime * result + ((getMedicineNum() == null) ? 0 : getMedicineNum().hashCode());
        result = prime * result + ((getMedicineGauge() == null) ? 0 : getMedicineGauge().hashCode());
        result = prime * result + ((getImtervalTime() == null) ? 0 : getImtervalTime().hashCode());
        result = prime * result + ((getImtervalDate() == null) ? 0 : getImtervalDate().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getExponse() == null) ? 0 : getExponse().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getyCode() == null) ? 0 : getyCode().hashCode());
        result = prime * result + ((gethCode() == null) ? 0 : gethCode().hashCode());
        result = prime * result + ((getWriteAccountFlag() == null) ? 0 : getWriteAccountFlag().hashCode());
        result = prime * result + ((getOutFlag() == null) ? 0 : getOutFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientNo=").append(patientNo);
        sb.append(", recipeDate=").append(recipeDate);
        sb.append(", sectionCode=").append(sectionCode);
        sb.append(", cureType=").append(cureType);
        sb.append(", medicineCode=").append(medicineCode);
        sb.append(", medicineName=").append(medicineName);
        sb.append(", medicineUse=").append(medicineUse);
        sb.append(", medicineNum=").append(medicineNum);
        sb.append(", medicineGauge=").append(medicineGauge);
        sb.append(", imtervalTime=").append(imtervalTime);
        sb.append(", imtervalDate=").append(imtervalDate);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", exponse=").append(exponse);
        sb.append(", quality=").append(quality);
        sb.append(", yCode=").append(yCode);
        sb.append(", hCode=").append(hCode);
        sb.append(", writeAccountFlag=").append(writeAccountFlag);
        sb.append(", outFlag=").append(outFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}