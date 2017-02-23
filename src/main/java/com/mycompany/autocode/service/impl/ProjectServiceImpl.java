package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.ProjectDao;
import com.mycompany.autocode.model.ProjectDO;
import com.mycompany.autocode.service.*;
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
 * description: 项目工程
 * time: 2016/11/11 11:46.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    private static final Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);

    @Resource
    private DataBaseService dataBaseService;

    @Resource
    private PomService pomService;

    @Resource
    private JavaService javaService;

    @Resource
    private SpringService springService;

    @Resource
    private  WebService webService;

    @Resource
    private ProjectDao projectDao;

    public boolean insertProject(ProjectDO projectDO) throws Exception {
        try{
            Assert.notNull(projectDO,"项目工程不能为空");
//            Assert.notNull(projectDO.getPomId(),"pom文件不能为空");
//            Assert.notNull(projectDO.getDataBaseId(),"数据库配置信息不能为空");
//            Assert.notNull(projectDO.getJavaId(),"java文件不能为空");
//            Assert.notNull(projectDO.getSpringId(),"spring文件不能为空");
//            Assert.notNull(projectDO.getWebId(),"web文件不能为空");
            Assert.notNull(projectDO.getProjectName(),"项目名称不能为空");
            projectDO.setProjectId(UUIDUtils.getUUID());
            boolean result = projectDao.insertProject(projectDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean updateProject(ProjectDO projectDO) throws Exception {
        try {
            Assert.notNull(projectDO,"项目文件不能为空");
            Assert.notNull(projectDO.getProjectId(),"项目编号不能为空");
            ProjectDO entity = projectDao.selectProjectById(projectDO.getProjectId());
            Assert.notNull(entity,"项目不存在");
            boolean result = projectDao.updateProject(entity) > 0 ;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean deleteProject(String projectId) throws Exception {
        try {
            Assert.notNull(projectId,"项目编号不能为空");
            ProjectDO entity = projectDao.selectProjectById(projectId);
            Assert.notNull(entity,"项目不存在");
            boolean result = projectDao.deleteProject(projectId) > 0;
            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public ProjectDO getProject(String projectId) throws Exception {
        Assert.notNull(projectId,"项目编号不能为空");
        ProjectDO entity = projectDao.selectProjectById(projectId);
        if (null == entity){
            return null;
        }
        return entity;
    }

    public List<ProjectDO> queryProject(ProjectDO query) throws Exception {
        if (null == query){
            return Collections.EMPTY_LIST;
        }
        List<ProjectDO> dataList = projectDao.selectProject(query);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }
        return dataList;
    }
}

