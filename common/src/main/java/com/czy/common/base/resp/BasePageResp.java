package com.czy.common.base.resp;

import lombok.Data;

/**
 * 封装的分页返回模型
 */
@Data
public class BasePageResp {

    public static final String successMsg = "success";
    public static final Integer successCode = 0;
    public static final String failMsg = "fail";
    public static final Integer failCode = -1;

    private String msg;
    private Integer code;
    private Object data;
    private Long total;

    public BasePageResp(){}

    public BasePageResp(Object data, String msg, Integer code, Long total){
        this.msg = msg;
        this.code = code;
        this.data = data;
        this.total = total;
    }

    public static BasePageResp success(){
        return new BasePageResp(null, successMsg, successCode,0L);
    }

    public static BasePageResp success(Object data, Long total){
        return new BasePageResp(data, successMsg, successCode, total);
    }

    public static BasePageResp fail(){
        return new BasePageResp(null, failMsg, failCode, 0L);
    }

    public static BasePageResp fail(Object data, Long total){
        return new BasePageResp(data, failMsg, failCode, total);
    }

    public static BasePageResp fail(Object data, String msg, Long total){
        return new BasePageResp(data, msg, failCode, total);
    }

    public static BasePageResp fail(Object data, String msg, Integer code, Long total){
        return new BasePageResp(data, msg, code, total);
    }

}