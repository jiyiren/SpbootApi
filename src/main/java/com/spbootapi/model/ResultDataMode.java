package com.spbootapi.model;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2017/6/4 下午9:14
 * @Description
 */

public class ResultDataMode<T> extends ResultMode {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
