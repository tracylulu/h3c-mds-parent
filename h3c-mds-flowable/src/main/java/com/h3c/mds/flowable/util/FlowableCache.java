package com.h3c.mds.flowable.util;

import org.apache.tomcat.jni.Thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程缓存类
 */
public class FlowableCache {

    //当前处理人
    private static final ThreadLocal<String> CURRENT_HANDLER = new ThreadLocal<>();
    //当前处理节点
    private static final ThreadLocal<String> CURRENT_NODE = new ThreadLocal<>();
    //结束节点
    private static final ThreadLocal<String> CURRENT_ELEMENT = new ThreadLocal<>();
    //当前状态描述
    private static final ThreadLocal<String> CURRENT_STATUS_DESC = new ThreadLocal<>();
    //流程当前线程容器
    private static final ThreadLocal<Map<String,Object>>  context = new ThreadLocal();
    //当前任务
    private static final String CURRENT_TASK = Thread.class.getName()+"CURRENT_TASK";


    public static void setCurrentHandler(String currentHandler){
        CURRENT_HANDLER.set(currentHandler);
    }

    public static String getCurrentHandler(){
        return CURRENT_HANDLER.get();
    }

    public static void removeCurrentHandler(){
        CURRENT_HANDLER.remove();
    }

    public static void setCurrentNode(String node){
        CURRENT_NODE.set(node);
    }

    public static String getCurrentNode(){
        return CURRENT_NODE.get();
    }

    public static void removeCurrentNode(){
        CURRENT_NODE.remove();
    }

    public static void setCurrentElement(String element){
        CURRENT_ELEMENT.set(element);
    }

    public static String getCurrentElement(){
        return CURRENT_ELEMENT.get();
    }

    public static void removeCurrentElement(){
        CURRENT_ELEMENT.remove();
    }

    public static void setCurrentStatusDesc(String currentStatusDesc){
        CURRENT_STATUS_DESC.set(currentStatusDesc);
    }

    public static String getCurrentStatusDesc(){
        return CURRENT_STATUS_DESC.get();
    }

    public static void removeCurrentStatusDesc(){
        CURRENT_STATUS_DESC.remove();
    }

    public static List getCurrentTask(){
        return (List) get(CURRENT_TASK);
    }

    public static void setCurrentTask(Object currentTask){

        Object o = get(CURRENT_TASK);
        if(o == null){
            o = new ArrayList<>();
            set(CURRENT_TASK, o);
        }
        List list = (List) o;
        list.add(currentTask);
    }

    private static Object get(String key){
        Map<String, Object> map = context.get();
        if(map == null){
            map = new HashMap<>();
            context.set(map);
        }
        return map.get(key);
    }

    private static void set(String key,Object value){
        Map<String, Object> map = context.get();
        if(map == null){
            map = new HashMap<>();
            context.set(map);
        }
        map.put(key, value);
    }

    public static void removeAll(){
        CURRENT_HANDLER.remove();
        CURRENT_NODE.remove();
        CURRENT_ELEMENT.remove();
        CURRENT_STATUS_DESC.remove();
        context.remove();
    }
}
