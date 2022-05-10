package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.FamilyMember;
import com.zhongshan.service.personBase.FamilyMemberService;
import com.zhongshan.mapper.FamilyMemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【family_member】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class FamilyMemberServiceImpl extends ServiceImpl<FamilyMemberMapper, FamilyMember>
    implements FamilyMemberService{
    @Resource
    private FamilyMemberMapper familyMemberMapper;
    @Override
    public FamilyMember findFamilyMember(String personNo) {
        FamilyMember familyMember=familyMemberMapper.selectById(personNo);
        return familyMember;
    }

    @Override
    public boolean addFamilyMember(FamilyMember familyMember) {
        int rows=familyMemberMapper.insert(familyMember);
        return rows>0?true:false;
    }

    @Override
    public boolean updataFamilyMember(FamilyMember familyMember) {
        int rows=familyMemberMapper.updateById(familyMember);
        return rows>0?true:false;
    }
}




