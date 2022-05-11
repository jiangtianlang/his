package com.zhongshan.controller.personBase;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.entity.vo.CountPeople;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@Api(value = "人事基本资料test",tags = "(人事管理子系统)人事数据接口API")
public class PersonBaseController {
    @Resource
    private PersonBaseService personBaseService;
    @RequestMapping(value = "/findByIdOrName",method = RequestMethod.GET)
    @ApiOperation(value = "单项查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R findByIdOrName(String IdOrNmae){
        System.out.println(IdOrNmae);
        if(IdOrNmae==null){
            List<PersonBase> list=personBaseService.findAll();
            return R.ok().data("data",list).message("查询成功");
        }
        boolean flag=false;
        Pattern p=Pattern.compile(".*\\d+.*");
        Matcher m=p.matcher(IdOrNmae);
        if (m.matches()) {
            //带有数字(id查询)
            List<PersonBase> list=personBaseService.findById(IdOrNmae);
            return R.ok().data("data",list).message("查询成功");
        }else{
            //不带有数字（名字查询）
            List<PersonBase> list=personBaseService.findByName(IdOrNmae);
            return R.ok().data("data",list).message("查询成功");
        }
    }
    @RequestMapping(value = "/findByManyCondition",method = RequestMethod.GET)
    @ApiOperation(value = "组合查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R findByManyCondition(PersonBase personBase){
        System.out.println(personBase.getInWorkDate());
        System.out.println("personBase.getInWorkDate()"+personBase.getInWorkDate());
        System.out.println("personBase.getPostNo()"+personBase.getPostNo());
        System.out.println("personBase.getTitleNo()"+personBase.getTitleNo());
        System.out.println("personBase.getHighSchooling()"+personBase.getHighSchooling());
        if(personBase==null){
            List<PersonBase> list=personBaseService.findAll();
            if(list.size()>0){
                return R.ok().data("data",list).message("查询成功");
            }else{
                return R.error().message("没有数据");
            }
        }else{
            if(personBase.getInWorkDate()!=null){
                personBase.setInWorkDate(personBase.getInWorkDate().replace("-", ""));
                System.out.println(personBase.getInWorkDate());
                List<PersonBase> list = personBaseService.findByManyCondition(personBase);
                if(list.size()>0){
                    return R.ok().data("data",list).message("查询成功");
                }else{
                    return R.error().message("没有数据");
                }
            }else{
                List<PersonBase> list = personBaseService.findByManyCondition(personBase);
                if(list.size()>0){
                    return R.ok().data("data",list).message("查询成功");
                }else{
                    return R.error().message("没有数据");
                }
            }
        }
    }
    @RequestMapping(value = "/findComprehensiveQuery",method = RequestMethod.GET)
    @ApiOperation(value = "综合查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    public R findComprehensiveQuery(String schoolName){
        if(schoolName==null){
            List<PersonBase> list=personBaseService.findAll();
            return R.ok().data("data",list).message("查询成功");
        }else {
        List<PersonBase> list=personBaseService.findComprehensiveQuery(schoolName);
        return R.ok().data("data",list).message("查询成功");
        }
    }
    @RequestMapping(value = "/findPersonBase",method = RequestMethod.GET)
    @ApiOperation(value = "查询个人详细信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R findPersonBase(String personNo){
        List<PersonBase> list=personBaseService.findById(personNo);
        return  R.ok().data("data",list).message("查询成功");
    }

    @RequestMapping(value = "/CountPeopleByMany",method = RequestMethod.GET)
    @ApiOperation(value = "统计各种级别各种层次人数接口",notes = "",httpMethod = "GET", response = String.class)
    public R CountPeopleByMany(CountPeople countPeople){
        return R.ok();
    }
    @RequestMapping(value = "/CountPeopleByAge",method = RequestMethod.GET)
    @ApiOperation(value = "统计各年龄段人数接口",notes = "",httpMethod = "GET", response = String.class)
    public R CountPeopleByAge(CountPeople countPeople){
        return R.ok();
    }
    @RequestMapping(value = "/addPersonBase",method = RequestMethod.GET)
    @ApiOperation(value = "添加人事资料接口",notes = "",httpMethod = "GET", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sectionNo",value = "科室编号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "personName",value = "姓名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "personSex",value = "性别",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "marry",value = "婚否",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "schoolName",value = "部门",paramType = "query",dataType = "String",required = true)
    })
    public R addPersonBase(PersonBase personBase){
        String section=personBase.getSectionNo();
        System.out.println("section========="+section);
        Random a=new Random();
        String personNo=Integer.toString(a.nextInt(100000));
        personNo=section+personNo;
        System.out.println(personNo);
        personBase.setPersonNo(personNo);
        List<PersonBase> list=personBaseService.findById(personNo);
        if(list.size()!=0){
            return R.error().message("网络异常，请重新添加");
        }else{
            boolean b=personBaseService.add(personBase);
            if(b){
                return R.ok().message("添加成功，您的职工号是："+personBase.getPersonNo());
            }
            return R.error();
        }
    }
         @RequestMapping(value = "/findById",method = RequestMethod.GET)
         @ApiOperation(value = "根据Id查询人事资料接口",notes = "人事Id(personNo)",httpMethod = "GET", response = String.class)
        public R findById(String personNo){
            if(personNo==null){
                List<PersonBase> list=personBaseService.selectAll();
                return R.ok().data("data",list).message("查询成功");
            }
             List<PersonBase> list=personBaseService.findById(personNo);
             if(list.size()==0){
                 return R.ok().data("data",list).message("没有数据");
             }else{
                 return R.ok().data("data",list).message("查询成功");
             }
        }
        @RequestMapping(value = "/findByIdName",method = RequestMethod.GET)
        @ApiOperation(value = "根据编号查询人事资料接口",notes = "人事Id(personNo)",httpMethod = "GET", response = String.class)
        public  R findByIdName(String personNo){
            List<PersonBase> list=personBaseService.findByIdName(personNo);
            if(list.size()!=0){
                return R.ok().data("data",list).message("查询成功");
            }else{
                return R.ok().message("没有数据");
            }
        }
        @RequestMapping(value = "/updateById",method = RequestMethod.GET)
        @ApiOperation(value = "修改人事资料接口",notes = "",httpMethod = "GET", response = String.class)
        public R updateById(PersonBase personBase){
            boolean b = personBaseService.updateById(personBase);
            if(b){
            return R.ok().message("修改成功");
            }else{
                return R.error().message("修改失败");
            }
        }

//            @RequestMapping(value = "/findByManyPage",method = RequestMethod.GET)
//        @ApiOperation(value = "多条件分页查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
//        public R findByManyPage(PersonBaseVo personBaseVo, Integer page, Integer limit){
//                Page page1=personBaseService.findByManyPage(personBaseVo,page,limit);
//            return   R.ok().data("data",page1).message("查询成功");
//        }
            //        @RequestMapping(value = "/select",method = RequestMethod.GET)
//      @ApiOperation(value = "多条件查询人事资料接口",notes = "",httpMethod = "GET", response = String.class)
//      public List<PersonBase> selectByMany(PersonBaseVo personBaseVo){
//               return personBaseService.selectByMany(personBaseVo);
//       }
//        }
//        @RequestMapping(value = "/GroupByMany",method = RequestMethod.GET)
//        @ApiOperation(value = "统计各种级别各种层次人数资料接口",notes = "",httpMethod = "GET", response = String.class)
//        public R GroupByMany(PersonBase personBase){
//            return R.ok().message("成功");
//        }
//        @RequestMapping(value = "/GroupByAge",method = RequestMethod.GET)
//        @ApiOperation(value = "统计各年龄段人数接口",notes = "",httpMethod = "GET", response = String.class)
//        public R GroupByAge(){
//            return R.ok().message("成功");
//        }
}
