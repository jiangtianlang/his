package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.SectionCode;
import com.zhongshan.entity.Uh03PriceCDbf;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.entity.inpatient.Uh04LongRecipe;
import com.zhongshan.mapper.SectionCodeMapper;
import com.zhongshan.mapper.Uh04CrueInfoExpenseMapper;
import com.zhongshan.mapper.inpatient.SubjectMapper;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.service.inpatient.Uh04LongRecipeService;
import com.zhongshan.mapper.Uh04LongRecipeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【uh04_long_recipe】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh04LongRecipeServiceImpl extends ServiceImpl<Uh04LongRecipeMapper, Uh04LongRecipe>
    implements Uh04LongRecipeService{

    @Resource
    private Uh04CrueInfoExpenseMapper uh04CrueInfoExpenseMapper;
    @Resource
    private SectionCodeMapper sectionCodeMapper;
    @Resource
    private SubjectMapper subjectMapper;
    @Resource
    private Uh03PriceCDbfService uh03PriceCDbfService;

    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean save(Uh04LongRecipe entity) {
        //获取药品信息
        Uh03PriceCDbf uh03PriceCDbf = uh03PriceCDbfService.getById(entity.getMedicineCode());
        entity.setMedicineGauge(uh03PriceCDbf.getSpecification());
        entity.setMedicineName(uh03PriceCDbf.getMediName());
        entity.setQuality(uh03PriceCDbf.getQuality());
        entity.setUnitPrice(uh03PriceCDbf.getUnitPrice());
        entity.setExponse(entity.getMedicineNum()*uh03PriceCDbf.getUnitPrice());
        //每笔记录输入完毕后,自动将有关内容填入“分户医疗费用明细表”中。
        Uh04CrueInfoExpense infoExpense = new Uh04CrueInfoExpense(entity);
        SectionCode sectionCode = sectionCodeMapper.selectById(entity.getSectionCode());
        infoExpense.setSectionCode(sectionCode.getSectionName());
        Subject subject = subjectMapper.selectById(entity.getCureType());
        infoExpense.setCureType(subject.getSubjectName());
        uh04CrueInfoExpenseMapper.insert(infoExpense);
        return super.save(entity);
    }
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean updateById(Uh04LongRecipe entity) {
        //获取药品信息
        if (entity.getMedicineCode()!=null) {
            Uh03PriceCDbf uh03PriceCDbf = uh03PriceCDbfService.getById(entity.getMedicineCode());
            entity.setMedicineGauge(uh03PriceCDbf.getSpecification());
            entity.setMedicineName(uh03PriceCDbf.getMediName());
            entity.setQuality(uh03PriceCDbf.getQuality());
            entity.setUnitPrice(uh03PriceCDbf.getUnitPrice());
            entity.setExponse(entity.getMedicineNum()*uh03PriceCDbf.getUnitPrice());
        }
        //修改记录时，自动修改“分户医疗费用明细表”中相应记录的费用字段值。
        super.updateById(entity);
        Uh04CrueInfoExpense infoExpense = new Uh04CrueInfoExpense(entity);
        QueryWrapper<Uh04CrueInfoExpense> wrapper = new QueryWrapper<>();
        wrapper.eq("recipe_id",entity.getRecipeId());
        Uh04CrueInfoExpense expense = uh04CrueInfoExpenseMapper.selectOne(wrapper);
        infoExpense.setId(expense.getId());
        SectionCode sectionCode = sectionCodeMapper.selectById(entity.getSectionCode());
        infoExpense.setSectionCode(sectionCode.getSectionName());
        Subject subject = subjectMapper.selectById(entity.getCureType());
        infoExpense.setCureType(subject.getSubjectName());
        uh04CrueInfoExpenseMapper.updateById(infoExpense);
        return super.updateById(entity);
    }
}




