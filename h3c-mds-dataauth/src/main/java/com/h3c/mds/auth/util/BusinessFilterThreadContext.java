package com.h3c.mds.auth.util;

import com.h3c.mds.auth.annotation.BusinessFilter;

import java.util.HashMap;

public class BusinessFilterThreadContext {

    private static final String FILTER_STATUS = Thread.class.getName()+"_FILTER_STATUS";

    private static final String FILTER_PARAM = Thread.class.getName()+"_FILTER_PARAM";

    private static final String FILTER_ANNOTATION = Thread.class.getName()+"_FILTER_ANNOTATION";

    private static ThreadLocal<HashMap<String,Object>> context = new ThreadLocal<>();

    public static String getFilterStatus(){
        return (String) get(FILTER_STATUS);
    }

    public static void setFilterStatus(String status){
        set(FILTER_STATUS,status);
    }

    public static Object getFilterParam(){
        return get(FILTER_PARAM);
    }

    public static void setFilterParam(Object param){
        set(FILTER_PARAM, param);
    }

    public static BusinessFilter getFilterAnnotation(){
        return (BusinessFilter) get(FILTER_ANNOTATION);
    }

    public static void setFilterAnnotation(BusinessFilter businessFilter){
        set(FILTER_ANNOTATION, businessFilter);
    }

    public static Object get(String key){
        if(context.get() == null) return null;
        HashMap<String, Object> map = context.get();
        return map.get(key);
    }

    public static void set(String key,Object val){
        if(context.get() == null){
            context.set(new HashMap<>());
        }
        context.get().put(key, val);
    }
}
