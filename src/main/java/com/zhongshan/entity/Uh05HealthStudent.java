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
 * @TableName uh05_health_student
 */
@TableName(value ="uh05_health_student")
@Data
public class Uh05HealthStudent implements Serializable {
    /**
     * 体检单号
     */
    @TableId
    private Integer checkNo;

    /**
     * 学号
     */
    private Integer studentNo;

    /**
     * 体检日期
     */
    private Date studentTime;

    /**
     * 身高
     */
    private Double hight;

    /**
     * 体重
     */
    private Double weight;

    /**
     * 胸围
     */
    private Double chestMeasur;

    /**
     * 肺活量
     */
    private Double vitalCapacity;

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
     * 左沙眼
     */
    private String trachomaL;

    /**
     * 右沙眼
     */
    private String trachomaR;

    /**
     * 辩色力
     */
    private String achromatopsia;

    /**
     * 血压（高）
     */
    private Double bloodPressureH;

    /**
     * 血压（低）
     */
    private Double bloodPressureL;

    /**
     * 心
     */
    private String heart;

    /**
     * 肺
     */
    private String liver;

    /**
     * 肝
     */
    private String lungs;

    /**
     * 脾
     */
    private String spleen;

    /**
     * 口腔
     */
    private String oralCavity;

    /**
     * 耳
     */
    private String ear;

    /**
     * 鼻
     */
    private String nose;

    /**
     * 喉
     */
    private String throat;

    /**
     * 左听力
     */
    private String auditionL;

    /**
     * 右听力
     */
    private String auditionR;

    /**
     * 甲状腺
     */
    private String thyroid;

    /**
     * 淋巴腺
     */
    private String lymph;

    /**
     * 脊柱
     */
    private String rachis;

    /**
     * 上肢（正常  残废）
     */
    private String limbUp;

    /**
     * 下肢（正常  残废）
     */
    private String limbLower;

    /**
     * 生殖器
     */
    private String genitourinary;

    /**
     * 小儿麻痹（正常  上  下  上左  上右
下左  下右）
     */
    private String poliomyelitis;

    /**
     * 肛门
     */
    private String anus;

    /**
     * 皮肤
     */
    private String skin;

    /**
     * 胸透
     */
    private String xRays;

    /**
     * 检验
     */
    private String inspection;

    /**
     * 身高标准
     */
    private String standardHigh;

    /**
     * 体重标准
     */
    private String standardWeight;

    /**
     * 营养标准
     */
    private String standardNutrition;

    /**
     * 其它
     */
    private String others;

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
        Uh05HealthStudent other = (Uh05HealthStudent) that;
        return (this.getCheckNo() == null ? other.getCheckNo() == null : this.getCheckNo().equals(other.getCheckNo()))
            && (this.getStudentNo() == null ? other.getStudentNo() == null : this.getStudentNo().equals(other.getStudentNo()))
            && (this.getStudentTime() == null ? other.getStudentTime() == null : this.getStudentTime().equals(other.getStudentTime()))
            && (this.getHight() == null ? other.getHight() == null : this.getHight().equals(other.getHight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getChestMeasur() == null ? other.getChestMeasur() == null : this.getChestMeasur().equals(other.getChestMeasur()))
            && (this.getVitalCapacity() == null ? other.getVitalCapacity() == null : this.getVitalCapacity().equals(other.getVitalCapacity()))
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
            && (this.getSpleen() == null ? other.getSpleen() == null : this.getSpleen().equals(other.getSpleen()))
            && (this.getOralCavity() == null ? other.getOralCavity() == null : this.getOralCavity().equals(other.getOralCavity()))
            && (this.getEar() == null ? other.getEar() == null : this.getEar().equals(other.getEar()))
            && (this.getNose() == null ? other.getNose() == null : this.getNose().equals(other.getNose()))
            && (this.getThroat() == null ? other.getThroat() == null : this.getThroat().equals(other.getThroat()))
            && (this.getAuditionL() == null ? other.getAuditionL() == null : this.getAuditionL().equals(other.getAuditionL()))
            && (this.getAuditionR() == null ? other.getAuditionR() == null : this.getAuditionR().equals(other.getAuditionR()))
            && (this.getThyroid() == null ? other.getThyroid() == null : this.getThyroid().equals(other.getThyroid()))
            && (this.getLymph() == null ? other.getLymph() == null : this.getLymph().equals(other.getLymph()))
            && (this.getRachis() == null ? other.getRachis() == null : this.getRachis().equals(other.getRachis()))
            && (this.getLimbUp() == null ? other.getLimbUp() == null : this.getLimbUp().equals(other.getLimbUp()))
            && (this.getLimbLower() == null ? other.getLimbLower() == null : this.getLimbLower().equals(other.getLimbLower()))
            && (this.getGenitourinary() == null ? other.getGenitourinary() == null : this.getGenitourinary().equals(other.getGenitourinary()))
            && (this.getPoliomyelitis() == null ? other.getPoliomyelitis() == null : this.getPoliomyelitis().equals(other.getPoliomyelitis()))
            && (this.getAnus() == null ? other.getAnus() == null : this.getAnus().equals(other.getAnus()))
            && (this.getSkin() == null ? other.getSkin() == null : this.getSkin().equals(other.getSkin()))
            && (this.getxRays() == null ? other.getxRays() == null : this.getxRays().equals(other.getxRays()))
            && (this.getInspection() == null ? other.getInspection() == null : this.getInspection().equals(other.getInspection()))
            && (this.getStandardHigh() == null ? other.getStandardHigh() == null : this.getStandardHigh().equals(other.getStandardHigh()))
            && (this.getStandardWeight() == null ? other.getStandardWeight() == null : this.getStandardWeight().equals(other.getStandardWeight()))
            && (this.getStandardNutrition() == null ? other.getStandardNutrition() == null : this.getStandardNutrition().equals(other.getStandardNutrition()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckNo() == null) ? 0 : getCheckNo().hashCode());
        result = prime * result + ((getStudentNo() == null) ? 0 : getStudentNo().hashCode());
        result = prime * result + ((getStudentTime() == null) ? 0 : getStudentTime().hashCode());
        result = prime * result + ((getHight() == null) ? 0 : getHight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getChestMeasur() == null) ? 0 : getChestMeasur().hashCode());
        result = prime * result + ((getVitalCapacity() == null) ? 0 : getVitalCapacity().hashCode());
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
        result = prime * result + ((getSpleen() == null) ? 0 : getSpleen().hashCode());
        result = prime * result + ((getOralCavity() == null) ? 0 : getOralCavity().hashCode());
        result = prime * result + ((getEar() == null) ? 0 : getEar().hashCode());
        result = prime * result + ((getNose() == null) ? 0 : getNose().hashCode());
        result = prime * result + ((getThroat() == null) ? 0 : getThroat().hashCode());
        result = prime * result + ((getAuditionL() == null) ? 0 : getAuditionL().hashCode());
        result = prime * result + ((getAuditionR() == null) ? 0 : getAuditionR().hashCode());
        result = prime * result + ((getThyroid() == null) ? 0 : getThyroid().hashCode());
        result = prime * result + ((getLymph() == null) ? 0 : getLymph().hashCode());
        result = prime * result + ((getRachis() == null) ? 0 : getRachis().hashCode());
        result = prime * result + ((getLimbUp() == null) ? 0 : getLimbUp().hashCode());
        result = prime * result + ((getLimbLower() == null) ? 0 : getLimbLower().hashCode());
        result = prime * result + ((getGenitourinary() == null) ? 0 : getGenitourinary().hashCode());
        result = prime * result + ((getPoliomyelitis() == null) ? 0 : getPoliomyelitis().hashCode());
        result = prime * result + ((getAnus() == null) ? 0 : getAnus().hashCode());
        result = prime * result + ((getSkin() == null) ? 0 : getSkin().hashCode());
        result = prime * result + ((getxRays() == null) ? 0 : getxRays().hashCode());
        result = prime * result + ((getInspection() == null) ? 0 : getInspection().hashCode());
        result = prime * result + ((getStandardHigh() == null) ? 0 : getStandardHigh().hashCode());
        result = prime * result + ((getStandardWeight() == null) ? 0 : getStandardWeight().hashCode());
        result = prime * result + ((getStandardNutrition() == null) ? 0 : getStandardNutrition().hashCode());
        result = prime * result + ((getOthers() == null) ? 0 : getOthers().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkNo=").append(checkNo);
        sb.append(", studentNo=").append(studentNo);
        sb.append(", studentTime=").append(studentTime);
        sb.append(", hight=").append(hight);
        sb.append(", weight=").append(weight);
        sb.append(", chestMeasur=").append(chestMeasur);
        sb.append(", vitalCapacity=").append(vitalCapacity);
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
        sb.append(", spleen=").append(spleen);
        sb.append(", oralCavity=").append(oralCavity);
        sb.append(", ear=").append(ear);
        sb.append(", nose=").append(nose);
        sb.append(", throat=").append(throat);
        sb.append(", auditionL=").append(auditionL);
        sb.append(", auditionR=").append(auditionR);
        sb.append(", thyroid=").append(thyroid);
        sb.append(", lymph=").append(lymph);
        sb.append(", rachis=").append(rachis);
        sb.append(", limbUp=").append(limbUp);
        sb.append(", limbLower=").append(limbLower);
        sb.append(", genitourinary=").append(genitourinary);
        sb.append(", poliomyelitis=").append(poliomyelitis);
        sb.append(", anus=").append(anus);
        sb.append(", skin=").append(skin);
        sb.append(", xRays=").append(xRays);
        sb.append(", inspection=").append(inspection);
        sb.append(", standardHigh=").append(standardHigh);
        sb.append(", standardWeight=").append(standardWeight);
        sb.append(", standardNutrition=").append(standardNutrition);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}