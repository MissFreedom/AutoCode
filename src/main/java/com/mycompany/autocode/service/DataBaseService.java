package com.mycompany.autocode.service;

import com.mycompany.autocode.model.DataBaseDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface DataBaseService {

    /**
     * 添加数据库配置文件
     * @param dataBaseDO
     * @return
     * @throws Exception
     */
    boolean addDataBase(DataBaseDO dataBaseDO)throws Exception;

    /**
     * 修改数据库配置文件
     * @param dataBaseDO
     * @return
     * @throws Exception
     */
    boolean modifyDataBase(DataBaseDO dataBaseDO)throws Exception;

    /**
     * 移除数据库配置文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeDataBase(String id)throws Exception;

    /**
     * 通过数据库配置文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    DataBaseDO getDataBaseById(String id)throws Exception;

    /**
     * 通过查询条件获取数据库配置文件列表
     * @param dataBaseDO
     * @return
     * @throws Exception
     */
    List<DataBaseDO> queryDataBase(DataBaseDO dataBaseDO)throws Exception;

}
