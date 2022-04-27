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
 * @TableName uh05_health_staff
 */
@TableName(value ="uh05_health_staff")
@Data
public class Uh05HealthStaff implements Serializable {
    /**
     * 
     */
    @TableId
    private String checkNo;

    /**
     * 
     */
    private String staffNo;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String hobby;

    /**
     * 
     */
    private Double high;

    /**
     * 
     */
    private Double weight;

    /**
     * 
     */
    private Double bloodPressureH;

    /**
     * 
     */
    private Double bloodPressureL;

    /**
     * 
     */
    private Double eyesightL;

    /**
     * 
     */
    private Double eyesightR;

    /**
     * 
     */
    private Double eyesightCorrectL;

    /**
     * 
     */
    private Double eyesightCorrectR;

    /**
     * 
     */
    private String nose;

    /**
     * 
     */
    private String pharynx;

    /**
     * 
     */
    private String oralCavity;

    /**
     * 
     */
    private String tooth;

    /**
     * 
     */
    private String heart;

    /**
     * 
     */
    private String liver;

    /**
     * 
     */
    private String lungs;

    /**
     * 
     */
    private String spleen;

    /**
     * 
     */
    private String skin;

    /**
     * 
     */
    private String lymph;

    /**
     * 
     */
    private String limbs;

    /**
     * 
     */
    private String thyroidGland;

    /**
     * 
     */
    private String anus;

    /**
     * 
     */
    private String genitourinary;

    /**
     * 
     */
    private String others;

    /**
     * 
     */
    private String xRays;

    /**
     * 
     */
    private String urine;

    /**
     * 
     */
    private String electrocardiogram;

    /**
     * 
     */
    private String ultrasonic;

    /**
     * 
     */
    private String liverFunction;

    /**
     * 
     */
    private String gynecology;

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
        Uh05HealthStaff other = (Uh05HealthStaff) that;
        return (this.getCheckNo() == null ? other.getCheckNo() == null : this.getCheckNo().equals(other.getCheckNo()))
            && (this.getStaffNo() == null ? other.getStaffNo() == null : this.getStaffNo().equals(other.getStaffNo()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getHobby() == null ? other.getHobby() == null : this.getHobby().equals(other.getHobby()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getBloodPressureH() == null ? other.getBloodPressureH() == null : this.getBloodPressureH().equals(other.getBloodPressureH()))
            && (this.getBloodPressureL() == null ? other.getBloodPressureL() == null : this.getBloodPressureL().equals(other.getBloodPressureL()))
            && (this.getEyesightL() == null ? other.getEyesightL() == null : this.getEyesightL().equals(other.getEyesightL()))
            && (this.getEyesightR() == null ? other.getEyesightR() == null : this.getEyesightR().equals(other.getEyesightR()))
            && (this.getEyesightCorrectL() == null ? other.getEyesightCorrectL() == null : this.getEyesightCorrectL().equals(other.getEyesightCorrectL()))
            && (this.getEyesightCorrectR() == null ? other.getEyesightCorrectR() == null : this.getEyesightCorrectR().equals(other.getEyesightCorrectR()))
            && (this.getNose() == null ? other.getNose() == null : this.getNose().equals(other.getNose()))
            && (this.getPharynx() == null ? other.getPharynx() == null : this.getPharynx().equals(other.getPharynx()))
            && (this.getOralCavity() == null ? other.getOralCavity() == null : this.getOralCavity().equals(other.getOralCavity()))
            && (this.getTooth() == null ? other.getTooth() == null : this.getTooth().equals(other.getTooth()))
            && (this.getHeart() == null ? other.getHeart() == null : this.getHeart().equals(other.getHeart()))
            && (this.getLiver() == null ? other.getLiver() == null : this.getLiver().equals(other.getLiver()))
            && (this.getLungs() == null ? other.getLungs() == null : this.getLungs().equals(other.getLungs()))
            && (this.getSpleen() == null ? other.getSpleen() == null : this.getSpleen().equals(other.getSpleen()))
            && (this.getSkin() == null ? other.getSkin() == null : this.getSkin().equals(other.getSkin()))
            && (this.getLymph() == null ? other.getLymph() == null : this.getLymph().equals(other.getLymph()))
            && (this.getLimbs() == null ? other.getLimbs() == null : this.getLimbs().equals(other.getLimbs()))
            && (this.getThyroidGland() == null ? other.getThyroidGland() == null : this.getThyroidGland().equals(other.getThyroidGland()))
            && (this.getAnus() == null ? other.getAnus() == null : this.getAnus().equals(other.getAnus()))
            && (this.getGenitourinary() == null ? other.getGenitourinary() == null : this.getGenitourinary().equals(other.getGenitourinary()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()))
            && (this.getxRays() == null ? other.getxRays() == null : this.getxRays().equals(other.getxRays()))
            && (this.getUrine() == null ? other.getUrine() == null : this.getUrine().equals(other.getUrine()))
            && (this.getElectrocardiogram() == null ? other.getElectrocardiogram() == null : this.getElectrocardiogram().equals(other.getElectrocardiogram()))
            && (this.getUltrasonic() == null ? other.getUltrasonic() == null : this.getUltrasonic().equals(other.getUltrasonic()))
            && (this.getLiverFunction() == null ? other.getLiverFunction() == null : this.getLiverFunction().equals(other.getLiverFunction()))
            && (this.getGynecology() == null ? other.getGynecology() == null : this.getGynecology().equals(other.getGynecology()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckNo() == null) ? 0 : getCheckNo().hashCode());
        result = prime * result + ((getStaffNo() == null) ? 0 : getStaffNo().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getHobby() == null) ? 0 : getHobby().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getBloodPressureH() == null) ? 0 : getBloodPressureH().hashCode());
        result = prime * result + ((getBloodPressureL() == null) ? 0 : getBloodPressureL().hashCode());
        result = prime * result + ((getEyesightL() == null) ? 0 : getEyesightL().hashCode());
        result = prime * result + ((getEyesightR() == null) ? 0 : getEyesightR().hashCode());
        result = prime * result + ((getEyesightCorrectL() == null) ? 0 : getEyesightCorrectL().hashCode());
        result = prime * result + ((getEyesightCorrectR() == null) ? 0 : getEyesightCorrectR().hashCode());
        result = prime * result + ((getNose() == null) ? 0 : getNose().hashCode());
        result = prime * result + ((getPharynx() == null) ? 0 : getPharynx().hashCode());
        result = prime * result + ((getOralCavity() == null) ? 0 : getOralCavity().hashCode());
        result = prime * result + ((getTooth() == null) ? 0 : getTooth().hashCode());
        result = prime * result + ((getHeart() == null) ? 0 : getHeart().hashCode());
        result = prime * result + ((getLiver() == null) ? 0 : getLiver().hashCode());
        result = prime * result + ((getLungs() == null) ? 0 : getLungs().hashCode());
        result = prime * result + ((getSpleen() == null) ? 0 : getSpleen().hashCode());
        result = prime * result + ((getSkin() == null) ? 0 : getSkin().hashCode());
        result = prime * result + ((getLymph() == null) ? 0 : getLymph().hashCode());
        result = prime * result + ((getLimbs() == null) ? 0 : getLimbs().hashCode());
        result = prime * result + ((getThyroidGland() == null) ? 0 : getThyroidGland().hashCode());
        result = prime * result + ((getAnus() == null) ? 0 : getAnus().hashCode());
        result = prime * result + ((getGenitourinary() == null) ? 0 : getGenitourinary().hashCode());
        result = prime * result + ((getOthers() == null) ? 0 : getOthers().hashCode());
        result = prime * result + ((getxRays() == null) ? 0 : getxRays().hashCode());
        result = prime * result + ((getUrine() == null) ? 0 : getUrine().hashCode());
        result = prime * result + ((getElectrocardiogram() == null) ? 0 : getElectrocardiogram().hashCode());
        result = prime * result + ((getUltrasonic() == null) ? 0 : getUltrasonic().hashCode());
        result = prime * result + ((getLiverFunction() == null) ? 0 : getLiverFunction().hashCode());
        result = prime * result + ((getGynecology() == null) ? 0 : getGynecology().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkNo=").append(checkNo);
        sb.append(", staffNo=").append(staffNo);
        sb.append(", date=").append(date);
        sb.append(", status=").append(status);
        sb.append(", hobby=").append(hobby);
        sb.append(", high=").append(high);
        sb.append(", weight=").append(weight);
        sb.append(", bloodPressureH=").append(bloodPressureH);
        sb.append(", bloodPressureL=").append(bloodPressureL);
        sb.append(", eyesightL=").append(eyesightL);
        sb.append(", eyesightR=").append(eyesightR);
        sb.append(", eyesightCorrectL=").append(eyesightCorrectL);
        sb.append(", eyesightCorrectR=").append(eyesightCorrectR);
        sb.append(", nose=").append(nose);
        sb.append(", pharynx=").append(pharynx);
        sb.append(", oralCavity=").append(oralCavity);
        sb.append(", tooth=").append(tooth);
        sb.append(", heart=").append(heart);
        sb.append(", liver=").append(liver);
        sb.append(", lungs=").append(lungs);
        sb.append(", spleen=").append(spleen);
        sb.append(", skin=").append(skin);
        sb.append(", lymph=").append(lymph);
        sb.append(", limbs=").append(limbs);
        sb.append(", thyroidGland=").append(thyroidGland);
        sb.append(", anus=").append(anus);
        sb.append(", genitourinary=").append(genitourinary);
        sb.append(", others=").append(others);
        sb.append(", xRays=").append(xRays);
        sb.append(", urine=").append(urine);
        sb.append(", electrocardiogram=").append(electrocardiogram);
        sb.append(", ultrasonic=").append(ultrasonic);
        sb.append(", liverFunction=").append(liverFunction);
        sb.append(", gynecology=").append(gynecology);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}