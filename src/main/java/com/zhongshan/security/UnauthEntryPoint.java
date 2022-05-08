package com.zhongshan.security;

import com.zhongshan.utils.result.R;
import com.zhongshan.utils.ResponseUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UnauthEntryPoint implements AuthenticationEntryPoint {
    /**
     * 启动身份验证方案
     * 实现应根据需要修改ServletResponse的标头以开始身份验证过程
     */
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        ResponseUtil.out(httpServletResponse, R.error().message(httpServletRequest.getRequestURL()+"请求失败!"));
    }
}
