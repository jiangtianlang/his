package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.PayMoney;
import com.zhongshan.service.PayMoneyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (PayMoney)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@RestController
@RequestMapping("payMoney")
public class PayMoneyController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PayMoneyService payMoneyService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param payMoney 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PayMoney> page, PayMoney payMoney) {
        return success(this.payMoneyService.page(page, new QueryWrapper<>(payMoney)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.payMoneyService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param payMoney 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PayMoney payMoney) {
        return success(this.payMoneyService.save(payMoney));
    }

    /**
     * 修改数据
     *
     * @param payMoney 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PayMoney payMoney) {
        return success(this.payMoneyService.updateById(payMoney));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.payMoneyService.removeByIds(idList));
    }
}
