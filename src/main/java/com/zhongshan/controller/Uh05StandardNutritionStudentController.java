package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh05StandardNutritionStudent;
import com.zhongshan.service.Uh05StandardNutritionStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh05StandardNutritionStudent)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@RestController
@RequestMapping("uh05StandardNutritionStudent")
public class Uh05StandardNutritionStudentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Uh05StandardNutritionStudentService uh05StandardNutritionStudentService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh05StandardNutritionStudent 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh05StandardNutritionStudent> page, Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        return success(this.uh05StandardNutritionStudentService.page(page, new QueryWrapper<>(uh05StandardNutritionStudent)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uh05StandardNutritionStudentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh05StandardNutritionStudent 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        return success(this.uh05StandardNutritionStudentService.save(uh05StandardNutritionStudent));
    }

    /**
     * 修改数据
     *
     * @param uh05StandardNutritionStudent 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        return success(this.uh05StandardNutritionStudentService.updateById(uh05StandardNutritionStudent));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uh05StandardNutritionStudentService.removeByIds(idList));
    }
}
