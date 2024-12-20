package com.itgmd.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String uri = request.getRequestURI();
        String[] urls = {"login","register","js","css"};
        for (int i=0 ;i<urls.length;i++){
            if (uri.contains(urls[i])){
                return true;
            }
        }
        response.sendRedirect("login.html");
        return false;
    }
}
