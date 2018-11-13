package com.item1024.zuulServer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class ZuulExceptionFilterConfig extends ZuulFilter {
    @Override
    public String filterType() {
//        过滤执行的生命周期 这里是路由之前
//        pre: 可以在请求被路由之前调用。
//          routing: 在路由请求时被调用。
//         post: 在 routing 和 error 过滤器之后被调用
//        error: 处理请求时发生错误时被调用。
        return "error";
    }

    @Override
    public int filterOrder() {
//        多个过滤器时设定顺序 数字越小优先级越高
        return 10;
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
        Throwable throwable = ctx.getThrowable();
        log.info("进入异常处理");
        ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        ctx.set("error.message", throwable.getMessage());
        ctx.set("error.exception", throwable.getCause());
        return null;
    }
}
