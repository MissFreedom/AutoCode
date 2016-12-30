package com.mycompany.autocode.model;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public class PomDO extends BaseDO {

    private static final long serialVersionUID = 7102222796987467077L;

    /** pomId */
    private String pomId;

    /** 用户Id */
    private String userId;

    /** pom文件名 */
    private String pomNane;

    /** pom文件内容 */
    private String pomContext;

    public String getPomId() {
        return pomId;
    }

    public void setPomId(String pomId) {
        this.pomId = pomId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPomNane() {
        return pomNane;
    }

    public void setPomNane(String pomNane) {
        this.pomNane = pomNane;
    }

    public String getPomContext() {
        return pomContext;
    }

    public void setPomContext(String pomContext) {
        this.pomContext = pomContext;
    }
}
