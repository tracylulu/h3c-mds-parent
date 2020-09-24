package com.h3c.mds.utils;

public class CommonsThreadCache {

    //当前操作类型  人员 或 系统自动操作
    private static final ThreadLocal<String> CURRENT_OPERATE_TYPE = new ThreadLocal<>();

    public static String getCurrentOperateType(){
        return CURRENT_OPERATE_TYPE.get();
    }

    public static void setCurrentOperateType(String type){
        CURRENT_OPERATE_TYPE.set(type);
    }

    public static void clear(){
        CURRENT_OPERATE_TYPE.remove();
    }
}
