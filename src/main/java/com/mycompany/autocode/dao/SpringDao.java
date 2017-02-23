package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.SpringDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public interface SpringDao {
    /**
     * 添加spring文件
     */
    int insertSpring(SpringDO springDo);

    /**
     * 删除spring文件
     */
    int deleteSpring(String springId);

    /**
     * 修改spring文件
     */
    int updateSpring(SpringDO springDo);

    /**
     * 通过springId获取spring文件
     */
    SpringDO selectpringById(String springId);

    /**
     * 通过条件获取spring文件
     */
    List<SpringDO> selectSpring(SpringDO query);
}
