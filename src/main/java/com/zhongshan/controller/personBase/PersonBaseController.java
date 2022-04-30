package com.zhongshan.controller.personBase;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.entity.vo.PersonBaseVo;
import com.zhongshan.entity.vo.PersonInfo;
import com.zhongshan.service.personBase.PersonBaseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@Api(value = "人事基本资料test",tags = "人事数据接口API")
public class PersonBaseController {
    @Resource
    private PersonBaseService personBaseService;
    @RequestMapping(value = "/test/addpersonBase",method = RequestMethod.GET)
    @ApiOperation(value = "添加人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sectionNo",value = "科室编号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "personNo",value = "职工编号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "personName",value = "姓名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "personSex",value = "性别",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "marry",value = "婚否",paramType = "query",dataType = "String",required = true)
    })
    public R addpersonBase(PersonBase personBase){
        String section=personBase.getSectionNo();
        System.out.println("section========="+section);
        Random a=new Random();
        String personNo=Integer.toString(a.nextInt(100000));
        personNo=section+personNo;
        System.out.println(personNo);
        personBase.setPersonNo(personNo);
        List<PersonBase> list=personBaseService.findById(personBase.getPersonNo());
        if(list.size()!=0){
            return R.error().message("添加失败，请重新添加");
        }else{
            boolean b=personBaseService.add(personBase);
            if(b){
                return R.ok().message("添加成功");
            }
            return R.error();
        }
        }
//        @RequestMapping(value = "/test/select",method = RequestMethod.GET)
////        @ApiOperation(value = "多条件查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
////        public List<PersonBase> selectByMany(PersonBaseVo personBaseVo){
////                return personBaseService.selectByMany(personBaseVo);
////        }
        @RequestMapping(value = "/test/findByManyPage",method = RequestMethod.GET)
        @ApiOperation(value = "多条件分页查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
        public R findByManyPage(PersonBaseVo personBaseVo, Integer page, Integer limit){
                Page page1=personBaseService.findByManyPage(personBaseVo,page,limit);
            return   R.ok().data("data",page1).message("查询成功");
        }
         @RequestMapping(value = "/test/findById",method = RequestMethod.GET)
         @ApiOperation(value = "根据Id查询人事资料接口",notes = "人事Id(personNo)",httpMethod = "GET", response = String.class)
        public R findById(String personNo){
             List<PersonBase> list=personBaseService.findById(personNo);
             if(list.size()==0){
                 return R.ok().data("data",list).message("没有数据");
             }else{
                 return R.ok().data("data",list).message("查询成功");
             }
        }
        @RequestMapping(value = "/test/findByIdName",method = RequestMethod.GET)
        @ApiOperation(value = "根据编号和姓名查询人事资料接口",notes = "人事Id(personNo)和人事姓名(person_name)",httpMethod = "GET", response = String.class)
        public  R findByIdName(String personNo,String personName){
            List<PersonInfo> list=personBaseService.findByIdName(personNo,personName);
            if(list.size()!=0){
                return R.ok().data("data",list).message("查询成功");
            }else{
                return R.ok().message("没有数据");
            }
        }
        @RequestMapping(value = "/test/updateById",method = RequestMethod.GET)
        @ApiOperation(value = "修改人事资料接口",notes = "",httpMethod = "GET", response = String.class)
        public R updateById(PersonBase personBase){
            boolean b = personBaseService.updateById(personBase);
            return R.ok().message("修改成功");
        }
        @RequestMapping(value = "/test/GroupByMany",method = RequestMethod.GET)
        @ApiOperation(value = "统计各种级别各种层次人数资料接口",notes = "",httpMethod = "GET", response = String.class)
        public R GroupByMany(PersonBase personBase){
            return R.ok().message("成功");
        }
        @RequestMapping(value = "/test/GroupByAge",method = RequestMethod.GET)
        @ApiOperation(value = "统计各年龄段人数接口",notes = "",httpMethod = "GET", response = String.class)
        public R GroupByAge(){
            return R.ok().message("成功");
        }
}
