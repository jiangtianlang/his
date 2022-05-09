package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Diagnose;
import com.zhongshan.service.DiagnoseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "疾病test",tags = "(病案管理子系统)疾病接口API")
@RequestMapping(value = "test/Disease")
public class InternationaDisease {
    @Resource
    private DiagnoseService diagnoseService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有的疾病信息", notes = "", httpMethod = "GET", response = String.class)
    public R findAll() {
        List<Diagnose> list=diagnoseService.queryAll();
        if (list.size()>0) {
            return R.ok().message("查询成功");
        }else {
            return R.ok().message("没有数据");
        }
    }

    @RequestMapping(value = "findByIcd", method = RequestMethod.POST)
    @ApiOperation(value = "查询信息接口", notes = "根据条件查询信息", httpMethod = "POST", response = String.class)
     public R findByIcd(@RequestBody Diagnose diagnose) {
        List<Diagnose> list=diagnoseService.findById(diagnose);
        if (list.size()>0) {
            return R.ok().message("查询成功");
        }else {
            return R.ok().message("没有数据");
        }
    }
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
    public R insert(@RequestBody Diagnose diagnose) {
        int row =diagnoseService.insert(diagnose);
        if (row>0) {
            return R.ok().message("添加成功");
        }else {
            return R.ok().message("添加失败");
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
    public R update(@RequestBody Diagnose diagnose) {
        int row =diagnoseService.updateBytj(diagnose);
        if (row>0) {
            return R.ok().message("修改成功");
        }else {
            return R.ok().message("修改失败");
        }
    }

    @RequestMapping(value = "deleteByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "疾病删除接口",notes = "输入icd-9编码",httpMethod = "POST",response = String.class)
    public R deleteByfgNum(String diseaseIcd9){
        return   this.diagnoseService.removeById(diseaseIcd9)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
}
