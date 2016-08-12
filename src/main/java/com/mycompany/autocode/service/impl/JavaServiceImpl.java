package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.JavaDao;
import com.mycompany.autocode.model.JavaDO;
import com.mycompany.autocode.service.JavaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class JavaServiceImpl implements JavaService {

    @Resource
    private JavaDao javaDao;

    public boolean addJava(JavaDO javaDO) throws Exception {
        return false;
    }

    public boolean modifyJava(JavaDO javaDO) throws Exception {
        return false;
    }

    public boolean removeJava(String id) throws Exception {
        return false;
    }

    public JavaDO getJavaById(String id) throws Exception {
        return null;
    }

    public List<JavaDO> queryJava(JavaDO javaDO) throws Exception {
        return null;
    }
}
