package com.h3c.mds.auth.annotation;

import java.lang.annotation.*;

/**
 * 基于结果集的权限业务过滤注解，使用该注解会对查询后的结果集进行过滤（目前考虑情况较少，慎用）
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BusinessFilter {

    /**
     * 资源名称，当前对某个资源进行权限过滤，命名要规范
     * eg：productCode   对产品编码过滤
     * 目前没用到
     * @return
     */
    String resource() default "";

    /**
     * 过滤类型
     * treeFilter  树层级 一层一层过滤
     * baseFilter  基本过滤，只过滤本层
     * @return
     */
    String type() default "";

    /**
     * 指定具体处理器，来过滤结果集
     * eg：businessFilterHandler
     * 如有特殊需求自行实现 FilterHandler 接口实现特殊处理器
     * @return
     */
    String handler() default "businessFilterHandler";

    /**
     * 指定过滤策略
     * eg：baseFilterStrategy    默认过滤策略
     * @return
     */
    String strategy() default "baseFilterStrategy";

    /**
     * 过滤字段
     * @return
     */
    String field() default "readers";
}
