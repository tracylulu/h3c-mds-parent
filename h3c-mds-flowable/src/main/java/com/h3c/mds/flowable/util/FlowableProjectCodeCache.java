package com.h3c.mds.flowable.util;

import com.h3c.mds.flowable.entity.ProjectCodeProcess;
import com.h3c.mds.flowable.entity.ProjectCodeProcessExt;

/**
 * 流程缓存类
 */
public class FlowableProjectCodeCache {

	//当前流程封装实体
    private static final ThreadLocal<ProjectCodeProcessExt> CURRENT_PROJECTCODE_PROCESS_EXT = new ThreadLocal<>();
    
    private static final ThreadLocal<ProjectCodeProcess> CURRENT_PROJECTCODE_PROCESS = new ThreadLocal<>();
    //当前任务id
    private static final ThreadLocal<String> CURRENT_ACT_TASK_ID = new ThreadLocal<>();

    public static void setCurrentActTaskId(String taskId){
    	CURRENT_ACT_TASK_ID.set(taskId);
    }

    public static String getCurrentActTaskId(){
        return CURRENT_ACT_TASK_ID.get();
    }

    public static void removeCurrentActTaskId(){
    	CURRENT_ACT_TASK_ID.remove();
    }
    
    public static void setCurrentProjectCodeProcessExt(ProjectCodeProcessExt projectCodeProcessExt){
    	CURRENT_PROJECTCODE_PROCESS_EXT.set(projectCodeProcessExt);
    }

    public static ProjectCodeProcessExt getCurrentProjectCodeProcessExt(){
        return CURRENT_PROJECTCODE_PROCESS_EXT.get();
    }

    public static void removeCurrentProjectCodeProcessExt(){
    	CURRENT_PROJECTCODE_PROCESS_EXT.remove();
    }
    
    

    public static void setCurrentProjectCodeProcess(ProjectCodeProcess projectCodeProcess){
    	CURRENT_PROJECTCODE_PROCESS.set(projectCodeProcess);
    }

    public static ProjectCodeProcess getCurrentProjectCodeProcess(){
        return CURRENT_PROJECTCODE_PROCESS.get();
    }

    public static void removeCurrentProjectCodeProcess(){
    	CURRENT_PROJECTCODE_PROCESS.remove();
    }

    public static void removeAll(){
    	CURRENT_PROJECTCODE_PROCESS_EXT.remove();
    	CURRENT_PROJECTCODE_PROCESS.remove();
    	CURRENT_ACT_TASK_ID.remove();
    }
}
