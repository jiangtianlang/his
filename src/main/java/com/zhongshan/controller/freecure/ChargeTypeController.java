package com.zhongshan.controller.freecure;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.ChargeType;
import com.zhongshan.service.ChargeTypeService;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ChargeType)表控制层
 *
 * @author makejava
 * @since 2022-05-09 11:12:57
 */
@RestController
@RequestMapping("chargeType")
@Api(tags = "(公费医疗)收费类型接口")
public class ChargeTypeController{
    /**
     * 服务对象
     */
    @Resource
    private ChargeTypeService chargeTypeService;

    /**
     * 分页查询所有数据
     * @param chargeType 查询实体
     * @return 所有数据
     */
    @ApiOperation(value = "分页查询所有数据")
    @GetMapping
    public ResultData selectAll(ChargeType chargeType) {
        return ResultData.ok().data(this.chargeTypeService.list(new QueryWrapper<>(chargeType)));
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
        return R.ok().data("data",(this.chargeTypeService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param chargeType 实体对象
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据")
    @PostMapping
    public R insert(@RequestBody ChargeType chargeType) {
        return R.ok().data("data",(this.chargeTypeService.save(chargeType)));
    }

    /**
     * 修改数据
     *
     * @param chargeType 实体对象
     * @return 修改结果
     */
    @ApiOperation(value = "修改数据")
    @PutMapping
    public R update(@RequestBody ChargeType chargeType) {
        return R.ok().data("data",(this.chargeTypeService.updateById(chargeType)));
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
        return R.ok().data("data",(this.chargeTypeService.removeByIds(idList)));
    }
}

