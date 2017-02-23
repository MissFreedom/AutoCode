package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.UserDao;
import com.mycompany.autocode.model.UserDO;
import com.mycompany.autocode.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao userDao;

    public boolean addUser(UserDO userDO) throws Exception {
        try {
            Assert.notNull(userDO,"用户信息不能为空");
            Assert.notNull(userDO.getUserId(),"账号不能为空");
            Assert.notNull(userDO.getUserName(),"用户昵称不能为空");
            Assert.notNull(userDO.getPassword(),"用户密码不能为空");
            boolean result = userDao.insertUser(userDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean modifyUser(UserDO userDO) throws Exception {
        try {
            Assert.notNull(userDO,"用户信息不能为空");
            Assert.notNull(userDO.getUserId(),"账号不能为空");
            UserDO entity = userDao.selectUserById(userDO.getUserId());
            Assert.notNull(entity,"用户信息不存在");
            boolean result = userDao.updateUser(userDO) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public boolean removeUser(String id) throws Exception {
        try {
            Assert.notNull(id,"账号不能为空");
            UserDO entity = userDao.selectUserById(id);
            Assert.notNull(entity,"用户信息不存在");
            boolean result = userDao.deleteUser(id) > 0;

            return result;
        }catch (Exception e){
            logger.error(this.getClass().getName()+e.getMessage(),e);
            throw e;
        }
    }

    public UserDO getUserById(String id) throws Exception {
        Assert.notNull(id,"账号不能为空");
        UserDO entity = userDao.selectUserById(id);
        if (null == entity){
            return null;
        }

        return entity;
    }

    public List<UserDO> getUserByUserName(String userName) throws Exception {
        if (null == userName){
            return Collections.EMPTY_LIST;
        }
        List<UserDO> dataList = userDao.selectUserByUserName(userName);
        if (CollectionUtils.isEmpty(dataList)){
            return Collections.EMPTY_LIST;
        }

        return dataList;
    }
}
