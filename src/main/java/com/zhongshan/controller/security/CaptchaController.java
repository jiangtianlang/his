package com.zhongshan.controller.security;

import com.wf.captcha.base.Captcha;
import com.zhongshan.common.Constants;
import com.zhongshan.config.bean.LoginProperties;
import com.zhongshan.utils.IdUtils;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Api(tags = "验证码接口")
@RestController
public class CaptchaController {
    @Autowired
    private RedisService redisService;
    @Autowired
    private LoginProperties loginProperties;

    @ApiOperation(value = "生成验证码", notes = "生成验证码详情")
    @GetMapping("/code/img")
    public R getCodeImg() throws IOException {
        // 获取运算的结果
        Captcha captcha = loginProperties.getCaptcha();
        // 唯一标识
        String uuid = IdUtils.simpleUUID();
        System.err.println("获取的code为: " + captcha.text() + "  uuid为: " + uuid);
        String verifyKey = Constants.CAPTCHA_CODE_KEY + uuid;
        // 保存到redis
        redisService.setCacheObject(verifyKey, captcha.text(), loginProperties.getLoginCode().getExpiration(), TimeUnit.MINUTES);
        // 验证码信息
        return R.ok().data("img", captcha.toBase64()).data("uuid", uuid);
    }
}