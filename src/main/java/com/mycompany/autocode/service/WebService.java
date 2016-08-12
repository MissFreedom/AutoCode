package com.mycompany.autocode.service;

import com.mycompany.autocode.model.WebDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface WebService {

    /**
     * 添加Web文件
     * @param webDO
     * @return
     * @throws Exception
     */
    boolean addWeb(WebDO webDO)throws Exception;

    /**
     * 修改Web文件
     * @param webDO
     * @return
     * @throws Exception
     */
    boolean modifyWeb(WebDO webDO)throws Exception;

    /**
     * 移除Web文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeWeb(String id)throws Exception;

    /**
     * 通过Web文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    WebDO getWebById(String id)throws Exception;

    /**
     * 通过查询条件获取Web文件列表
     * @param webDO
     * @return
     * @throws Exception
     */
    List<WebDO> queryWeb(WebDO webDO)throws Exception;

}
