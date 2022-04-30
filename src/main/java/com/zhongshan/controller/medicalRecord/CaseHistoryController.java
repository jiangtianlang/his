package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.zhongshan.service.CaseHistoryService;
import com.zhongshan.service.DiagnoseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "病历test", tags = "(病案管理子系统)病历接口API")
@RequestMapping(value = "test/CsaeHistory")
public class CaseHistoryController {
        @Resource
        private CaseHistoryService caseHistoryService;

        @RequestMapping(value = "findAll", method = RequestMethod.GET)
        @ApiOperation(value = "查询手术情况信息", notes = "输入当前页码数和每页显示的条数", httpMethod = "GET", response = String.class)
        public R findAll(CaseHistory caseHistory, Integer page, Integer limit) {
            return R.ok().message("查询成功");
        }

        @RequestMapping(value = "findByIcd", method = RequestMethod.GET)
        @ApiOperation(value = "查询信息接口", notes = "根据编码查询信息", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "chNum", value = "病案号", paramType = "query", dataType = "String", required = true)
        public R findByIcd(String chNum) {
            return R.ok().message("查询成功");
        }

        @RequestMapping(value = "insert", method = RequestMethod.POST)
        @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
        public R insert(@RequestBody List<CaseHistory> caseHistory) {
            return R.ok().message("添加成功");
        }

        @RequestMapping(value = "update", method = RequestMethod.POST)
        @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "chNum", value = "病案号", paramType = "query", dataType = "String", required = true)
        public R update(@RequestBody CaseHistory caseHistory) {
            return R.ok().message("修改成功");
        }

        @RequestMapping(value = "download", method = RequestMethod.POST)
        @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
        public R download(CaseHistory caseHistory) {
            return R.ok().message("下载成功");
        }

        @RequestMapping(value = "deleteByfgNum", method = RequestMethod.POST)
        @ApiOperation(value = "病历病案号删除接口", notes = "输入病案号", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "chNum", value = "病案号", paramType = "query", dataType = "String", required = true)

        public R deleteBychNum(String chNum) {
            return R.ok().message("删除成功");
        }
    }
