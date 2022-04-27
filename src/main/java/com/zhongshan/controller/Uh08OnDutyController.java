package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh08OnDuty;
import com.zhongshan.service.Uh08OnDutyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh08OnDuty)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@RestController
@RequestMapping("uh08OnDuty")
public class Uh08OnDutyController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Uh08OnDutyService uh08OnDutyService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh08OnDuty 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh08OnDuty> page, Uh08OnDuty uh08OnDuty) {
        return success(this.uh08OnDutyService.page(page, new QueryWrapper<>(uh08OnDuty)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uh08OnDutyService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh08OnDuty 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh08OnDuty uh08OnDuty) {
        return success(this.uh08OnDutyService.save(uh08OnDuty));
    }

    /**
     * 修改数据
     *
     * @param uh08OnDuty 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh08OnDuty uh08OnDuty) {
        return success(this.uh08OnDutyService.updateById(uh08OnDuty));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uh08OnDutyService.removeByIds(idList));
    }
}
