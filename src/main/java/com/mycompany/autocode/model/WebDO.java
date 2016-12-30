package com.mycompany.autocode.model;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public class WebDO extends BaseDO {

    private static final long serialVersionUID = 949188362027972834L;

    /** webId*/
    private String webId;

    /** 用户Id*/
    private String userId;

    /** web文件名 */
    private String webName;

    /** web文件内容*/
    private String webContext;

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getWebContext() {
        return webContext;
    }

    public void setWebContext(String webContext) {
        this.webContext = webContext;
    }
}
