package com.mycompany.autocode.model;

import java.io.Serializable;
import java.util.Date;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/5.
 */
public class BaseDO implements Serializable{

    /** 创建时间 */
    private Date createDate;

    /** 修改时间 */
    private Date modifyDate;

    /** 删除标记 */
    private boolean isdeleted;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public boolean isdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
