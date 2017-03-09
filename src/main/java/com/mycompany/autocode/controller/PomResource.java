package com.mycompany.autocode.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Controller
@RequestMapping(value = "/pom/",produces = "application/json;charset=UTF-8")
public class PomResource {

    @RequestMapping(value = "add")
    @ResponseBody
    public String add(@RequestParam Integer a,@RequestParam Integer b){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a+b",a+b);

        return JSONObject.toJSONString(jsonObject);
    }

}
