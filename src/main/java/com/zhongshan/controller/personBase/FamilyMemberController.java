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
    @ApiOperation(value = "根据Id查询家庭主要成员及主要社会关系信息接口",notes = "personNo",httpMethod = "GET", response = String.class)
    public R findFamilyMember(String personNo){
        FamilyMember familyMember=familyMemberService.findFamilyMember(personNo);
        if(familyMember!=null){
            return R.ok().data("data",familyMember).message("查询成功");
        }else{
            return R.ok().data("data",familyMember).message("无数据");
        }

    }
    @RequestMapping(value = "/test/addFamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "新增家庭主要成员及主要社会关系信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R addFamilyMember(FamilyMember familyMember){
        boolean b=familyMemberService.addFamilyMember(familyMember);
        if(b){
            return R.ok().message("新增成功");
        }else{
            return R.error().message("新增失败");
        }
    }
    @RequestMapping(value = "/test/updataFamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "新增家庭主要成员及主要社会关系信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R updataFamilyMember(FamilyMember familyMember){
        boolean b=familyMemberService.updataFamilyMember(familyMember);
        if(b){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }
    @RequestMapping(value = "/test/deleteFamilyMember",method = RequestMethod.GET)
    @ApiOperation(value = "新增家庭主要成员及主要社会关系信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteFamilyMember(String personNo){
       return this.familyMemberService.removeById(personNo)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
}
