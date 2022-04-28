package com.zhongshan.controller;

import com.zhongshan.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jtl
 * @date 2022年04月28日 14:50:10
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping
    public R test(){
        return R.ok();
    }
}
