package com.zhongshan.filter;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.zhongshan.common.Constants;
import com.zhongshan.entity.security.SecurityUser;
import com.zhongshan.entity.security.User;
import com.zhongshan.security.TokenManager;
import com.zhongshan.utils.R;
import com.zhongshan.utils.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhongshan.vo.UserLogin;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class TokenLoginFilter extends UsernamePasswordAuthenticationFilter {


    private TokenManager tokenManager;
    private RedisTemplate redisTemplate;
    private AuthenticationManager authenticationManager;

    public TokenLoginFilter(AuthenticationManager authenticationManager, TokenManager tokenManager, RedisTemplate redisTemplate) {
        this.authenticationManager = authenticationManager;
        this.tokenManager = tokenManager;
        this.redisTemplate = redisTemplate;
        this.setPostOnly(false);
        this.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/login","POST"));
    }

    //1 获取表单提交用户名和密码
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        //获取表单提交数据
        try {
            UserLogin userLogin = new ObjectMapper().readValue(request.getInputStream(), UserLogin.class);
            String verifyKey = Constants.CAPTCHA_CODE_KEY + userLogin.getUuid();
            // 查询验证码
            String captcha = (String) redisTemplate.opsForValue().get(verifyKey);
            // 清除验证码
            redisTemplate.delete(verifyKey);
            if (StringUtils.isBlank(captcha)) {
                // 记录登录日志
                System.out.println(">>>>>>>>>>>>>>>>>>>>从Redis获取验证码失败!!");
                ResponseUtil.out(response,R.error().message("验证码过期,请稍后重试!!"));
                return null;
            }
            // 验证码错误
            if (!userLogin.getCode().equalsIgnoreCase(captcha)) {
                // 记录登录日志
                System.out.println(">>>>>>>>>>>>>>>>>>>>验证码错误!!");
                ResponseUtil.out(response,R.error().message("验证码错误,请稍后重试!!"));
                return null;
            }
            User user = new User(userLogin.getUserName(),userLogin.getPassWord());
            Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(),
                    new ArrayList<>()));
            return authenticate;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    //2 认证成功调用的方法
    @Override
    protected void successfulAuthentication(HttpServletRequest request, 
                                            HttpServletResponse response, FilterChain chain, Authentication authResult)
            throws IOException, ServletException {
        //认证成功，得到认证成功之后用户信息
        SecurityUser user = (SecurityUser)authResult.getPrincipal();
        //根据用户名生成token
        String token = tokenManager.createToken(user.getCurrentUserInfo().getUsername());
        //把用户名称和用户权限列表放到redis
        redisTemplate.opsForValue().set(user.getCurrentUserInfo().getUsername(),user.getPermissionValueList());
        //返回token
        ResponseUtil.out(response, R.ok().data("token",token));
    }

    //3 认证失败调用的方法
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed)
            throws IOException, ServletException {
        ResponseUtil.out(response, R.error());
    }
}
