package com.zhongshan.controller.security;

import com.alibaba.fastjson.JSONObject;

import com.zhongshan.service.security_service.IndexService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@Api(tags = "(系统管理)主页面接口")
@RestController
@RequestMapping("/index")
//@CrossOrigin
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 根据token获取用户信息
     */
    @ApiOperation(value = "获取当前用户信息", notes = "根据token获取用户信息")
    @GetMapping("info")
    public R info(){
        //获取当前登录用户用户名
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String, Object> userInfo = indexService.getUserInfo(username);

        return R.ok().data(userInfo);
    }

    /**
     * 获取菜单
     * @return
     */
    @ApiOperation(value = "获取当前用户菜单", notes = "根据token获取用户菜单")
    @GetMapping("menu")
    public R getMenu(){
        //获取当前登录用户用户名
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        List<JSONObject> permissionList = indexService.getMenu(username);
        return R.ok().data("permissionList", permissionList);
    }

    @PostMapping("logout")
    @ApiOperation(value = "退出登录", notes = "退出登录")
    public R logout(){
        return R.ok();
    }

}
