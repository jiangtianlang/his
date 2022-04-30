package com.zhongshan.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data   //自动 产生 getset
@AllArgsConstructor  //所以参数的构造器
@NoArgsConstructor //无参构造器
@ToString
public class PersonInfo {
    private String personNo;
    private String sectionNo;
    private String spellNo;
    private String personName;
    private String anotherNo;
    private String personSex;
    private Date birthDate;
    private String capacityNo;
    private String marry;
    private String nativePlace;
    private String nation;
    private String birthPlace;
    private String finishDate;
    private String finishSchool;
    private String familyAddres;
    private String degree;
    private String degreeDate;
    private String highSchooling;
    private String schoolName;
    private String postNo;
    private String titleNo;
    private String postDate;
    private Double postWage;
    private String health;
    private String inParty;
    private String portyDate;
    private String inWorkDate;
    private String inZsuDate;
    private String specialityDate;
    private String remarks;
    private String historyFrom;
    private String historyTo;
    private String workPlace;
    private String memberName;
    private String memberSex;
    private Date memberBirthDate;
    private String memberParty;
    private String memberWorkUnit;
    private String relation;
}
