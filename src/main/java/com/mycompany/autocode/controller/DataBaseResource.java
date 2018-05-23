package com.mycompany.autocode.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mycompany.autocode.interceptor.Logined;
import com.mycompany.autocode.model.DataBaseDO;
import com.mycompany.autocode.model.UserDO;
import com.mycompany.autocode.service.DataBaseService;
import com.mycompany.autocode.service.UserService;
import com.mycompany.autocode.utils.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Controller
@Scope("prototype")
@RequestMapping("database")
public class DataBaseResource {

    private static final Logger logger = LoggerFactory.getLogger(DataBaseResource.class);

    @Resource
    private DataBaseService dataBaseService;

    @Resource
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @Logined
    @ResponseBody
    public Response addDataBase(DataBaseDO dataBaseDO , @CookieValue("userName")String userName){
        try{
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }
            dataBaseDO.setUserId(userDO.getUserId());
            boolean result = dataBaseService.addDataBase(dataBaseDO);
            if (result) {
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("添加数据库配置失败111");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @RequestMapping(value = "/modify",method = RequestMethod.PUT)
    @Logined
    @ResponseBody
    public Response modifyDataBase(DataBaseDO dataBaseDO,@CookieValue("userName")String userName){
        try{
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }

            boolean result = dataBaseService.modifyDataBase(dataBaseDO);
            if (result) {
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("修改数据库配置失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @RequestMapping(value = "/remove",method = RequestMethod.DELETE)
    @Logined
    public Response removeDataBase(String dataBaseId,@CookieParam("userName")String userName){
        try{
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("未登录或登录已失效");
            }

            boolean result = dataBaseService.removeDataBase(dataBaseId);
            if (result) {
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("删除数据库配置失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @Logined
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response getDataBase(@QueryParam("dataBaseId") String dataBaseId,@CookieParam("userName")String userName){
        try{
            DataBaseDO dataBaseDO = dataBaseService.getDataBaseById(dataBaseId);
            if (null == dataBaseDO) {
                return ResponseResult.returnAbort("数据库配置已删除或不存在");
            }
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO || !dataBaseDO.getUserId().equals(userDO.getUserId())){
                return ResponseResult.returnAbort("数据库配置不存在");
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("driver", dataBaseDO.getDriver());
            jsonObject.put("dataBaseName",dataBaseDO.getDataBaseName());
            jsonObject.put("userName",dataBaseDO.getUserName());
            jsonObject.put("password",dataBaseDO.getPassWord());
            jsonObject.put("initialSize",dataBaseDO.getInitialSize());
            jsonObject.put("maxActive",dataBaseDO.getMaxActive());
            jsonObject.put("maxIdle",dataBaseDO.getMaxIdle());
            jsonObject.put("maxWait",dataBaseDO.getMaxWait());
            jsonObject.put("minIdle",dataBaseDO.getMinIdle());
            jsonObject.put("url",dataBaseDO.getUrl());
            return ResponseResult.returnSuccess(jsonObject.toJSONString());
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @RequestMapping(value = "/query" ,method = RequestMethod.GET)
    @Logined
    public Response queryDataBase(@QueryParam("dataBaseName")String dataBaseName, @CookieParam("userName") String userName){
        try{
            UserDO userDO = userService.getUserByUserName(userName);
            if (null == userDO){
                return ResponseResult.returnAbort("用户不存在");
            }
            DataBaseDO query = new DataBaseDO();
            query.setDataBaseName(dataBaseName);
            query.setUserId(userDO.getUserId());
            List<DataBaseDO> dataBaseDOs = dataBaseService.queryDataBase(query);
            JSONArray dataBaseArray = new JSONArray();
            for (DataBaseDO dataBaseDO : dataBaseDOs){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("dataBaseName",dataBaseDO.getDataBaseName());
                jsonObject.put("driver",dataBaseDO.getDriver());
                dataBaseArray.add(jsonObject);
            }
            return ResponseResult.returnSuccess(dataBaseArray.toJSONString());
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

}
