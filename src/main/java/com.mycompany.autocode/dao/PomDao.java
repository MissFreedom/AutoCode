package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.PomDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public interface PomDao {
    /**
     * 添加pom文件
     */
    int insertPom(PomDO pomDoDo);

    /**
     * 删除pom文件
     */
    int deletePom(String id);

    /**
     * 修改pom文件
     */
    int updatePom(PomDO pomDo);

    /**
     * 通过pomId获取pom文件
     */
    PomDO selectPomById(String id);

    /**
     * 通过条件获取Pom文件
     */
    List<PomDO> selectPom(PomDO query);
}
