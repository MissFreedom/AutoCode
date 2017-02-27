package com.mycompany.autocode.interceptor;

import com.mycompany.autocode.service.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * author: JinBingBing
 * description: 登录校验
 * time: 2017/2/23 16:37.
 */
public class LoginInterceptor implements MethodInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Resource
    private UserService userService;

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {

            return methodInvocation.proceed();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw e;
        }
    }

}
