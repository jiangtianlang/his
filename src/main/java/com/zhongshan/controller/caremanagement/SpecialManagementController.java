package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Contagion;
import com.zhongshan.entity.Death;
import com.zhongshan.service.ContagionService;
import com.zhongshan.service.DeathService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "特殊情况处理",tags = "(保健档案管理子系统)特殊情况处理接口API")
public class SpecialManagementController {
    @Resource
    private DeathService deathService;
    @RequestMapping(value = "/test/registrationOfDeath",method = RequestMethod.POST)
    @ApiOperation(value = "死亡登记",notes = "",httpMethod = "POST", response = String.class)
    public R registrationOfDeath(Death death){
        return deathService.registrationOfDeath(death);
    }
    @Resource
    private ContagionService contagionService;
    @RequestMapping(value = "/test/registrationOfContagion",method = RequestMethod.POST)
    @ApiOperation(value = "传染病登记",notes = "",httpMethod = "POST", response = String.class)
    public R registrationOfContagion(@RequestBody Contagion contagion){
        return contagionService.registrationOfContagion(contagion);
    }
}
