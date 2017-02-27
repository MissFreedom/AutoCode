package com.mycompany.autocode.utils;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * author: JinBingBing
 * description: rest返回内容
 * time: 2017/2/27 14:36.
 */
public class ResponseResult {

    private static final String ENCODING = "UTF-8";


    /**
     * 异常返回处理
     */
    public static Response returnAbort(String errorJson) {
        return Response.status(Response.Status.BAD_REQUEST).entity(errorJson).type(MediaType.APPLICATION_JSON).encoding(ENCODING).build();
    }

    /**
     * 异常返回处理
     */
    public static Response returnServerError(String errorCode) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorCode).type(MediaType.APPLICATION_JSON).encoding(ENCODING).build();
    }

    /**
     * 成功返回处理
     */
    public static Response returnSuccess(String json) {
        if (json != null) {
            return Response.status(Response.Status.OK).entity(json).type(MediaType.APPLICATION_JSON).encoding(ENCODING).build();
        } else {
            return Response.status(Response.Status.OK).build();
        }
    }

    /**
     * 成功返回处理
     */
    public static Response returnSuccess() {
        return Response.status(Response.Status.OK).build();
    }

}
