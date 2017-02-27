package com.mycompany.autocode.controller;

import com.alibaba.fastjson.JSONObject;
import com.mycompany.autocode.interceptor.Logined;
import com.mycompany.autocode.model.DataBaseDO;
import com.mycompany.autocode.model.vo.DataBaseVO;
import com.mycompany.autocode.service.DataBaseService;
import com.mycompany.autocode.utils.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


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

    @Autowired
    private DataBaseService dataBaseService;

    @Logined
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Response addDataBase(DataBaseDO dataBaseDO){
        try{
            boolean result = dataBaseService.addDataBase(dataBaseDO);
            if (result) {
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("添加数据库配置失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

    @Logined
    @RequestMapping(value = "/modify",method = RequestMethod.PUT)
    @ResponseBody
    public Response modifyDataBase(DataBaseDO dataBaseDO){
        try{

            boolean result = dataBaseService.modifyDataBase(dataBaseDO);
            if (result) {
                return ResponseResult.returnSuccess();
            }
            return ResponseResult.returnAbort("添加数据库配置失败");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return ResponseResult.returnAbort(e.getMessage());
        }
    }

}
