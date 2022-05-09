package com.zhongshan.controller;

import com.zhongshan.utils.result.R;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author jtl
 * @date 2022年04月28日 14:50:10
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping
    public R test(@DateTimeFormat(pattern = "yyyy-MM") Date date){

        return R.ok();
    }
}
