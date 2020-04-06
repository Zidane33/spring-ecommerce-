package com.Backend.Zidane.Store.App.Logging;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ChargeInterceptor
        extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) {
        HttpServletRequest requestCacheWrapperObject = new ContentCachingRequestWrapper(request);
        requestCacheWrapperObject.getParameterMap();
        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        //
    }
}
