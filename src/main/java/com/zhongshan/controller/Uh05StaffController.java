package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Uh05Staff;
import com.zhongshan.service.Uh05StaffService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh05Staff)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:31
 */
@RestController
@RequestMapping("uh05Staff")
public class Uh05StaffController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private Uh05StaffService uh05StaffService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh05Staff 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh05Staff> page, Uh05Staff uh05Staff) {
        return success(this.uh05StaffService.page(page, new QueryWrapper<>(uh05Staff)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.uh05StaffService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh05Staff 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh05Staff uh05Staff) {
        return success(this.uh05StaffService.save(uh05Staff));
    }

    /**
     * 修改数据
     *
     * @param uh05Staff 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh05Staff uh05Staff) {
        return success(this.uh05StaffService.updateById(uh05Staff));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.uh05StaffService.removeByIds(idList));
    }
}
