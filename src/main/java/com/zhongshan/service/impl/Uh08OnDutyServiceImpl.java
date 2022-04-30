package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh08OnDuty;
import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.mapper.Uh08OnDutyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh08_on_duty】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh08OnDutyServiceImpl extends ServiceImpl<Uh08OnDutyMapper, Uh08OnDuty>
    implements Uh08OnDutyService{
    @Resource
    private Uh08OnDutyMapper uh08OnDutyMapper;
    @Override
    public List<Uh08OnDuty> selectDepartment(String department) {
      // uh08OnDutyMapper.selectList();
        String branchOfWork="02";
        LambdaQueryWrapper<Uh08OnDuty> wrapper=new LambdaQueryWrapper<>();
        Date date=new Date();
        wrapper.eq(department!=null,Uh08OnDuty::getDepartment,department);
        wrapper.eq(date!=null,Uh08OnDuty::getWorkDate,department);
        wrapper.eq(branchOfWork!=null,Uh08OnDuty::getBranchOfWork,branchOfWork);
        return uh08OnDutyMapper.selectList(wrapper);
    }
}




