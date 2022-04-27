package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.FamilyMember;
import com.zhongshan.service.FamilyMemberService;
import com.zhongshan.mapper.FamilyMemberMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【family_member】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class FamilyMemberServiceImpl extends ServiceImpl<FamilyMemberMapper, FamilyMember>
    implements FamilyMemberService{

}




