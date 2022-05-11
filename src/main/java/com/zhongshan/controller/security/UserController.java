package com.zhongshan.controller.security;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.pojo.User;
import com.zhongshan.pojo.vo.UserVo;
import com.zhongshan.security.TokenManager;
import com.zhongshan.service.security_service.RoleService;
import com.zhongshan.service.security_service.UserService;
import com.zhongshan.utils.MD5;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 用户表 前端控制器
 * </p>
 */
@Api(tags = "(系统管理)管理用户接口")
@RestController
@RequestMapping("admin/user")
@Slf4j
//@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;
    @Autowired
    private TokenManager tokenManager;

    @ApiOperation(value = "获取管理用户列表")
    @GetMapping
    public R index(
            @ApiParam(name = "courseQuery", value = "查询对象", required = false)
                    User userQueryVo) {
        //用户角色
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(userQueryVo.getUsername())) {
            wrapper.like("username",userQueryVo.getUsername());
            return R.ok().data("users",userService.list(wrapper));
        }

        List<UserVo> userVos = userService.selectUserAndRole();

        return R.ok().data("users",userVos).data("total", userVos.size());
    }

    @ApiOperation(value = "新增管理用户")
    @PostMapping("save")
    public R save(@RequestBody User user) {
        user.setPassword(MD5.encrypt(user.getPassword()));
        if (userService.save(user)) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @ApiOperation(value = "根据用户获取角色数据")
    @GetMapping("/toAssign/{userId}")
    public R toAssign(@PathVariable String userId) {
        Map<String, Object> roleMap = roleService.findRoleByUserId(userId);
        return R.ok().data(roleMap);
    }
    @ApiOperation(value = "根据用户ID修改用户数据")
    @PostMapping("/update")
    public R update(@RequestBody User user) {
        user.setPassword(null);
        if (userService.updateById(user)) {
            return R.ok();
        } else {
            return R.error();
        }
    }
    @ApiOperation(value = "根据用户ID重置密码")
    @PostMapping("/resetPassWord")
    public R resetPassWord(String userId) {
        User user = new User();
        user.setId(userId);
        user.setPassword(MD5.encrypt("111111"));
        if (userService.updateById(user)) {
            return R.ok();
        } else {
            return R.error();
        }
    }
    @ApiOperation(value = "根据用户ID封禁用户")
    @PostMapping("/deleteById")
    public R deleteById(String userId) {

        if (userService.removeById(userId)) {
            return R.ok();
        } else {
            return R.error();
        }
    }
    @ApiOperation(value = "根据用户分配角色")
    @PostMapping("/doAssign")
    public R doAssign(@RequestParam String userId,@RequestParam String roleId) {
        String[] roleIds = {roleId};
        roleService.saveUserRoleRealtionShip(userId,roleIds);
        return R.ok();
    }

    @ApiOperation(value = "头像上传")
    @PostMapping("/uploadHeader")
    public R uploadHeader(@RequestPart("header") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return R.error().message("上传失败，请选择文件");
        }

        String fileName = file.getOriginalFilename();
        String filePath = System.getProperty("user.dir")+"\\target\\classes\\static\\";
        filePath=filePath.replace("/","\\\\");
        File dest = new File(filePath + fileName);
        try {
            String id = tokenManager.getUserIdByJwtToken(request);
            log.info("token:"+request.getHeader("token"));
            file.transferTo(dest);
            log.info("上传成功");
            User user = new User();
            user.setId(id);
            user.setSalt("/"+fileName);
            userService.updateById(user);
            return R.ok().data("url","192.168.221.172:8888/"+fileName).message("上传成功");
        } catch (IOException e) {
            log.error(e.toString(), e);
        }
        return R.error().message("上传失败！");
    }

}

