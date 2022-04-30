package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.zhongshan.service.DiagnoseService;
import com.zhongshan.service.OperationService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@Api(value = "手术情况test",tags = "(病案管理子系统)手术情况接口API")
@RequestMapping(value = "test/Operation")
public class OperationController {

        @Resource
        private OperationService operationService;

        @RequestMapping(value = "findAll", method = RequestMethod.GET)
        @ApiOperation(value = "查询手术情况信息", notes = "输入当前页码数和每页显示的条数", httpMethod = "GET", response = String.class)
        public R findAll(Operation operation, Integer page, Integer limit) {
            return R.ok().message("查询成功");
        }

        @RequestMapping(value = "findByIcd", method = RequestMethod.GET)
        @ApiOperation(value = "查询信息接口", notes = "根据病案号查询信息", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "operationNum", value = "病案号", paramType = "query", dataType = "String", required = true)
        public R findByIcd(String operationNum) {
            return R.ok().message("查询成功");
        }

        @RequestMapping(value = "insert", method = RequestMethod.POST)
        @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
        public R insert(Diagnose diagnose) {
            return R.ok().message("添加成功");
        }

        @RequestMapping(value = "update", method = RequestMethod.POST)
        @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
                @ApiImplicitParam(name = "diseaseIcd9", value = "icd-9编码", paramType = "query", dataType = "String", required = true)
        public R update(Operation operation) {
            return R.ok().message("修改成功");
        }

        @RequestMapping(value = "download", method = RequestMethod.POST)
        @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
        public R download(Operation operation) {
            return R.ok().message("下载成功");
        }

    @RequestMapping(value = "deleteByfgNum", method = RequestMethod.POST)
    @ApiOperation(value = "手术情况删除接口", notes = "输入病案号", httpMethod = "POST", response = String.class)
    @ApiImplicitParam(name = "operationNum", value = "病案号", paramType = "query", dataType = "String", required = true)

    public R deleteBychNum(String operationNum) {
        return R.ok().message("删除成功");
    }
}