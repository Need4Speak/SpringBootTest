package com.pancake.entity;

/**
 * Created by m on 2017/6/8.
 */
public class Result<T> {
    /* 错误码 */
    private int status;
    /* 提示信息 */
    private String msg;
    /* 具体信息 */
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
