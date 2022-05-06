package com.zhongshan.controller.personBase;

import com.zhongshan.entity.SectionCode;
import com.zhongshan.service.personBase.SectionCodeService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "科室基本资料test",tags = "(人事管理子系统)科室数据接口API")
public class SectionCodeController {
    @Resource
    private SectionCodeService sectionCodeService;
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
