package com.cbl.hexpay.bean;

/**
 * Created by HEC271
 * on 2017/6/2.
 */

public class AuthBean {

    /**
     * SESSION_ID : 1101
     * SOURCE : 3   请求来源
     * REQUEST_TIME : 2015-01-02 12:01:01  //时间
     * LOCAL_LANGUAGE : en                 //语言版本
     * SIGN_TYPE : 1                        //签名方式 1 是MD5
     * SIGNATURE : 2309823293ADS9ADS9898A9  //签名字符串
     */
    private String ACCOUNT_ID;
    private String SESSION_ID;
    private String SOURCE;
    private String REQUEST_TIME;
    private String LOCAL_LANGUAGE;
    private String SIGN_TYPE;
    private String SIGNATURE;

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getSESSION_ID() {
        return SESSION_ID;
    }

    public void setSESSION_ID(String SESSION_ID) {
        this.SESSION_ID = SESSION_ID;
    }

    public String getSOURCE() {
        return SOURCE;
    }

    public void setSOURCE(String SOURCE) {
        this.SOURCE = SOURCE;
    }

    public String getREQUEST_TIME() {
        return REQUEST_TIME;
    }

    public void setREQUEST_TIME(String REQUEST_TIME) {
        this.REQUEST_TIME = REQUEST_TIME;
    }

    public String getLOCAL_LANGUAGE() {
        return LOCAL_LANGUAGE;
    }

    public void setLOCAL_LANGUAGE(String LOCAL_LANGUAGE) {
        this.LOCAL_LANGUAGE = LOCAL_LANGUAGE;
    }

    public String getSIGN_TYPE() {
        return SIGN_TYPE;
    }

    public void setSIGN_TYPE(String SIGN_TYPE) {
        this.SIGN_TYPE = SIGN_TYPE;
    }

    public String getSIGNATURE() {
        return SIGNATURE;
    }

    public void setSIGNATURE(String SIGNATURE) {
        this.SIGNATURE = SIGNATURE;
    }
}
