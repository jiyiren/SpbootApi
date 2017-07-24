package com.spbootapi.model;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2017/6/4 下午7:28
 * @Description
 */

public class ResultMode {

    //成功
    public final static String SUCCESS_CODE="1";
    //失败
    public final static String FAILURE_CODE="0";

    private String resultCode;
    private String msg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
