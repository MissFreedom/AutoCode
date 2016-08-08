package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.DataBaseDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public interface DataBaseDao {

    /**
     * 添加数据库配置
     */
    int insertDataBase(DataBaseDO dataBaseDo);

    /**
     * 删除数据库配置
     */
    int deleteDataBase(String id);

    /**
     * 修改数据库配置
     */
    int updateDataBase(DataBaseDO dataBaseDo);

    /**
     * 通过数据库配置Id查询数据库配置
     */
    DataBaseDO selectDataBaseById(String id);

    /**
     * 通过条件查询数据库配置
     */
    List<DataBaseDO> selectDataBase(DataBaseDO dataBaseDo);
}
