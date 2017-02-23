package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.WebDao;
import com.mycompany.autocode.model.WebDO;
import com.mycompany.autocode.service.WebService;
import com.mycompany.autocode.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class WebServiceImpl implements WebService{

    private static final Logger logger = LoggerFactory.getLogger(WebServiceImpl.class);

    @Resource
    private WebDao webDao;

    public boolean addWeb(WebDO webDO) throws Exception {
        try {
            Assert.notNull(webDO,"web.xml文件不能为空");
            Assert.notNull(webDO.getWebName(),"web.xml文件名不能为空");
            webDO.setWebId(UUIDUtils.getUUID());
            boolean result = webDao.insertWeb(webDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean modifyWeb(WebDO webDO) throws Exception {
        try {
            Assert.notNull(webDO,"web.xml文件不能为空");
            Assert.notNull(webDO.getWebId(),"web.xml文件编号不能为空");
            WebDO entity = webDao.selectWebById(webDO.getWebId());
            Assert.notNull(entity,"web.xml文件不存在");
            boolean result = webDao.updateWeb(webDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean removeWeb(String id) throws Exception {
        try {
            Assert.notNull(id,"web.xml文件编号不能为空");
            WebDO entity = webDao.selectWebById(id);
            Assert.notNull(entity,"web.xml文件不存在");
            boolean result = webDao.deleteWeb(id) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public WebDO getWebById(String id) throws Exception {
        Assert.notNull(id,"web.xml文件编号不能为空");
        WebDO entity = webDao.selectWebById(id);
        if (null == entity){
            return null;
        }

        return entity;
    }

    public List<WebDO> queryWeb(WebDO webDO) throws Exception {
        if (null == webDO){
            return Collections.EMPTY_LIST;
        }
        List<WebDO> dataList = webDao.selectWeb(webDO);
        if (CollectionUtils.isEmpty(dataList)){
            return  Collections.EMPTY_LIST;
        }

        return dataList;
    }
}
