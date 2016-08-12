package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.UserDao;
import com.mycompany.autocode.model.UserDO;
import com.mycompany.autocode.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean addUser(UserDO userDO) throws Exception {
        return false;
    }

    public boolean modifyUser(UserDO userDO) throws Exception {
        return false;
    }

    public boolean removeUser(String id) throws Exception {
        return false;
    }

    public UserDO getUserById(String id) throws Exception {
        return null;
    }

    public UserDO getUserByUserName(String userName) throws Exception {
        return null;
    }
}
