package com.czy.common.base.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回类
 */
@Data
public class BaseRep implements Serializable {

    private static final long serialVersionUID = -8187615618856282525L;

    public static int success=0;
    public static int fail=-1;

    public static String successMsg = "success";
    public static String failMsg = "fail";

    private Integer code;
    private String msg;
    private Object result;

    public BaseRep(){
        code = 0;
        msg = "successfully";
    }

    public BaseRep(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public BaseRep(Integer code, String msg, Object result){
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public static BaseRep success(){

        return new BaseRep(success, successMsg, null);
    }

    public static BaseRep success(Object data){

        return new BaseRep(success, successMsg, data);
    }

    public static BaseRep success(String message, Object data){

        return new BaseRep(success, message, data);
    }

    public static BaseRep fail(){

        return new BaseRep(fail, failMsg, null);
    }

    public static BaseRep fail(Object data){

        return new BaseRep(fail, failMsg, data);
    }

    public static BaseRep fail(String message, Object data){

        return new BaseRep(fail, message, data);
    }

    public static BaseRep fail(Integer code, String message, Object data){

        return new BaseRep(code, message, data);
    }
}

