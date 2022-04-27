package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.MedicineType;
import com.zhongshan.service.MedicineTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (MedicineType)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@RestController
@RequestMapping("medicineType")
public class MedicineTypeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MedicineTypeService medicineTypeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param medicineType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MedicineType> page, MedicineType medicineType) {
        return success(this.medicineTypeService.page(page, new QueryWrapper<>(medicineType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.medicineTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param medicineType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MedicineType medicineType) {
        return success(this.medicineTypeService.save(medicineType));
    }

    /**
     * 修改数据
     *
     * @param medicineType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MedicineType medicineType) {
        return success(this.medicineTypeService.updateById(medicineType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.medicineTypeService.removeByIds(idList));
    }
}
