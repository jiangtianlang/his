package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.OutpatientSubjects;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.service.OutpatientSubjectsService;
import com.zhongshan.service.inpatient.SubjectService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "门诊科目test",tags = "（门诊子系统）门诊科目数据接口API")
public class OutpatientSubjectsController {
    @Resource
    private OutpatientSubjectsService outpatientSubjectsService;
    @RequestMapping(value = "/test/addSubject",method = RequestMethod.GET)
    @ApiOperation(value = "添加门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R addSubject(OutpatientSubjects outpatientSubjects){
        boolean b=outpatientSubjectsService.addSubject(outpatientSubjects);
        return R.ok().message("添加成功");
    }
    @RequestMapping(value = "/test/deleteSubject",method = RequestMethod.GET)
    @ApiOperation(value = "删除门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteSubject(String subjectNo){
        int inum = Integer.parseInt(subjectNo);
        return this.outpatientSubjectsService.removeById(inum)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
    @RequestMapping(value = "/test/updateSubject",method = RequestMethod.GET)
    @ApiOperation(value = "修改门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    private R updateSubject(OutpatientSubjects outpatientSubjects){
        boolean b=outpatientSubjectsService.updateSubject(outpatientSubjects);
        if(b){
            return R.ok().message("修改成功");
        }else{
        return R.error().message("修改失败");
        }
    }
    @RequestMapping(value = "/test/selectSubject",method = RequestMethod.GET)
    @ApiOperation(value = "查询门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectSubject(String subjectName){
        if(subjectName==null){
            List<OutpatientSubjects> list=outpatientSubjectsService.selectAllSubject();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<OutpatientSubjects> list=outpatientSubjectsService.selectSubject(subjectName);
            return R.ok().data("data",list).message("查询成功");
        }
    }
}
