package com.zhongshan.controller.personBase;

import com.zhongshan.entity.SectionCode;
import com.zhongshan.service.personBase.SectionCodeService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "科室基本资料test",tags = "(人事管理子系统)科室数据接口API")
public class SectionCodeController {
    @Resource
    private SectionCodeService sectionCodeService;
    @RequestMapping(value = "/test/findSectionCodeById",method = RequestMethod.GET)
    @ApiOperation(value = "查询科室信息接口",notes = "",httpMethod = "GET", response = String.class)
    public R findSectionCodeById(String sectionNo){
        if(sectionNo==null){
            List<SectionCode> list=sectionCodeService.findAll();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<SectionCode> list=sectionCodeService.findSectionCodeById(sectionNo);
            return R.ok().data("data",list).message("查询成功");
        }

    }
}
