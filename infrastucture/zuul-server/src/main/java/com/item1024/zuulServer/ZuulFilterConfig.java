package com.item1024.zuulServer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class ZuulFilterConfig extends ZuulFilter {
    @Override
    public String filterType() {
//        过滤执行的生命周期 这里是路由之前
//        pre: 可以在请求被路由之前调用。
//          routing: 在路由请求时被调用。
//         post: 在 routing 和 error 过滤器之后被调用
//        error: 处理请求时发生错误时被调用。
        return "pre";
    }

    @Override
    public int filterOrder() {
//        多个过滤器时设定顺序 数字越小优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {
//        条件开启过滤
        return true;
    }

    @Override
    public Object run() {
//        执行自己的方法
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("test-zuul:{}",request.getRequestURI());
        return null;
    }
}
