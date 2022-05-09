package com.zhongshan.controller.freecure;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.SymptomType;
import com.zhongshan.service.SymptomTypeService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SymptomType)表控制层
 *
 * @author makejava
 * @since 2022-05-09 11:14:33
 */
@RestController
@RequestMapping("test/symptomType")
@Api(tags = "(公费医疗)病种代码接口")
public class SymptomTypeController  {
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
    @ApiOperation(value = "分页查询所有数据")

    @GetMapping
    public R selectAll(Page<SymptomType> page, SymptomType symptomType) {
        return R.ok().data("data",(this.symptomTypeService.page(page, new QueryWrapper<>(symptomType))));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")

    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok().data("data",(this.symptomTypeService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param symptomType 实体对象
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据")


    @PostMapping
    public R insert(@RequestBody SymptomType symptomType) {
        return R.ok().data("data",(this.symptomTypeService.save(symptomType)));
    }

    /**
     * 修改数据
     *
     * @param symptomType 实体对象
     * @return 修改结果
     */
    @ApiOperation(value = "修改数据")

    @PutMapping
    public R update(@RequestBody SymptomType symptomType) {
        return R.ok().data("data",(this.symptomTypeService.updateById(symptomType)));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @ApiOperation(value = "删除数据")

    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return R.ok().data("data",(this.symptomTypeService.removeByIds(idList)));
    }
}

