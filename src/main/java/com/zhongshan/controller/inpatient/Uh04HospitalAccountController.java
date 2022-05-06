package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.inpatient.Uh04HospitalAccount;
import com.zhongshan.service.inpatient.Uh04HospitalAccountService;
import com.zhongshan.utils.result.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Uh04HospitalAccount)表控制层
 *
 * @author makejava
 * @since 2022-04-29 21:28:16
 */
@RestController
@RequestMapping("uh04HospitalAccount")
public class Uh04HospitalAccountController  {
    /**
     * 服务对象
     */
    @Resource
    private Uh04HospitalAccountService uh04HospitalAccountService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param uh04HospitalAccount 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Uh04HospitalAccount> page, Uh04HospitalAccount uh04HospitalAccount) {
        return R.ok().data("data",this.uh04HospitalAccountService.page(page, new QueryWrapper<>(uh04HospitalAccount)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok().data("data",this.uh04HospitalAccountService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param uh04HospitalAccount 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Uh04HospitalAccount uh04HospitalAccount) {
        return R.ok().data("data",this.uh04HospitalAccountService.save(uh04HospitalAccount));
    }

    /**
     * 修改数据
     *
     * @param uh04HospitalAccount 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Uh04HospitalAccount uh04HospitalAccount) {
        return R.ok().data("data",this.uh04HospitalAccountService.updateById(uh04HospitalAccount));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return R.ok().data("data",this.uh04HospitalAccountService.removeByIds(idList));
    }
}

