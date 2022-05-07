package com.zhongshan.controller.inpatient;



import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.Persons;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.mapper.PatientBaseMapper;
import com.zhongshan.service.inpatient.PatientBaseService;
import com.zhongshan.service.inpatient.PayMoneyService;
import com.zhongshan.service.PersonsService;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultCodeEnum;
import com.zhongshan.utils.result.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.Year;
import java.util.Date;
import java.util.List;

/**
 * @author jtl
 * @date 2022年04月29日 10:39:27
 */
@Api(tags = "(住院管理)病人基本资料接口")
@RestController
@RequestMapping("/test/patientBase")
public class PatientBaseController {
    @Resource
    private PatientBaseService patientBaseService;
    @Resource
    private PersonsService personsService;//人员基本资料表
    @Resource
    private PayMoneyService payMoneyService;//预交款资料表
    @Resource
    private PatientBaseMapper patientBaseMapper;

    @ApiOperation(value = "获取病人基本资料列表")
    @GetMapping("selectPatientBase")
    public R selectPatientBase(
            @ApiParam(name = "patientBase", value = "查询对象", required = true)
                    PatientBase patientBase) {
        //按条件查询 病人基本资料查询
        //对于曾住院病人，根据其提供的住院号码自动在病案首页表中调出病人基本资料；
        QueryWrapper<PatientBase> wrapper = new QueryWrapper<>(patientBase);
        List<PatientBase> list = patientBaseService.list(wrapper);
        if(ObjectUtil.isEmpty(list)){
            //而对于第一次住院病人则自动为其产生住院号码，
            String maxId = patientBaseMapper.queryMaxId();
            if (maxId.substring(0,4).equals(Year.now().toString())) {
                patientBase.setPatientNo(Long.valueOf(maxId)+1+"");
            }else {
                patientBase.setPatientNo(Year.now()+"0000");
            }
            return R.ok().data("data",patientBase);
        }
        return R.ok().data("data",list);
    }
    @ApiOperation(value = "获取本校人员或家属基本资料")
    @GetMapping("selectPersons")
    public R selectPersons(
            @ApiParam(name = "patientBase", value = "查询对象", required = true)
                    Persons persons) {
        //按条件查询
        //如果此人为本校人员或家属，则根据其医疗证号码自动从“中大人员基本资料表”中提取个人基本资料，
        //核对身份并确定个人承担住院费用的百分比。
        QueryWrapper<Persons> wrapper = new QueryWrapper<>(persons);
        Persons result = personsService.getOne(wrapper);
        return R.ok().data("data",result);
    }

    @ApiOperation(value = "病人基本资料表录入")
    @PostMapping("add")
    public ResultData add(@RequestBody @ApiParam(name = "patientBase", value = "添加对象", required = true)
                             PatientBase patientBase) {
        //对于劳保、自费及其他人员应预交押金，且交款数额不得低于规定的下限值，
        if (patientBase.getPayMoney()<500 && patientBase.getCostType().equalsIgnoreCase("E")){
            return ResultData.error(ResultCodeEnum.PARAM_ERROR).message("预交押金不得低于500元");
        }
        patientBase.setInDate(new Date());
        return patientBaseService.savePatientBase(patientBase);

    }

    @ApiOperation(value = "病人基本资料表删除")
    @PostMapping("delete")
    public R delete(
            @RequestBody@ApiParam(name = "patientNos", value = "批量删除", required = true)
                    List<String> patientNos) {
        boolean byIds = patientBaseService.removeByIds(patientNos);
        if(byIds){
            return R.ok().message("删除成功!!");
        }else {
            return R.error();
        }
    }

    @ApiOperation(value = "病人基本资料表修改")
    @PostMapping("update")
    public R update(
            @RequestBody@ApiParam(name = "patientBase", value = "patientBase对象", required = true)
                    PatientBase patientBase) {
        boolean updateById = patientBaseService.updateById(patientBase);
        if (updateById) {
            return R.ok().message("修改成功!!");
        } else {
            return R.error();
        }
    }
}
