package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.SpringDao;
import com.mycompany.autocode.model.SpringDO;
import com.mycompany.autocode.service.SpringService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class SpringServiceImpl implements SpringService {

    @Resource
    private SpringDao springDao;

    public boolean addSpring(SpringDO springDO) throws Exception {
        return false;
    }

    public boolean modifySpring(SpringDO springDO) throws Exception {
        return false;
    }

    public boolean removeSpring(String id) throws Exception {
        return false;
    }

    public SpringDO getSpringById(String id) throws Exception {
        return null;
    }

    public List<SpringDO> querySpring(SpringDO springDO) throws Exception {
        return null;
    }
}
