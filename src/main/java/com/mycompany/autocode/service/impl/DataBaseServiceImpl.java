package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.DataBaseDao;
import com.mycompany.autocode.model.DataBaseDO;
import com.mycompany.autocode.service.DataBaseService;
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
public class DataBaseServiceImpl implements DataBaseService{

    private static final Logger logger = LoggerFactory.getLogger(DataBaseServiceImpl.class);

    @Resource
    private DataBaseDao dataBaseDao;

    /**
     * 添加数据库配置文件
     * @param dataBaseDO
     * @return
     * @throws Exception
     */
    public boolean addDataBase(DataBaseDO dataBaseDO) throws Exception {
        try {
            Assert.notNull(dataBaseDO, "数据库配置不能为空");
            Assert.notNull(dataBaseDO.getDataBaseName(), "数据库配置文件名");
            Assert.notNull(dataBaseDO.getDriver(), "数据库驱动不能为空");
            Assert.notNull(dataBaseDO.getInitialSize(), "数据库初始链接数不能为空");
            Assert.notNull(dataBaseDO.getMaxActive(), "数据库最大连接数不能为空");
            Assert.notNull(dataBaseDO.getMaxIdle(), "最大空间不能为空");
            Assert.notNull(dataBaseDO.getMaxWait(), "最长等待时间不能为空");
            Assert.notNull(dataBaseDO.getMinIdle(), "最小空间不能为空");
            dataBaseDO.setDataBaseId(UUIDUtils.getUUID());
            boolean result = dataBaseDao.insertDataBase(dataBaseDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }

    }

    /**
     * 修改数据库配置文件
     * @param dataBaseDO
     * @return
     * @throws Exception
     */
    public boolean modifyDataBase(DataBaseDO dataBaseDO) throws Exception {
        try{
            Assert.notNull(dataBaseDO,"数据库配置文件不能为空");
            Assert.notNull(dataBaseDO.getDataBaseId(),"数据库配置文件编号不能为空");
            DataBaseDO entity = dataBaseDao.getDataBaseById(dataBaseDO.getDataBaseId());
            Assert.notNull(entity,"该数据库配置文件不存在或已删除");
            boolean result = dataBaseDao.updateDataBase(dataBaseDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    /**
     * 移除数据库配置文件
     * @param id
     * @return
     * @throws Exception
     */
    public boolean removeDataBase(String id) throws Exception {
        try {
            Assert.notNull(id,"数据库配置文件编号不能为空");
            DataBaseDO entity = dataBaseDao.getDataBaseById(id);
            Assert.notNull(entity,"数据库配置文件不存在或已删除");
            boolean result = dataBaseDao.deleteDataBase(id) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    /**
     * 通过数据库配置文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    public DataBaseDO getDataBaseById(String id) throws Exception {
        Assert.notNull(id,"数据库配置文件编号不能为空");
        DataBaseDO entity = dataBaseDao.getDataBaseById(id);
        if (entity != null){
            return entity;
        }
        return null;
    }

    /**
     * 通过查询条件获取数据库配置文件列表
     * @param query
     * @return
     * @throws Exception
     */
    public List<DataBaseDO> queryDataBase(DataBaseDO query) throws Exception {
        if (query == null){
            return Collections.EMPTY_LIST;
        }
        List<DataBaseDO> dataList = dataBaseDao.selectDataBase(query);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }
        return dataList;
    }

}
