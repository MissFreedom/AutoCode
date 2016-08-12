package com.mycompany.autocode.service;

import com.mycompany.autocode.model.UserDO;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
public interface UserService {

    /**
     * 添加User文件
     * @param userDO
     * @return
     * @throws Exception
     */
    boolean addUser(UserDO userDO)throws Exception;

    /**
     * 修改User文件
     * @param userDO
     * @return
     * @throws Exception
     */
    boolean modifyUser(UserDO userDO)throws Exception;

    /**
     * 移除User文件
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeUser(String id)throws Exception;

    /**
     * 通过User文件Id获取数据
     * @param id
     * @return
     * @throws Exception
     */
    UserDO getUserById(String id)throws Exception;

    /**
     * 通过查询条件获取User文件列表
     * @param userName
     * @return
     * @throws Exception
     */
    UserDO getUserByUserName(String userName)throws Exception;

}
