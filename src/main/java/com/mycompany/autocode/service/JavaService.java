package com.mycompany.autocode.service;

import com.mycompany.autocode.model.JavaDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface JavaService {

    /**
     * 添加Java文件
     * @param javaDO
     * @return
     * @throws Exception
     */
    boolean addJava(JavaDO javaDO)throws Exception;

    /**
     * 修改Java文件
     * @param javaDO
     * @return
     * @throws Exception
     */
    boolean modifyJava(JavaDO javaDO)throws Exception;

    /**
     * 移除Java文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeJava(String id)throws Exception;

    /**
     * 通过Java文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    JavaDO getJavaById(String id)throws Exception;

    /**
     * 通过查询条件获取Java文件列表
     * @param javaDO
     * @return
     * @throws Exception
     */
    List<JavaDO> queryJava(JavaDO javaDO)throws Exception;

}
