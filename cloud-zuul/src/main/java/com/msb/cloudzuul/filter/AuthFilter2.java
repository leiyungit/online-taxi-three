package com.msb.cloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class AuthFilter2 extends ZuulFilter {


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
        return 2;
    }

    /**
     * 该过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        if(!currentContext.sendZuulResponse()){
            log.info("auth2 不生效");
            return false;
        }
        String uri = request.getRequestURI();
        log.info("2来源uri={}",uri);

        /*List<String> checkUriList = Arrays.asList("/api-passenger/verify-code/test");
        if(checkUriList.contains(uri)){
            log.info("2过滤器判定是否生效，在白名单范围：{}",uri);
            return false;
        }*/


        return true;
    }

    /**
     * 拦截后的具体业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("auth2 拦截");
        //获取上下文（重要，贯穿 所有filter，包含所有参数）
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String uri = request.getRequestURI();
        String token = request.getHeader("Authorization");

        // 不往下走，还走剩下的过滤器，但是不向后面的服务转发。
        requestContext.setSendZuulResponse(false);
        requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        requestContext.setResponseBody("auth2 fail");

        return null;
    }
}
