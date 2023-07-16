package com.su.common.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author swt
 * @date 2023/7/16 17:06
 * 统一封装结果返回
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultResponse {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("提示消息")
    private String msg;

    @ApiModelProperty("返回数据")
    private JSONObject data;

    /**
     * 成功返回信息
     * @return ResultResponse
     */
    public static ResultResponse success(){
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setCode(ResponseEnum.SUCCESS.getCode());
        resultResponse.setMsg(ResponseEnum.SUCCESS.getMsg());
        return resultResponse;
    }

    public static ResultResponse success(JSONObject jsonObject){
        ResultResponse response = success();
        response.setData(jsonObject);
        return response;
    }

    /**
     * 执行出错返回信息
     * @return ResultResponse
     */
    public static ResultResponse error(String msg){
        ResultResponse resultResponse=new ResultResponse();
        resultResponse.setCode(500);
        resultResponse.setMsg(msg);
        return resultResponse;
    }

    public static ResultResponse error(String msg, Integer code){
        ResultResponse resultResponse=new ResultResponse();
        resultResponse.setCode(code);
        resultResponse.setMsg(msg);
        return resultResponse;
    }
}







