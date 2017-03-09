package com.mycompany.autocode.controller;

import com.mycompany.autocode.interceptor.Logined;
import com.mycompany.autocode.model.JavaDO;
import com.mycompany.autocode.model.UserDO;
import com.mycompany.autocode.service.JavaService;
import com.mycompany.autocode.service.UserService;
import com.mycompany.autocode.utils.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.www.http.HttpClient;

import javax.annotation.Resource;
import javax.ws.rs.CookieParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.net.URL;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Controller
@Scope("prototype")
@RequestMapping("java")
public class JavaResource {

    private  static final Logger logger = LoggerFactory.getLogger(JavaResource.class);

    @Resource
    private JavaService javaService;

    @Resource
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @Logined
    @ResponseBody
    public Response addJava(JavaDO javaDO, @CookieParam("userName")String userName){
        try{
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }
            javaDO.setUserId(userDO.getUserId());
            boolean result = javaService.addJava(javaDO);
            if (result) {
                return ResponseResult.returnSuccess();
            }

            return ResponseResult.returnAbort("添加java文件失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @RequestMapping(value = "/modify",method = RequestMethod.PUT)
    @Logined
    @ResponseBody
    public Response modifyJava(JavaDO javaDO,@CookieParam("userName")String userName){
        try {
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }
            boolean result = javaService.modifyJava(javaDO);
            if (result){
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("修改java文件失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @Logined
    @RequestMapping
    public Response removeJava(@QueryParam("javaId")String javaId, @CookieParam("userName")String userName){
        try {
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }
            boolean result = javaService.removeJava(javaId);
            if (result){
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("删除java文件失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    public static void main(String args[])throws Exception {
    }
}
