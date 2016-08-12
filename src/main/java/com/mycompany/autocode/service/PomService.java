package com.mycompany.autocode.service;

import com.mycompany.autocode.model.PomDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface PomService {

    /**
     * 添加Pom文件
     * @param pomDO
     * @return
     * @throws Exception
     */
    boolean addPom(PomDO pomDO)throws Exception;

    /**
     * 修改Pom文件
     * @param pomDO
     * @return
     * @throws Exception
     */
    boolean modifyPom(PomDO pomDO)throws Exception;

    /**
     * 移除Pom文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removePom(String id)throws Exception;

    /**
     * 通过Pom文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    PomDO getPomById(String id)throws Exception;

    /**
     * 通过查询条件获取Pom文件列表
     * @param pomDO
     * @return
     * @throws Exception
     */
    List<PomDO> queryPom(PomDO pomDO)throws Exception;

}
