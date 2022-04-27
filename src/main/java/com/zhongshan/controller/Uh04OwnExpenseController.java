package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh04OwnExpense;
import com.zhongshan.service.Uh04OwnExpenseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh04OwnExpense)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:30
 */
@RestController
@RequestMapping("uh04OwnExpense")
public class Uh04OwnExpenseController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Uh04OwnExpenseService uh04OwnExpenseService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh04OwnExpense 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh04OwnExpense> page, Uh04OwnExpense uh04OwnExpense) {
        return success(this.uh04OwnExpenseService.page(page, new QueryWrapper<>(uh04OwnExpense)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uh04OwnExpenseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh04OwnExpense 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh04OwnExpense uh04OwnExpense) {
        return success(this.uh04OwnExpenseService.save(uh04OwnExpense));
    }

    /**
     * 修改数据
     *
     * @param uh04OwnExpense 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh04OwnExpense uh04OwnExpense) {
        return success(this.uh04OwnExpenseService.updateById(uh04OwnExpense));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uh04OwnExpenseService.removeByIds(idList));
    }
}
