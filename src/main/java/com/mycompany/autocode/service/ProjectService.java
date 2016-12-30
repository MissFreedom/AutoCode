package com.mycompany.autocode.service;

import com.mycompany.autocode.model.ProjectDO;

import java.util.List;

/**
 * author: JinBingBing
 * description: 项目工程
 * time: 2016/11/11 11:40.
 */

public interface ProjectService {

    /**
     * 新建项目工程
     * @param projectDO
     * @return
     * @throws Exception
     */
    boolean insertProject(ProjectDO projectDO)throws Exception;

    /**
     * 修改项目工程
     * @param projectDO
     * @return
     * @throws Exception
     */
    boolean updateProject(ProjectDO projectDO)throws Exception;

    /**
     * 删除项目工程
     * @param projectId
     * @return
     * @throws Exception
     */
    boolean deleteProject(String projectId)throws Exception;

    /**
     * 获取项目详情
     * @param projectId
     * @return
     * @throws Exception
     */
    ProjectDO getProject(String projectId)throws Exception;

    /**
     * 查询项目信息
     * @param query
     * @return
     * @throws Exception
     */
    List<ProjectDO> queryProject(ProjectDO query)throws Exception;
}
