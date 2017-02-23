package com.mycompany.autocode.model.vo;

import java.io.Serializable;

/**
 * author: JinBingBing
 * description:
 * time: 2017/2/17 14:08.
 */
public class SpringVO implements Serializable {

    private static final long serialVersionUID = 2883273772530673069L;

    /** springId */
    private String springId;

    /** 用户Id */
    private String userId;

    /** spring文件名 */
    private String springName;

    /** spring文件内容 */
    private String springContext;

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

    public String getSpringName() {
        return springName;
    }

    public void setSpringName(String springName) {
        this.springName = springName;
    }

    public String getSpringContext() {
        return springContext;
    }

    public void setSpringContext(String springContext) {
        this.springContext = springContext;
    }
}
