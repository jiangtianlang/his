package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName uh05_health_student_m
 */
@TableName(value ="uh05_health_student_m")
@Data
public class Uh05HealthStudentM implements Serializable {
    /**
     * 学号
     */
    @TableId
    private String studentNo;

    /**
     * 身长单位：Cm
     */
    private Double hight;

    /**
     * 体重单位：Kg
     */
    private Double weight;

    /**
     * 左视力
     */
    private Double eyesightL;

    /**
     * 右视力
     */
    private Double eyesightR;

    /**
     * 左矫正视力
     */
    private Double eyesightCorrectL;

    /**
     * 右矫正视力
     */
    private Double eyesightCorrectR;

    /**
     * 左沙眼(正常  +  ++  +++)
     */
    private String trachomaL;

    /**
     * 右沙眼(正常  +  ++  +++)
     */
    private String trachomaR;

    /**
     * 辩色力(色盲  色弱  正常)
     */
    private String achromatopsia;

    /**
     * 血压（高）(kpa)
     */
    private Double bloodPressureH;

    /**
     * 血压（低）(kpa)
     */
    private Double bloodPressureL;

    /**
     * 心(正常  不正常)
     */
    private String heart;

    /**
     * 肺(正常  不正常)
     */
    private String liver;

    /**
     * 肝(正常  不正常)
     */
    private String lungs;

    /**
     * 上肢(正常  残废)
     */
    private String limbUp;

    /**
     * 下肢(正常  残废)
     */
    private String limbLower;

    /**
     * 小儿麻痹(正常  上  下  上左  上右
下左  下右)
     */
    private String poliomyelitis;

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
        Uh05HealthStudentM other = (Uh05HealthStudentM) that;
        return (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getHight() == null ? other.getHight() == null : this.getHight().equals(other.getHight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getEyesightL() == null ? other.getEyesightL() == null : this.getEyesightL().equals(other.getEyesightL()))
            && (this.getEyesightR() == null ? other.getEyesightR() == null : this.getEyesightR().equals(other.getEyesightR()))
            && (this.getEyesightCorrectL() == null ? other.getEyesightCorrectL() == null : this.getEyesightCorrectL().equals(other.getEyesightCorrectL()))
            && (this.getEyesightCorrectR() == null ? other.getEyesightCorrectR() == null : this.getEyesightCorrectR().equals(other.getEyesightCorrectR()))
            && (this.getTrachomaL() == null ? other.getTrachomaL() == null : this.getTrachomaL().equals(other.getTrachomaL()))
            && (this.getTrachomaR() == null ? other.getTrachomaR() == null : this.getTrachomaR().equals(other.getTrachomaR()))
            && (this.getAchromatopsia() == null ? other.getAchromatopsia() == null : this.getAchromatopsia().equals(other.getAchromatopsia()))
            && (this.getBloodPressureH() == null ? other.getBloodPressureH() == null : this.getBloodPressureH().equals(other.getBloodPressureH()))
            && (this.getBloodPressureL() == null ? other.getBloodPressureL() == null : this.getBloodPressureL().equals(other.getBloodPressureL()))
            && (this.getHeart() == null ? other.getHeart() == null : this.getHeart().equals(other.getHeart()))
            && (this.getLiver() == null ? other.getLiver() == null : this.getLiver().equals(other.getLiver()))
            && (this.getLungs() == null ? other.getLungs() == null : this.getLungs().equals(other.getLungs()))
            && (this.getLimbUp() == null ? other.getLimbUp() == null : this.getLimbUp().equals(other.getLimbUp()))
            && (this.getLimbLower() == null ? other.getLimbLower() == null : this.getLimbLower().equals(other.getLimbLower()))
            && (this.getPoliomyelitis() == null ? other.getPoliomyelitis() == null : this.getPoliomyelitis().equals(other.getPoliomyelitis()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getHight() == null) ? 0 : getHight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getEyesightL() == null) ? 0 : getEyesightL().hashCode());
        result = prime * result + ((getEyesightR() == null) ? 0 : getEyesightR().hashCode());
        result = prime * result + ((getEyesightCorrectL() == null) ? 0 : getEyesightCorrectL().hashCode());
        result = prime * result + ((getEyesightCorrectR() == null) ? 0 : getEyesightCorrectR().hashCode());
        result = prime * result + ((getTrachomaL() == null) ? 0 : getTrachomaL().hashCode());
        result = prime * result + ((getTrachomaR() == null) ? 0 : getTrachomaR().hashCode());
        result = prime * result + ((getAchromatopsia() == null) ? 0 : getAchromatopsia().hashCode());
        result = prime * result + ((getBloodPressureH() == null) ? 0 : getBloodPressureH().hashCode());
        result = prime * result + ((getBloodPressureL() == null) ? 0 : getBloodPressureL().hashCode());
        result = prime * result + ((getHeart() == null) ? 0 : getHeart().hashCode());
        result = prime * result + ((getLiver() == null) ? 0 : getLiver().hashCode());
        result = prime * result + ((getLungs() == null) ? 0 : getLungs().hashCode());
        result = prime * result + ((getLimbUp() == null) ? 0 : getLimbUp().hashCode());
        result = prime * result + ((getLimbLower() == null) ? 0 : getLimbLower().hashCode());
        result = prime * result + ((getPoliomyelitis() == null) ? 0 : getPoliomyelitis().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentNo=").append(studentNo);
        sb.append(", hight=").append(hight);
        sb.append(", weight=").append(weight);
        sb.append(", eyesightL=").append(eyesightL);
        sb.append(", eyesightR=").append(eyesightR);
        sb.append(", eyesightCorrectL=").append(eyesightCorrectL);
        sb.append(", eyesightCorrectR=").append(eyesightCorrectR);
        sb.append(", trachomaL=").append(trachomaL);
        sb.append(", trachomaR=").append(trachomaR);
        sb.append(", achromatopsia=").append(achromatopsia);
        sb.append(", bloodPressureH=").append(bloodPressureH);
        sb.append(", bloodPressureL=").append(bloodPressureL);
        sb.append(", heart=").append(heart);
        sb.append(", liver=").append(liver);
        sb.append(", lungs=").append(lungs);
        sb.append(", limbUp=").append(limbUp);
        sb.append(", limbLower=").append(limbLower);
        sb.append(", poliomyelitis=").append(poliomyelitis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}