package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.PomDao;
import com.mycompany.autocode.model.PomDO;
import com.mycompany.autocode.service.PomService;
import com.mycompany.autocode.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
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
public class PomServiceImpl implements PomService {

    private static final Logger logger = LoggerFactory.getLogger(PomService.class);

    @Resource
    private PomDao pomDao;

    public boolean addPom(PomDO pomDO)throws Exception{
        try {
            Assert.notNull(pomDO, "pom文件不能为空");
            Assert.notNull(pomDO.getPomNane(), "pom项目名不能为空");
            Assert.notNull(pomDO.getPomContext(), "pom文件内容不能为空");
            pomDO.setPomId(UUIDUtils.getUUID());
            boolean result = pomDao.insertPom(pomDO) > 0;

            return result;
        } catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean modifyPom(PomDO pomDO) throws Exception {
        try {
            Assert.notNull(pomDO, "pom文件不能为空");
            Assert.notNull(pomDO.getPomId(),"pom文件编号不能为空");
            PomDO pom = pomDao.selectPomById(pomDO.getPomId());
            Assert.notNull(pom,"pom文件不存在");
            boolean result = pomDao.updatePom(pomDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean removePom(String id) throws Exception {
        try{
            Assert.notNull(id,"pom文件编号不能为空");
            PomDO pom = pomDao.selectPomById(id);
            Assert.notNull(pom,"pom文件不存在");
            boolean result = pomDao.deletePom(id)>0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public PomDO getPomById(String id) throws Exception {
        Assert.notNull(id,"pom文件编号不能为空");
        PomDO pomDO = pomDao.selectPomById(id);
        if (null == pomDO){
            return null;
        }
        return pomDO;
    }

    public List<PomDO> queryPom(PomDO query) throws Exception {
        if (query == null){
            return Collections.EMPTY_LIST;
        }
        List<PomDO> dataList = pomDao.selectPom(query);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }
        return dataList;
    }
}
