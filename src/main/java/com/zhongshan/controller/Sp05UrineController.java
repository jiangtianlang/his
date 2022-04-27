package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Sp05Urine;
import com.zhongshan.service.Sp05UrineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Sp05Urine)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@RestController
@RequestMapping("sp05Urine")
public class Sp05UrineController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Sp05UrineService sp05UrineService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param sp05Urine 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Sp05Urine> page, Sp05Urine sp05Urine) {
        return success(this.sp05UrineService.page(page, new QueryWrapper<>(sp05Urine)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.sp05UrineService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param sp05Urine 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Sp05Urine sp05Urine) {
        return success(this.sp05UrineService.save(sp05Urine));
    }

    /**
     * 修改数据
     *
     * @param sp05Urine 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Sp05Urine sp05Urine) {
        return success(this.sp05UrineService.updateById(sp05Urine));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.sp05UrineService.removeByIds(idList));
    }
}
