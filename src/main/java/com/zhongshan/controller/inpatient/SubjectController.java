package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.service.inpatient.SubjectService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Subject)表控制层
 *
 * @author makejava
 * @since 2022-04-29 21:28:16
 */
@RestController
@RequestMapping("test/subject")
@Api(tags = "(住院管理)科目编码管理接口")
public class SubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SubjectService subjectService;

    /**
     * 分页查询所有数据
     *
     *
     * @param subject 查询实体
     * @return 所有数据
     */
    @ApiOperation(value = "查询所有数据")
    @GetMapping
    public R selectAll(Subject subject) {
        return R.ok().data("data",this.subjectService.list(new QueryWrapper<>(subject)));
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
        return R.ok().data("data",this.subjectService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param subject 实体对象
     * @return 新增结果
     */
    @ApiOperation(value = "新增数据")
    @PostMapping
    public R insert(@RequestBody Subject subject) {
        return R.ok().data("data",this.subjectService.save(subject));
    }

    /**
     * 修改数据
     *
     * @param subject 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation(value = "通过id修改数据单条数据")
    public R update(@RequestBody Subject subject) {
        return R.ok().data("data",this.subjectService.updateById(subject));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @ApiOperation(value = "通过id删除数据")
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return R.ok().data("data",this.subjectService.removeByIds(idList));
    }
}

