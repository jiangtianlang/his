package com.zhongshan.controller.businessmanagement;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "病案及保健查询",tags = "(医院业务管理子系统)病案及保健查询接口API")
public class CaseHealthCareController {
    @RequestMapping(value = "/selectCaseHealthCare",method = RequestMethod.GET)
    @ApiOperation(value = "查询不同病案的发病情况人数",notes = "",httpMethod = "GET", response = String.class)
    public R selectCaseHealthCare(String age, String person_name, String person_sex, String post_no, String title_no){
        return R.ok();
    }
}
