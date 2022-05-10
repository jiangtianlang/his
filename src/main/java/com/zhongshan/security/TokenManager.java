package com.zhongshan.security;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component
public class TokenManager {
    //token有效时长
    private long tokenEcpiration = 24*60*60*1000;
    //编码秘钥
    private String tokenSignKey = "123456";
    //1 使用jwt根据用户名生成token
    public String createToken(String id, String username) {
        String JwtToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                .setSubject("guli-user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + tokenEcpiration))
                .claim("username", username)
                .claim("id", id)
                .signWith(SignatureAlgorithm.HS256, tokenSignKey)
                .compact();

        return JwtToken;
    }
    //2 根据token字符串得到用户信息
    public String getUserInfoFromToken(String jwtToken) {
        if(StringUtils.isEmpty(jwtToken)) return "";
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(jwtToken);
        Claims claims = claimsJws.getBody();
        return (String)claims.get("username");
    }
    //3 删除token
    public void removeToken(String token) {
    }
    //2 根据token字符串得到用户Id
    /**
     * 根据token获取会员power
     * @param request
     * @return
     */
    public String getUserIdByJwtToken(HttpServletRequest request) {
        String jwtToken = request.getHeader("token");
        if(StringUtils.isEmpty(jwtToken)) return "";
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(jwtToken);
        Claims claims = claimsJws.getBody();
        return (String)claims.get("id");
    }
}
