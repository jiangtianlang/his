package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.StandardExpense;
import com.zhongshan.service.StandardExpenseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (StandardExpense)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@RestController
@RequestMapping("standardExpense")
public class StandardExpenseController extends ApiController {
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
        return success(this.standardExpenseService.page(page, new QueryWrapper<>(standardExpense)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.standardExpenseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param standardExpense 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StandardExpense standardExpense) {
        return success(this.standardExpenseService.save(standardExpense));
    }

    /**
     * 修改数据
     *
     * @param standardExpense 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StandardExpense standardExpense) {
        return success(this.standardExpenseService.updateById(standardExpense));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.standardExpenseService.removeByIds(idList));
    }
}
