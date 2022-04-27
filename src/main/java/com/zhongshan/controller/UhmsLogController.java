package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.UhmsLog;
import com.zhongshan.service.UhmsLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UhmsLog)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@RestController
@RequestMapping("uhmsLog")
public class UhmsLogController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UhmsLogService uhmsLogService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uhmsLog 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UhmsLog> page, UhmsLog uhmsLog) {
        return success(this.uhmsLogService.page(page, new QueryWrapper<>(uhmsLog)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uhmsLogService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uhmsLog 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UhmsLog uhmsLog) {
        return success(this.uhmsLogService.save(uhmsLog));
    }

    /**
     * 修改数据
     *
     * @param uhmsLog 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UhmsLog uhmsLog) {
        return success(this.uhmsLogService.updateById(uhmsLog));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uhmsLogService.removeByIds(idList));
    }
}
