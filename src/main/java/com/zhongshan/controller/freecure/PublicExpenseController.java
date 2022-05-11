package com.zhongshan.controller.freecure;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.PublicExpense;
import com.zhongshan.service.PublicExpenseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

/**
 * (PublicExpense)表控制层
 *
 * @author makejava
 * @since 2022-05-09 11:14:33
 */
@RestController
@RequestMapping("publicExpense")
@Api(tags = "(公费医疗)公费医疗报销接口")
public class PublicExpenseController {
    /**
     * 服务对象
     */
    @Resource
    private PublicExpenseService publicExpenseService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param publicExpense 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation(value = "分页查询所有数据")

    public R selectAll(Page<PublicExpense> page, PublicExpense publicExpense) {
        return R.ok().data("data",(this.publicExpenseService.list( new QueryWrapper<>(publicExpense))));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ApiOperation(value = "通过主键查询单条数据")

    public R selectOne(@PathVariable Serializable id) {
        return R.ok().data("data",(this.publicExpenseService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param publicExpense 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation(value = "新增数据")

    public R insert(@RequestBody PublicExpense publicExpense) {
        publicExpense.setPersonNo(String.valueOf((int)(Math.random()*1000000000)));
        return R.ok().data("data",(this.publicExpenseService.save(publicExpense)));
    }

    /**
     * 修改数据
     *
     * @param publicExpense 实体对象
     * @return 修改结果
     */
    @ApiOperation(value = "修改数据")

    @PutMapping
    public R update(@RequestBody PublicExpense publicExpense) {
        return R.ok().data("data",(this.publicExpenseService.updateById(publicExpense)));
    }

    /**
     * 时间查询"
     * @param publicExpense
     * @return
     */
    @RequestMapping(value = "findDate" ,method = RequestMethod.POST)
    @ApiOperation(value = "查询药品出库接口",notes = "",httpMethod = "POST")
    public R findDate(@RequestBody PublicExpense publicExpense){
        List<PublicExpense> list=publicExpenseService.findByDate(publicExpense);
        return R.ok().data("data",list).message("查询成功");
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
        return R.ok().data("data",(this.publicExpenseService.removeByIds(idList)));
    }
}

