package com.mycompany.autocode.filter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.jstl.core.Config;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * author: JinBingBing
 * description: 登录拦截器
 * time: 2017/2/27 16:48.
 */
public class LoginFilter implements Filter{

    public FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException {
        config = filterConfig;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);

        String logonStrings = config.getInitParameter("logonStrings");
        String includeStrings = config.getInitParameter("includeStrings");
        String redirectPath = config.getInitParameter("redirectPath");
        String disabletestfilter = config.getInitParameter("disabletestfilter");

        if ("Y".equals(disabletestfilter.toUpperCase())){
            chain.doFilter(request,response);
            return;
        }

        String[] includes = includeStrings.split(";");
        if (!isContains(httpRequest.getRequestURI(),includes)){
            chain.doFilter(request,response);
            return;
        }

        String[] logons = logonStrings.split(";");
        if (isContains(httpRequest.getRequestURI(),logons)){
            chain.doFilter(request,response);
            return;
        }

        Cookie[] cookies = httpRequest.getCookies();
        String user = null;
        for (Cookie cookie : cookies){
            if ("userName".equals(cookie.getName())){
                chain.doFilter(request,response);
                return;
            }
        }
        wrapper.sendRedirect(redirectPath);
    }

    public static boolean isContains(String uri,String[] parameters){

        for (String parameter : parameters){
            if (uri.contains(parameter)){
                return true;
            }
        }

        return false;
    }

    public void destroy() {

    }
}
