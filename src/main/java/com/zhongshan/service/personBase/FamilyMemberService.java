package com.zhongshan.service.personBase;

import com.zhongshan.entity.FamilyMember;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 13427
* @description 针对表【family_member】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface FamilyMemberService extends IService<FamilyMember> {

    FamilyMember findFamilyMember(String personNo);
}
