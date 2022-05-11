package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.zhongshan.entity.vo.OperationVo;
import com.zhongshan.service.DiagnoseService;
import com.zhongshan.service.OperationService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "手术情况test",tags = "(病案管理子系统)手术情况接口API")
@RequestMapping(value = "test/Operation")
public class OperationController {

        @Resource
        private OperationService operationService;

        @RequestMapping(value = "findAll", method = RequestMethod.GET)
        @ApiOperation(value = "查询手术情况信息", notes = "", httpMethod = "GET", response = String.class)
        public R findAll() {
            List<Operation> list=operationService.findAll();

            if (list.size()>0) {
                return R.ok().data("data",list).message("查询成功");
            }else {
                return  R.ok().message("没有数据");
            }
        }

        @RequestMapping(value = "findByIcd", method = RequestMethod.POST)
        @ApiOperation(value = "查询信息接口", notes = "根据条件查询信息", httpMethod = "POST", response = String.class)
         public R findByIcd(@RequestBody OperationVo operationVo) {
            List<OperationVo> list=operationService.findId(operationVo);
            if (list.size()>0) {
                return R.ok().data("data",list).message("查询成功");
            }else {
                return  R.ok().message("没有数据");
            }
        }

        @RequestMapping(value = "insert", method = RequestMethod.POST)
        @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
        public R insert(@RequestBody Operation operation) {
            int row =operationService.insert(operation);
            if (row>0){
                return R.ok().message("添加成功");
            }else {
                return R.ok().message("添加失败");
            }
        }

        @RequestMapping(value = "update", method = RequestMethod.POST)
        @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
                   public R update(@RequestBody Operation operation) {
            int row =operationService.updateBy(operation);
            if (row>0){
                return R.ok().message("修改成功");
            }else {
                return R.ok().message("修改失败");
            }
        }


    @RequestMapping(value = "deleteByfgNum", method = RequestMethod.POST)
    @ApiOperation(value = "手术情况删除接口", notes = "根据id删除", httpMethod = "POST", response = String.class)
    public R deleteBychNum(Integer oId) {
        return   this.operationService.removeById(oId)?R.ok().message("删除成功"):R.ok().message("删除失败");

    }
}