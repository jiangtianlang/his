package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.entity.inpatient.Uh04TemporaryRecipe;
import com.zhongshan.mapper.Uh04CrueInfoExpenseMapper;
import com.zhongshan.service.inpatient.Uh04TemporaryRecipeService;
import com.zhongshan.mapper.Uh04TemporaryRecipeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【uh04_temporary_recipe】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh04TemporaryRecipeServiceImpl extends ServiceImpl<Uh04TemporaryRecipeMapper, Uh04TemporaryRecipe>
    implements Uh04TemporaryRecipeService{
    @Resource
    private Uh04CrueInfoExpenseMapper uh04CrueInfoExpenseMapper;
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean save(Uh04TemporaryRecipe entity) {
        //每笔记录输入完毕后,自动将有关内容填入“分户医疗费用明细表”中。
        try {
            super.save(entity);
            Uh04CrueInfoExpense infoExpense = new Uh04CrueInfoExpense(entity);
            uh04CrueInfoExpenseMapper.insert(infoExpense);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public boolean updateById(Uh04TemporaryRecipe entity) {
        //修改记录时，自动修改“分户医疗费用明细表”中相应记录的费用字段值。
        try {
            super.updateById(entity);
            Uh04CrueInfoExpense infoExpense = new Uh04CrueInfoExpense(entity);
            QueryWrapper<Uh04CrueInfoExpense> wrapper = new QueryWrapper<>();
            wrapper.eq("recipe_id",entity.getRecipeId());
            Uh04CrueInfoExpense expense = uh04CrueInfoExpenseMapper.selectOne(wrapper);
            infoExpense.setId(expense.getId());
            uh04CrueInfoExpenseMapper.updateById(infoExpense);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}




