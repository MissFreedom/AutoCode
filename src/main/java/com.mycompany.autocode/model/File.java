package com.mycompany.autocode.model;

/**
 * Created by hzjbb on 2016/7/1.
 */
public class File {

    /**
     * web.xml内容
     */
    private String web;

    /**
     * pom.xml内容
     */
    private String pom;

    /**
     * web首页内容
     */
    private String index;

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPom() {
        return pom;
    }

    public void setPom(String pom) {
        this.pom = pom;
    }
}
