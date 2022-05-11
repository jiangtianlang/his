package com.zhongshan.controller.freecure;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.Persons;
import com.zhongshan.service.PersonsService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Persons)表控制层
 *
 * @author makejava
 * @since 2022-05-09 11:14:33
 */
@RestController
@RequestMapping("persons")
@Api(tags = "(公费医疗)人员基本资料接口")
public class PersonsController  {
    /**
     * 服务对象
     */
    @Resource
    private PersonsService personsService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param persons 查询实体
     * @return 所有数据
     */
    @ApiOperation(value = "分页查询所有数据")
    @GetMapping
    public R selectAll(Page<Persons> page, Persons persons) {
        return R.ok().data("data",(this.personsService.list( new QueryWrapper<>(persons))));
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
        return R.ok().data("data",(this.personsService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param persons 实体对象
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据")

    @PostMapping
    public R insert(@RequestBody Persons persons) {
        return R.ok().data("data",(this.personsService.save(persons)));
    }

    /**
     * 修改数据
     *
     * @param persons 实体对象
     * @return 修改结果
     */
    @ApiOperation(value = "修改数据")

    @PutMapping
    public R update(@RequestBody Persons persons) {
        return R.ok().data("data",(this.personsService.updateById(persons)));
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
        return R.ok().data("data",(this.personsService.removeByIds(idList)));
    }
}

