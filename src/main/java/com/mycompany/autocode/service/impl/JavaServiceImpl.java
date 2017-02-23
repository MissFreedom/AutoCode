package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.JavaDao;
import com.mycompany.autocode.model.JavaDO;
import com.mycompany.autocode.service.JavaService;
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
public class JavaServiceImpl implements JavaService {

    private static final Logger logger = LoggerFactory.getLogger(JavaServiceImpl.class);

    @Resource
    private JavaDao javaDao;

    public boolean addJava(JavaDO javaDO) throws Exception {
        try {
            Assert.notNull(javaDO, "java文件不能为空");
            Assert.notNull(javaDO.getClassName(), "java文件名不能为空");
            Assert.notNull(javaDO.getClassContext(), "java文件内容不能为空");
            javaDO.setJavaId(UUIDUtils.getUUID());
            boolean result = javaDao.insertJava(javaDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean modifyJava(JavaDO javaDO) throws Exception {
        try{
            Assert.notNull(javaDO,"java文件不能为空");
            Assert.notNull(javaDO.getJavaId(),"java文件ID");
            JavaDO entity = javaDao.getJavaById(javaDO.getJavaId());
            Assert.notNull(entity,"java文件不存在或已删除");
            boolean result = javaDao.updateJava(javaDO) > 0;
            Assert.isTrue(result,"修改java文件失败");
            return result;
        }catch (Exception e){
                logger.error(this.getClass().getName()+e.getMessage(),e);
                throw e;
        }
    }

    public boolean removeJava(String id) throws Exception {
        try{
            Assert.notNull(id,"java文件ID不能为空");
            JavaDO entity = javaDao.getJavaById(id);
            Assert.notNull(entity,"java文件不存在或已删除");
            boolean result = javaDao.deleteJava(id)>0;
            Assert.isTrue(result,"删除java文件失败");
            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public JavaDO getJavaById(String id) throws Exception {
        Assert.notNull(id,"查询Id不能为空");
        JavaDO entity = javaDao.getJavaById(id);
        if (null != entity){
            return entity;
        }
        return null;
    }

    public List<JavaDO> queryJava(JavaDO query) throws Exception {
        if (query == null){
            return Collections.EMPTY_LIST;
        }
        List<JavaDO> dataList = javaDao.selectJava(query);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }
        return dataList;
    }
}
