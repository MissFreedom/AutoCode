package com.mycompany.autocode.model.vo;

import java.io.Serializable;

/**
 * author: JinBingBing
 * description:
 * time: 2017/2/17 14:07.
 */
public class ProjectVO implements Serializable {

    private static final long serialVersionUID = 489132990805830667L;

    /** 项目Id */
    private String projectId;

    /** 项目名称 */
    private String projectName;

    /** 数据库配置d */
    private String dataBaseId;

    /** javaId */
    private String javaId;

    /** pomId */
    private String pomId;

    /** springId */
    private String springId;

    /** 用户Id */
    private String userId;

    /** webId */
    private String webId;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDataBaseId() {
        return dataBaseId;
    }

    public void setDataBaseId(String dataBaseId) {
        this.dataBaseId = dataBaseId;
    }

    public String getJavaId() {
        return javaId;
    }

    public void setJavaId(String javaId) {
        this.javaId = javaId;
    }

    public String getPomId() {
        return pomId;
    }

    public void setPomId(String pomId) {
        this.pomId = pomId;
    }

    public String getSpringId() {
        return springId;
    }

    public void setSpringId(String springId) {
        this.springId = springId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }
}
