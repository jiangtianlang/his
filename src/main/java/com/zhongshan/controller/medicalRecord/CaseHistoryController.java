package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03OnStoreC;
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
        @ApiOperation(value = "查询病历信息", notes = "", httpMethod = "GET", response = String.class)
        public R findAll() {
                List<CaseHistory> list=caseHistoryService.queryAll();
                if (list.size()>0) {
                        return R.ok().data("data",list).message("查询成功");
                }else {
                       return R.ok().message("查询失败");
                }
        }

        @RequestMapping(value = "findByIcd", method = RequestMethod.POST)
        @ApiOperation(value = "查询信息接口", notes = "根据编码查询信息", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "chNum", value = "病案号", paramType = "query", dataType = "String", required = true)
        public R findByIcd(String chNum) {
                return R.ok().data("data",caseHistoryService.findByChNum(chNum)).message("查询成功");
        }

        @RequestMapping(value = "insert", method = RequestMethod.POST)
        @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
        public R insert(@RequestBody CaseHistory caseHistory) {
                int row =caseHistoryService.insert(caseHistory);
                if (row>0) {
                        return R.ok().message("添加成功");
                }
                else if(row==-4){
                        return R.ok().message("该病历已存在");
                }
                else {
                        return R.ok().message("添加失败");
                }
        }

        @RequestMapping(value = "update", method = RequestMethod.POST)
        @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
        public R update(@RequestBody CaseHistory caseHistory) {
           int row =caseHistoryService.updateBy(caseHistory);
                if (row>0) {
                        return R.ok().message("修改成功");
                }else {
                        return R.ok().message("修改失败");
                }
        }


        @RequestMapping(value = "deleteByfgNum", method = RequestMethod.POST)
        @ApiOperation(value = "病历病案号删除接口", notes = "输入病案号", httpMethod = "POST", response = String.class)
        @ApiImplicitParam(name = "chNum", value = "病案号", paramType = "query", dataType = "String", required = true)

        public R deleteBychNum(String chNum) {
                return   this.caseHistoryService.removeById(chNum)?R.ok().message("删除成功"):R.ok().message("删除失败");
        }
    }
