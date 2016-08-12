package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.WebDao;
import com.mycompany.autocode.model.WebDO;
import com.mycompany.autocode.service.WebService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class WebServiceImpl implements WebService{

    @Resource
    private WebDao webDao;

    public boolean addWeb(WebDO webDO) throws Exception {
        return false;
    }

    public boolean modifyWeb(WebDO webDO) throws Exception {
        return false;
    }

    public boolean removeWeb(String id) throws Exception {
        return false;
    }

    public WebDO getWebById(String id) throws Exception {
        return null;
    }

    public List<WebDO> queryWeb(WebDO webDO) throws Exception {
        return null;
    }
}
