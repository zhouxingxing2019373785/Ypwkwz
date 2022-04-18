package com.ypwk.wz.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
        * 用于封装服务器到客户端的Json返回值
        * @author soft01
        *
        */
public class JdonResult<T> implements Serializable {
    //Serializable将对象的状态保存在存储媒体中以便可以在以后重新创建出完全相同的副本
    public static final int SUCCESS=0;
    public static final int ERROR=1;
    public static final int OTHER=2;

    private int state;
    private int code;
    private String message = "";
    private T data;
    private String pass="";

}
