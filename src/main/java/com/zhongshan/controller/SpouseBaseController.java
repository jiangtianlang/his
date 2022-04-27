package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.SpouseBase;
import com.zhongshan.service.SpouseBaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SpouseBase)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@RestController
@RequestMapping("spouseBase")
public class SpouseBaseController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SpouseBaseService spouseBaseService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param spouseBase 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SpouseBase> page, SpouseBase spouseBase) {
        return success(this.spouseBaseService.page(page, new QueryWrapper<>(spouseBase)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.spouseBaseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param spouseBase 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SpouseBase spouseBase) {
        return success(this.spouseBaseService.save(spouseBase));
    }

    /**
     * 修改数据
     *
     * @param spouseBase 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SpouseBase spouseBase) {
        return success(this.spouseBaseService.updateById(spouseBase));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.spouseBaseService.removeByIds(idList));
    }
}
