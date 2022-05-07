package com.zhongshan.controller.inpatient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.utils.result.R;
import com.zhongshan.entity.StandardExpense;
import com.zhongshan.service.StandardExpenseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("standardExpense")
@Api(tags = "(住院管理)收费标准接口")
public class  StandardExpenseController{
    /**
     * 服务对象
     */
    @Resource
    private StandardExpenseService standardExpenseService;

    /**
     * 分页查询所有数据
     *
     * @param standardExpense 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation(value = "查询所有数据")
    public R selectAll(StandardExpense standardExpense) {
        List<StandardExpense> standardExpenses = this.standardExpenseService.list(new QueryWrapper<>(standardExpense));
        return R.ok().data("data",standardExpenses);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ApiOperation(value = "通过主键查询单条数据")
    public R selectOne(@PathVariable Serializable id) {
        StandardExpense standardExpense = this.standardExpenseService.getById(id);
        return R.ok().data("data",standardExpense);
    }

    /**
     * 新增数据
     *
     * @param standardExpense 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation(value = "新增数据")
    public R insert(@RequestBody StandardExpense standardExpense) {
        boolean save = this.standardExpenseService.save(standardExpense);
        if (save) {
            return R.ok() ;
        } else {
            return R.error() ;
        }
    }

    /**
     * 修改数据
     *
     * @param standardExpense 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation(value = "修改数据")
    public R update(@RequestBody StandardExpense standardExpense) {
        boolean b = this.standardExpenseService.updateById(standardExpense);
        if (b) {
            return R.ok() ;
        } else {
            return R.error();
        }
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        boolean b = this.standardExpenseService.removeByIds(idList);

        if (b) {
            return R.ok() ;
        } else {
            return R.error();
        }
    }
}
