package com.zhongshan.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.UserAuth;
import com.zhongshan.service.UserAuthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UserAuth)表控制层
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@RestController
@RequestMapping("userAuth")
public class UserAuthController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserAuthService userAuthService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param userAuth 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UserAuth> page, UserAuth userAuth) {
        return success(this.userAuthService.page(page, new QueryWrapper<>(userAuth)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.userAuthService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userAuth 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UserAuth userAuth) {
        return success(this.userAuthService.save(userAuth));
    }

    /**
     * 修改数据
     *
     * @param userAuth 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UserAuth userAuth) {
        return success(this.userAuthService.updateById(userAuth));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userAuthService.removeByIds(idList));
    }
}
