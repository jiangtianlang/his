package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh03StoreOutC;
import com.zhongshan.service.Uh03StoreOutCService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh03StoreOutC)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:30
 */
@RestController
@RequestMapping("uh03StoreOutC")
public class Uh03StoreOutCController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Uh03StoreOutCService uh03StoreOutCService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh03StoreOutC 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh03StoreOutC> page, Uh03StoreOutC uh03StoreOutC) {
        return success(this.uh03StoreOutCService.page(page, new QueryWrapper<>(uh03StoreOutC)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uh03StoreOutCService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh03StoreOutC 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh03StoreOutC uh03StoreOutC) {
        return success(this.uh03StoreOutCService.save(uh03StoreOutC));
    }

    /**
     * 修改数据
     *
     * @param uh03StoreOutC 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh03StoreOutC uh03StoreOutC) {
        return success(this.uh03StoreOutCService.updateById(uh03StoreOutC));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uh03StoreOutCService.removeByIds(idList));
    }
}
