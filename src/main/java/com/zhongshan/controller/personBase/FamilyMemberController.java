package com.zhongshan.controller.personBase;

import com.zhongshan.entity.FamilyMember;
import com.zhongshan.service.personBase.FamilyMemberService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "家庭主要成员及主要社会资料test",tags = "(人事管理子系统)人事数据接口API")
public class FamilyMemberController {
    @Resource
    private FamilyMemberService familyMemberService;
    @RequestMapping(value = "/test/findFamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "查询家庭主要成员及主要社会关系信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R findFamilyMember(String personNo){
        FamilyMember familyMember=familyMemberService.findFamilyMember(personNo);
        return R.ok().data("data",familyMember).message("查询成功");
    }







    @RequestMapping(value = "/test/addfamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "添加人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R addfamilyMember(FamilyMember familyMember){
        return R.ok().message("添加成功");
    }
    @RequestMapping(value = "/test/selectfamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "根据Id查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectfamilyMember(String personNo){
        return R.ok().message("查询成功");
    }
    @RequestMapping(value = "/test/updatefamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "修改人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R updatefamilyMember(FamilyMember familyMember){
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "/test/delectfamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "删除人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R delectfamilyMember(String personNo){
        return R.ok().message("删除成功");
    }
}
