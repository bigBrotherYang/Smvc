package com.xt.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    /**
     * 方法执行前操作
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        System.out.println("preHandel");
        if (user!=null&&request.getRequestURL().indexOf("login")==-1) {
            System.out.println("登入失败");
            request.setAttribute("msg", "登入失败");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return false;
        }
        else{
             return true;
        }
    }

    /**
     * 方法执行后开始返回前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandel");
//        modelAndView
    }

    /**
     * 方法报错的时候执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("异常处理....");
    }
}
