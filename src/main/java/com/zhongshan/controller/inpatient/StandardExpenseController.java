package com.zhongshan.controller.inpatient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.utils.result.R;
import com.zhongshan.entity.StandardExpense;
import com.zhongshan.service.StandardExpenseService;
import io.swagger.annotations.Api;
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
     * @param page 分页对象
     * @param standardExpense 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<StandardExpense> page, StandardExpense standardExpense) {
	this.standardExpenseService.page(page, new QueryWrapper<>(standardExpense));
        return R.ok() ;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
	this.standardExpenseService.getById(id);
        return R.ok() ;
    }

    /**
     * 新增数据
     *
     * @param standardExpense 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StandardExpense standardExpense) {
        this.standardExpenseService.save(standardExpense);
	return R.ok() ;
    }

    /**
     * 修改数据
     *
     * @param standardExpense 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StandardExpense standardExpense) {
	this.standardExpenseService.updateById(standardExpense);
        return R.ok() ;
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
	this.standardExpenseService.removeByIds(idList);
        return R.ok() ;
    }
}