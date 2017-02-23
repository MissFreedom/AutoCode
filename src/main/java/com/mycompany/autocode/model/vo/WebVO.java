package com.mycompany.autocode.model.vo;

import java.io.Serializable;

/**
 * author: JinBingBing
 * description:
 * time: 2017/2/17 14:08.
 */
public class WebVO implements Serializable {

    private static final long serialVersionUID = 4307140168109383648L;

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
