package com.mycompany.autocode.service;

import com.mycompany.autocode.model.SpringDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface SpringService {

    /**
     * 添加Spring文件
     * @param springDO
     * @return
     * @throws Exception
     */
    boolean addSpring(SpringDO springDO)throws Exception;

    /**
     * 修改Spring文件
     * @param springDO
     * @return
     * @throws Exception
     */
    boolean modifySpring(SpringDO springDO)throws Exception;

    /**
     * 移除Spring文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeSpring(String id)throws Exception;

    /**
     * 通过Spring文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    SpringDO getSpringById(String id)throws Exception;

    /**
     * 通过查询条件获取Spring文件列表
     * @param springDO
     * @return
     * @throws Exception
     */
    List<SpringDO> querySpring(SpringDO springDO)throws Exception;

}
