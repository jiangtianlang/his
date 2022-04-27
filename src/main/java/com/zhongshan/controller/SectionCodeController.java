package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.SectionCode;
import com.zhongshan.service.SectionCodeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SectionCode)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:28
 */
@RestController
@RequestMapping("sectionCode")
public class SectionCodeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SectionCodeService sectionCodeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param sectionCode 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SectionCode> page, SectionCode sectionCode) {
        return success(this.sectionCodeService.page(page, new QueryWrapper<>(sectionCode)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.sectionCodeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param sectionCode 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SectionCode sectionCode) {
        return success(this.sectionCodeService.save(sectionCode));
    }

    /**
     * 修改数据
     *
     * @param sectionCode 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SectionCode sectionCode) {
        return success(this.sectionCodeService.updateById(sectionCode));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.sectionCodeService.removeByIds(idList));
    }
}
