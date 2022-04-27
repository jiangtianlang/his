package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Persons;
import com.zhongshan.service.PersonsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Persons)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@RestController
@RequestMapping("persons")
public class PersonsController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PersonsService personsService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param persons 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Persons> page, Persons persons) {
        return success(this.personsService.page(page, new QueryWrapper<>(persons)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.personsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param persons 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Persons persons) {
        return success(this.personsService.save(persons));
    }

    /**
     * 修改数据
     *
     * @param persons 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Persons persons) {
        return success(this.personsService.updateById(persons));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.personsService.removeByIds(idList));
    }
}
