package com.zhongshan.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;

/**
 * 
 * @TableName person_base
 */
@TableName(value ="person_base")
@Data
public class PersonBase implements Serializable {
    /**
     * 非空
     */
    private String sectionNo;

    /**
     * 非空
     */
    @TableId
    private String personNo;

    /**
     * 
     */
    private String spellNo;

    /**
     * 非空
     */
    private String personName;

    /**
     * 
     */
    private String anotherNo;

    /**
     * 非空
     */
    private String personSex;

    /**
     * 
     */
    private Date birthDate;

    /**
     * 
     */
    private String capacityNo;

    /**
     * 非空。t--已婚 f—未婚
     */
    private String marry;

    /**
     * 编码
     */
    private String nativePlace;

    /**
     * 编码
     */
    private String nation;

    /**
     * 编码
     */
    private String birthPlace;

    /**
     * 
     */
    private String finishDate;

    /**
     * 
     */
    private String finishSchool;

    /**
     * 
     */
    private String familyAddres;

    /**
     * 编码
     */
    private String degree;

    /**
     * 
     */
    private String degreeDate;

    /**
     * 编码
     */
    private String highSchooling;

    /**
     * 
     */
    private String schoolName;

    /**
     * 编码
     */
    private String postNo;

    /**
     * 编码
     */
    private String titleNo;

    /**
     * 
     */
    private String postDate;

    /**
     * 
     */
    private Double postWage;

    /**
     * 
     */
    private String health;

    /**
     * 
     */
    private String inParty;

    /**
     * 
     */
    private String portyDate;

    /**
     * 
     */
    private String inWorkDate;

    /**
     * 
     */
    private String inZsuDate;

    /**
     * 
     */
    private String specialityDate;
    @TableLogic
    private Integer isDelete;

    /**
     * 
     */
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}