package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Uh05HealthStudent;
import com.zhongshan.entity.Uh05HealthStudentM;
import com.zhongshan.entity.Uh05Student;
import com.zhongshan.service.Uh05HealthStudentMService;
import com.zhongshan.service.Uh05HealthStudentService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "学生体检",tags = "(保健档案管理子系统)学生体检管理接口")
public class StudentsMedicalController {
    @Resource
    private Uh05HealthStudentService uh05HealthStudentService;
    @RequestMapping(value = "/insertStudentsMedical")
    @ApiOperation(value = "逐条录入学生体检信息",httpMethod = "GET")
    public R insertStudentsMedical(Uh05HealthStudent uh05HealthStudent){
        return uh05HealthStudentService.insertStudentsMedical(uh05HealthStudent);
    }
    @RequestMapping(value = "/deleteStudentsMedical")
    @ApiOperation(value = "删除学生体检信息",httpMethod = "GET")
    public R deleteStudentsMedical(Uh05HealthStudent uh05HealthStudent){
        return uh05HealthStudentService.deleteStudentsMedical(uh05HealthStudent);
    }
    @RequestMapping(value = "/updateStudentsMedical")
    @ApiOperation(value = "修改学生体检信息",httpMethod = "GET")
    public R updateStudentsMedical(Uh05HealthStudent uh05HealthStudent){
        return uh05HealthStudentService.updateStudentsMedical(uh05HealthStudent);
    }
    @RequestMapping(value = "/queryStudentsMedical")
    @ApiOperation(value = "查询学生体检信息",httpMethod = "GET")
    public R queryStudentsMedical(Uh05HealthStudent uh05HealthStudent){
        return uh05HealthStudentService.queryStudentsMedical(uh05HealthStudent);
    }
//    @RequestMapping(value = "/bulkInsertStudentsMedical",method = RequestMethod.POST)
//    @ApiOperation(value = "批量录入学生体检信息",httpMethod = "POST")
//    public R bulkInsertStudentsMedical(Uh05HealthStudent uh05HealthStudent){
//        return R.ok();
//    }
    //学生高考体检表
    @Resource
    private Uh05HealthStudentMService uh05HealthStudentMService;
    @RequestMapping(value = "/insertStudentsMedicalGao")
    @ApiOperation(value = "逐条录入学生高考体检信息",httpMethod = "GET")
    public R insertStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM){
        return uh05HealthStudentMService.insertStudentsMedicalGao(uh05HealthStudentM);
    }
    @RequestMapping(value = "/deleteStudentsMedicalGao")
    @ApiOperation(value = "删除学生高考体检信息",httpMethod = "GET")
    public R deleteStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM){
        return uh05HealthStudentMService.deleteStudentsMedicalGao(uh05HealthStudentM);
    }
    @RequestMapping(value = "/updateStudentsMedicalGao")
    @ApiOperation(value = "修改学生高考体检信息",httpMethod = "GET")
    public R updateStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM){
        return uh05HealthStudentMService.updateStudentsMedicalGao(uh05HealthStudentM);
    }
    @RequestMapping(value = "/queryStudentsMedicalGao")
    @ApiOperation(value = "查询学生高考体检信息",httpMethod = "GET")
    public R queryStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM){
        return uh05HealthStudentMService.queryStudentsMedicalGao(uh05HealthStudentM);
    }
//    @RequestMapping(value = "/bulkInsertStudentsMedicalGao",method = RequestMethod.POST)
//    @ApiOperation(value = "批量录入学生高考体检信息",httpMethod = "POST")
//    public R bulkInsertStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM){
//        return R.ok();
//    }
}
