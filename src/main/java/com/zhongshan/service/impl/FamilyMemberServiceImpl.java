package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.FamilyMemberDao;
import com.zhongshan.entity.FamilyMember;
import com.zhongshan.service.FamilyMemberService;
import org.springframework.stereotype.Service;

/**
 * (FamilyMember)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("familyMemberService")
public class FamilyMemberServiceImpl extends ServiceImpl<FamilyMemberDao, FamilyMember> implements FamilyMemberService {

}
