package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.inpatient.Uh04WardBedSum;
import com.zhongshan.service.inpatient.Uh04WardBedSumService;
import com.zhongshan.utils.result.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh04WardBedSum)表控制层
 *
 * @author makejava
 * @since 2022-04-29 21:28:16
 */
@RestController
@RequestMapping("uh04WardBedSum")
public class Uh04WardBedSumController {
    /**
     * 服务对象
     */
    @Resource
    private Uh04WardBedSumService uh04WardBedSumService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh04WardBedSum 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh04WardBedSum> page, Uh04WardBedSum uh04WardBedSum) {
        return R.ok().data("data",this.uh04WardBedSumService.page(page, new QueryWrapper<>(uh04WardBedSum)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok().data("data",this.uh04WardBedSumService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh04WardBedSum 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh04WardBedSum uh04WardBedSum) {
        return R.ok().data("data",this.uh04WardBedSumService.save(uh04WardBedSum));
    }

    /**
     * 修改数据
     *
     * @param uh04WardBedSum 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh04WardBedSum uh04WardBedSum) {
        return R.ok().data("data",this.uh04WardBedSumService.updateById(uh04WardBedSum));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return R.ok().data("data",this.uh04WardBedSumService.removeByIds(idList));
    }
}

