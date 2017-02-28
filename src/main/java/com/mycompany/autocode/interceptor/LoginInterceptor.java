package com.mycompany.autocode.interceptor;

import com.mycompany.autocode.model.UserDO;
import com.mycompany.autocode.service.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CookieValue;

import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.servlet.http.Cookie;
import javax.ws.rs.CookieParam;

/**
 * author: JinBingBing
 * description: 登录校验
 * time: 2017/2/23 16:37.
 */
public class LoginInterceptor implements MethodInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Resource
    private UserService userService;

    @CookieParam(value = "userName")
    private String userName;

    @CookieParam(value = "passWord")
    private String passWord;

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            UserDO userDO = new UserDO();
            userDO.setUserName(userName);
            userDO.setPassword(passWord);
            boolean result = userService.checkUser(userDO);
            if (result){
                return methodInvocation.proceed();
            }
            throw new AuthenticationException("未登录或登录超时");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            throw new AuthenticationException("未登录或登录超时");
        }
    }

}
