package com.zhongshan.controller.inpatient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.entity.vo.Income;
import com.zhongshan.service.inpatient.Uh04CrueInfoExpenseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jtl
 * @date 2022年05月07日 19:04:02
 */
@Api(tags = "(住院管理)住院部报表接口")
@RestController
@RequestMapping("test/charts")
public class ChartsController {

    @Resource
    private Uh04CrueInfoExpenseService crueInfoExpenseService;

    @ApiOperation(value = "获取年度或月份报表")
    @GetMapping
    public R selectByDate(Integer year,Integer month) {

        HashMap<String, Double> map = crueInfoExpenseService.selectByDate(year, month);
        Double inCome = 0.0;
        for(Double value: map.values()) {
            // 输出每一个value
            if (value!=null) {
                inCome += value;
            }
        }

        return R.ok().data("data",map).data("inCome",inCome);
    }
}
