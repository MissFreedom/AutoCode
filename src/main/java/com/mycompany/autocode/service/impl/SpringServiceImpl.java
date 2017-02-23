package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.SpringDao;
import com.mycompany.autocode.model.SpringDO;
import com.mycompany.autocode.service.SpringService;
import com.mycompany.autocode.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.Collections;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class SpringServiceImpl implements SpringService {

    private static final Logger logger = LoggerFactory.getLogger(SpringServiceImpl.class);

    @Resource
    private SpringDao springDao;

    public boolean addSpring(SpringDO springDO) throws Exception {
        try {
            Assert.notNull(springDO,"spring配置文件不能为空");
            Assert.notNull(springDO.getSpringName(),"spring文件名不能为空");
            springDO.setSpringId(UUIDUtils.getUUID());
            boolean result = springDao.insertSpring(springDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean modifySpring(SpringDO springDO) throws Exception {
        try {
            Assert.notNull(springDO,"spring配置文件不能为空");
            Assert.notNull(springDO.getSpringId(),"spring配置文件编号不能为空");
            SpringDO entity = springDao.selectpringById(springDO.getSpringId());
            Assert.notNull(entity,"spring配置文件不存在");
            boolean result = springDao.updateSpring(springDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean removeSpring(String id) throws Exception {
        try {
            Assert.notNull(id,"spring配置文件不能为空");
            SpringDO springDO = springDao.selectpringById(id);
            Assert.notNull(springDO,"spring配置文件不存在");
            boolean result = springDao.deleteSpring(id) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public SpringDO getSpringById(String id) throws Exception {
        Assert.notNull(id,"spring配置文件不能为空");
        SpringDO springDO = springDao.selectpringById(id);
        if (null == springDO){
            return null;
        }

        return springDO;
    }

    public List<SpringDO> querySpring(SpringDO springDO) throws Exception {
        if (null == springDO){
            return Collections.EMPTY_LIST;
        }
        List<SpringDO> dataList = springDao.selectSpring(springDO);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }

        return dataList;
    }
}
