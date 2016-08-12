package com.mycompany.autocode.model;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public class UserDO extends BaseDO {

    private static final long serialVersionUID = 2160252984201550990L;

    /** 用户Id*/
    private String id;

    /** 用户名*/
    private String userName;

    /** 密码*/
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
