package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.JavaDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface JavaDao {

    /**
     * 添加java文件
     */
    int insertJava(JavaDO javaDo);

    /**
     * 删除java文件
     */
    int deleteJava(String id);

    /**
     * 修改Java文件
     */
    int updateJava(JavaDO javaDo);

    /**
     * 通过javaId获取java文件
     */
    JavaDO selectJavaById(String id);

    /**
     * 通过条件获取java文件
     */
    List<JavaDO> selectJava(JavaDO query);
}

