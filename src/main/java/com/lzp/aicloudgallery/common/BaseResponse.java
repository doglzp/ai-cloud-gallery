package com.lzp.aicloudgallery.common;

import com.lzp.aicloudgallery.exception.ErrorCode;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseResponse<T> implements Serializable {

    private int code;
    private T data;
    private String msg;

    public BaseResponse(int code, T data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public BaseResponse(int code, T data){
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(), null, errorCode.getMsg());
    }

}
