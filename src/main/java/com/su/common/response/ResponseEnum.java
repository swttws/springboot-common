package com.su.common.response;

/**
 * @author swt
 * @date 2023/7/16 17:09
 * 返回消息的枚举类
 */
public enum ResponseEnum {

    /**
     * 成功返回状态信息
     */
    SUCCESS(200,"服务器执行成功");

    /**
     *状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;


    ResponseEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getMsg(){
        return this.msg;
    }
}

