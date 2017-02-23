package com.mycompany.autocode.model.vo;

import java.io.Serializable;

/**
 * author: JinBingBing
 * description:
 * time: 2017/2/17 14:08.
 */
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1366691102124574382L;

    /** 用户Id*/
    private String userId;

    /** 用户名*/
    private String userName;

    /** 密码*/
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
