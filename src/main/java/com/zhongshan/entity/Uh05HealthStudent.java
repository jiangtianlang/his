package com.zhongshan.entity;

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
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
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
}