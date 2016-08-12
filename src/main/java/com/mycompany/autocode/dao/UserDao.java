package com.mycompany.autocode.dao;

import com.mycompany.autocode.model.UserDO;

import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public interface UserDao {

    /**
     * 添加用户
     */
    int insertUser(UserDO userDo);

    /**
     * 删除用户
     */
    int deleteUser(String id);

    /**
     * 修改用户
     */
    int updateUser(UserDO userDo);

    /**
     * 通过用户Id查询用户信息
     */
    UserDO selectUserById(String id);

    /**
     * 查询用户信息
     */
    UserDO selectUserByUserName(String userName);
}
