package com.msb.onlinetaxizuul.filter;

import com.msb.internalcommon.constant.RedisKeyPrefixConstant;
import com.msb.internalcommon.util.JwtInfo;
import com.msb.internalcommon.util.JwtUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class AuthFilter extends ZuulFilter {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 拦截类型，4中类型。
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 值越小，越在前
     * @return
     */
    @Override
    public int filterOrder() {
        return -1;
    }

    /**
     * 该过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String uri = request.getRequestURI();
        log.info("来源uri={}",uri);

        List<String> checkUriList = Arrays.asList("/api-passenger/verify-code/test");
        if(checkUriList.contains(uri)){
            log.info("过滤器判定是否生效，在白名单范围：{}",uri);
            return false;
        }

        return true;
    }

    /**
     * 拦截后的具体业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("auth 拦截");
        //获取上下文（重要，贯穿 所有filter，包含所有参数）
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String uri = request.getRequestURI();
        String token = request.getHeader("Authorization");
        // System.out.println(token);
        if(StringUtils.isNotBlank(token)){
            JwtInfo jwtInfo = JwtUtil.parseToken(token);
            if(null!=jwtInfo){
                String tokenUserId = jwtInfo.getSubject();
                BoundValueOperations<String,String> boundValueOps = redisTemplate.boundValueOps(RedisKeyPrefixConstant.PASSENGER_LOGIN_TOKEN_APP_KEY_PRE + tokenUserId);
                String redisToken = boundValueOps.get();
                // log.info("redisToken:{}",redisToken);
                if(token.equals(redisToken)){
                    log.info("token 校验通过");
                    requestContext.setSendZuulResponse(true);
                    requestContext.setResponseStatusCode(HttpStatus.OK.value());
                    requestContext.setResponseBody("auth success");
                    return null;
                }else{
                    log.error("zuul token过期");
                }
            }
            return null;
        }else{
            log.info("token is null");
        }

        // 不往下走，还走剩下的过滤器，但是不向后面的服务转发。
        requestContext.setSendZuulResponse(false);
        requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        requestContext.setResponseBody("auth fail");
        return null;
    }
}
