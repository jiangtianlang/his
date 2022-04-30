package com.zhongshan.controller.businessmanagement;

import cn.hutool.core.date.DateTime;
import com.zhongshan.entity.Uh08OnDuty;
import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@Api(value = "医疗服务情况查询",tags = "(医院业务管理子系统)医疗服务情况查询接口API")
public class MedicalServicesController {
    @Resource
    private Uh08OnDutyService uh08OnDutyService;
    @RequestMapping(value = "/selectDate",method = RequestMethod.GET)
    @ApiOperation(value = "根据日期查询信息",notes = "",httpMethod = "GET", response = String.class)
    public R selectDate(String work_date){
        Date date1= DateTime.of(work_date,"YYYY-mm-dd");
        return R.ok();
    }
    @RequestMapping(value = "/selectDepartment",method = RequestMethod.GET)
    @ApiOperation(value = "根据部门查询值班名单",notes = "",httpMethod = "GET", response = String.class)
    public R selectDepartment(String department){
        List<Uh08OnDuty> list=uh08OnDutyService.selectDepartment(department);
        return R.ok().data("data",list).message("查询成功");
    }
}
