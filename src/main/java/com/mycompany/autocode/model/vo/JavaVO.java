package com.mycompany.autocode.model.vo;

import java.io.Serializable;

/**
 * author: JinBingBing
 * description:
 * time: 2017/2/17 14:07.
 */
public class JavaVO implements Serializable {

    private static final long serialVersionUID = 3467569673879692122L;

    /** javaId*/
    private String JavaId;

    /** 用户Id*/
    private String userId;

    /** java文件名*/
    private String className;

    /** java文件内容*/
    private String classContext;

    public String getJavaId() {
        return JavaId;
    }

    public void setJavaId(String javaId) {
        JavaId = javaId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassContext() {
        return classContext;
    }

    public void setClassContext(String classContext) {
        this.classContext = classContext;
    }
}
