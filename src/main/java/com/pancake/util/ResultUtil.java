package com.pancake.util;

import com.pancake.entity.Result;

/**
 * Created by m on 2017/6/8.
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatus(0);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer status, String msg) {
        Result result = new Result();
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }
}
