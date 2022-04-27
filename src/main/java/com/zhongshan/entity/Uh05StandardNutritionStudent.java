package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_standard_nutrition_student
 */
@TableName(value ="uh05_standard_nutrition_student")
@Data
public class Uh05StandardNutritionStudent implements Serializable {
    /**
     * 男，女
     */
    @TableId
    private String sex;

    /**
     * 
     */
    private Integer age;

    /**
     * 单位：cm
     */
    private Integer hight;

    /**
     * 单位：kg
     */
    private Double weightL;

    /**
     * 单位：kg
     */
    private Double weightM;

    /**
     * 单位：kg
     */
    private Double weightH;

    /**
     * 单位：kg
     */
    private Double weightSl;

    /**
     * 单位：kg
     */
    private Double weightSh;

    /**
     * 单位：kg
     */
    private Double weightFat;

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
        Uh05StandardNutritionStudent other = (Uh05StandardNutritionStudent) that;
        return (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getHight() == null ? other.getHight() == null : this.getHight().equals(other.getHight()))
            && (this.getWeightL() == null ? other.getWeightL() == null : this.getWeightL().equals(other.getWeightL()))
            && (this.getWeightM() == null ? other.getWeightM() == null : this.getWeightM().equals(other.getWeightM()))
            && (this.getWeightH() == null ? other.getWeightH() == null : this.getWeightH().equals(other.getWeightH()))
            && (this.getWeightSl() == null ? other.getWeightSl() == null : this.getWeightSl().equals(other.getWeightSl()))
            && (this.getWeightSh() == null ? other.getWeightSh() == null : this.getWeightSh().equals(other.getWeightSh()))
            && (this.getWeightFat() == null ? other.getWeightFat() == null : this.getWeightFat().equals(other.getWeightFat()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getHight() == null) ? 0 : getHight().hashCode());
        result = prime * result + ((getWeightL() == null) ? 0 : getWeightL().hashCode());
        result = prime * result + ((getWeightM() == null) ? 0 : getWeightM().hashCode());
        result = prime * result + ((getWeightH() == null) ? 0 : getWeightH().hashCode());
        result = prime * result + ((getWeightSl() == null) ? 0 : getWeightSl().hashCode());
        result = prime * result + ((getWeightSh() == null) ? 0 : getWeightSh().hashCode());
        result = prime * result + ((getWeightFat() == null) ? 0 : getWeightFat().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", hight=").append(hight);
        sb.append(", weightL=").append(weightL);
        sb.append(", weightM=").append(weightM);
        sb.append(", weightH=").append(weightH);
        sb.append(", weightSl=").append(weightSl);
        sb.append(", weightSh=").append(weightSh);
        sb.append(", weightFat=").append(weightFat);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}