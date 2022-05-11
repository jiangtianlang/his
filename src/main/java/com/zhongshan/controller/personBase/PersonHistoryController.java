package com.zhongshan.controller.personBase;

import com.zhongshan.entity.PersonHistory;
import com.zhongshan.service.personBase.PersonHistoryService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "个人简历基本资料test",tags = "(人事管理子系统)个人简历数据接口API")
public class PersonHistoryController {
    @Resource
    private PersonHistoryService personHistoryService;
    @RequestMapping(value = "/findPersonHistory",method = RequestMethod.GET)
    @ApiOperation(value = "根据Id查询个人简历信息接口",notes = "personNo",httpMethod = "GET", response = String.class)
    public R findPersonHistory(String personNo){
        if(personNo==null){
            List<PersonHistory> list=personHistoryService.selectAllPersonHistory();
            return R.ok().data("data",list).message("查询成功");
        }else{
            PersonHistory personHistory = personHistoryService.findPersonHistory(personNo);
            return R.ok().data("data", personHistory).message("查询成功");
        }
    }
    @RequestMapping(value = "/addPersonHistory",method = RequestMethod.POST)
    @ApiOperation(value = "添加个人简历资料接口",notes = "",httpMethod = "POST", response = String.class)
    public R addPersonHistory(PersonHistory personHistory){
       boolean b=personHistoryService.add(personHistory);
       if(b){
           return R.ok().message("添加成功");
       }else{
           return R.error().message("添加失败");
       }
    }
    @RequestMapping(value = "/updatePersonHistory",method = RequestMethod.POST)
    @ApiOperation(value = "修改个人简历资料接口",notes = "",httpMethod = "POST", response = String.class)
    public R updatePersonHistory(PersonHistory personHistory){
        boolean b=personHistoryService.updateMany(personHistory);
        if(b){
        return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }
//    @RequestMapping(value = "/selectPersonHistory",method = RequestMethod.POST)
//    @ApiOperation(value = "查看个人简历资料接口",notes = "员工编号person_no",httpMethod = "POST", response = String.class)
//    public R selectPersonHistory(String personNo){
//        PersonHistory personHistory=personHistoryService.select(personNo);
//        if(personHistory!=null) {
//            return R.ok().message("查看成功");
//        }else {
//            return R.error().message("查询失败");
//        }
//    }
//    @RequestMapping(value = "/deletePersonHistory",method = RequestMethod.POST)
//    @ApiOperation(value = "删除个人简历资料接口",notes = "员工编号person_no",httpMethod = "POST", response = String.class)
//    public R deletePersonHistory(String personNo){
//        return this.personHistoryService.removeById(personNo)?R.ok().message("删除成功"):R.ok().message("删除失败");
//    }


}
