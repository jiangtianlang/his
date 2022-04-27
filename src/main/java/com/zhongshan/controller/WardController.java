package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Ward;
import com.zhongshan.service.WardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Ward)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@RestController
@RequestMapping("ward")
public class WardController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WardService wardService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param ward 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Ward> page, Ward ward) {
        return success(this.wardService.page(page, new QueryWrapper<>(ward)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wardService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param ward 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Ward ward) {
        return success(this.wardService.save(ward));
    }

    /**
     * 修改数据
     *
     * @param ward 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Ward ward) {
        return success(this.wardService.updateById(ward));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wardService.removeByIds(idList));
    }
}
