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
    int insertWeb(SpringDO springDo);

    /**
     * 删除spring文件
     */
    int deleteWeb(String id);

    /**
     * 修改spring文件
     */
    int updateWeb(SpringDO springDo);

    /**
     * 通过springId获取spring文件
     */
    SpringDO selectpringById(String id);

    /**
     * 通过用户Id获取用户所有spring文件
     */
    List<SpringDO> selectSpringByUserId(String userId);
}
