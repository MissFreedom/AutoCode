package com.mycompany.autocode.controller;

import com.alibaba.fastjson.JSONObject;
import com.mycompany.autocode.interceptor.Logined;
import com.mycompany.autocode.model.vo.DataBaseVO;
import com.mycompany.autocode.service.DataBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @Logined
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addDataBase(DataBaseVO dataBaseVO){
        return null;
    }

}
