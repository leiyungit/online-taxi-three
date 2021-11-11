package com.msb.internalcommon.util;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class JwtUtil {

    /**
     * 密钥，仅服务端存储
     */
    private static String secret = "ko346134h_we]rg3in_yunlei";

    /**
     *
     * @param subject
     * @param issueDate 签发时间
     * @return
     */
    public static String createToken(String subject, Date issueDate){
       /* Calendar calendar = Calendar.getInstance();
        calendar.setTime(issueDate);
        calendar.add(Calendar.MINUTE,5);
        Date endDate = calendar.getTime();*/
        String compactJwt = Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(issueDate)
                // .setExpiration(endDate) //  过期时间
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        return compactJwt;
    }

    /**
     * 解密
     * @param token
     * @return
     */
    public static JwtInfo parseToken(String token){
        try {
            // xxxx.xxxxx.xxxxxxxx
            Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            if(body!=null){
                JwtInfo jwtInfo = new JwtInfo();
                jwtInfo.setToken(body.getSubject());
                jwtInfo.setIssueDate(body.getIssuedAt());
                return jwtInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("token 过期");
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "lei.yun.lei";
        String token = createToken(str, new Date());
        try {
            System.out.println(token);
            TimeUnit.SECONDS.sleep(3);
            // Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JwtInfo jwtInfo = parseToken(token);
        System.out.println(jwtInfo);
    }
}
