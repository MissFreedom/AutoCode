package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.WebDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public interface WebDao {

    /**
     * 添加web文件
     */
    int insertWeb(WebDO webDo);

    /**
     * 删除web文件
     */
    int deleteWeb(String webId);

    /**
     * 修改web文件
     */
    int updateWeb(WebDO webDo);

    /**
     * 通过webId获取web文件
     */
    WebDO selectWebById(String webId);

    /**
     * 通过条件获取web文件
     */
    List<WebDO> selectWeb(WebDO query);

}
