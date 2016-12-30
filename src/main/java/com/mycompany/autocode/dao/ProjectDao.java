package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.ProjectDO;

import java.util.List;

/**
 * author: JinBingBing
 * description: 项目配置
 * time: 2016/10/31 8:56.
 */

public interface ProjectDao {

    /**
     * 插入项目配置
     */
    int insertProjectDao(ProjectDO projectDO);

    /**
     * 更新项目配置
     */
    int updateProjectDao(ProjectDO projectDO);

    /**
     * 删除项目配置
     */
    int deleteProjectDao(String projectId);

    /**
     * 查询项目配置信息
     */
    ProjectDO getProjectDaoById(String projectId);

    /**
     * 分页查询项目配置信息
     */
    List<ProjectDO> selectProjectDao(ProjectDO query);
}
