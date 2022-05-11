package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.inpatient.Uh04LongRecipe;
import com.zhongshan.service.inpatient.Uh04LongRecipeService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh04LongRecipe)表控制层
 *
 * @author makejava
 * @since 2022-04-29 21:28:16
 */
@RestController
@RequestMapping("uh04LongRecipe")
@Api(tags = "(住院管理)长期医嘱管理接口")
public class Uh04LongRecipeController  {
    /**
     * 服务对象
     */
    @Resource
    private Uh04LongRecipeService uh04LongRecipeService;

    /**
     * 分页查询所有数据
     *
     *
     * @param uh04LongRecipe 查询实体
     * @return 所有数据
     */
    @ApiOperation(value = "查询所有数据")
    @GetMapping
    public R selectAll(Uh04LongRecipe uh04LongRecipe) {
        QueryWrapper<Uh04LongRecipe> wrapper = new QueryWrapper<>(uh04LongRecipe);
        return R.ok().data("data",this.uh04LongRecipeService.list(wrapper));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过id查询单条数据")
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok().data("data",this.uh04LongRecipeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh04LongRecipe 实体对象
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据")
    @PostMapping
    public R insert(@RequestBody Uh04LongRecipe uh04LongRecipe) {
        if (uh04LongRecipe.getMedicineNum()==0 || uh04LongRecipe.getMedicineNum()==null){
            return R.error().message("药品数量不能小于1!!");
        }
        //当录入长期医嘱时，自动将出院标志置为“F”
        uh04LongRecipe.setOutFlag(false);
        boolean save = this.uh04LongRecipeService.save(uh04LongRecipe);
        if (!save){
            return R.error().message("录入长期医嘱失败");
        }

        return R.ok().message("录入长期医嘱成功");

    }

    /**
     * 修改数据
     *
     * @param uh04LongRecipe 实体对象
     * @return 修改结果
     */
    @ApiOperation(value = "修改数据")
    @PutMapping
    public R update(@RequestBody Uh04LongRecipe uh04LongRecipe) {
        boolean save = this.uh04LongRecipeService.updateById(uh04LongRecipe);
        if (save){
            return R.ok().message("修改长期医嘱成功");
        }else {
            return R.error().message("修改长期医嘱失败");
        }
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
        return R.ok().data("data",this.uh04LongRecipeService.removeByIds(idList));
    }
}

