package com.mycompany.autocode.model;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public class JavaDO extends BaseDO {

    private static final long serialVersionUID = 5244747012686932491L;

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
