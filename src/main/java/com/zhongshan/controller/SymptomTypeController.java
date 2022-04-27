package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.SymptomType;
import com.zhongshan.service.SymptomTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SymptomType)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@RestController
@RequestMapping("symptomType")
public class SymptomTypeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SymptomTypeService symptomTypeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param symptomType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SymptomType> page, SymptomType symptomType) {
        return success(this.symptomTypeService.page(page, new QueryWrapper<>(symptomType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.symptomTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param symptomType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SymptomType symptomType) {
        return success(this.symptomTypeService.save(symptomType));
    }

    /**
     * 修改数据
     *
     * @param symptomType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SymptomType symptomType) {
        return success(this.symptomTypeService.updateById(symptomType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.symptomTypeService.removeByIds(idList));
    }
}
