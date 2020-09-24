package com.h3c.mds.auth.annotation;

import java.lang.annotation.*;

/**
 * 数据权限注解，使用该注解表明该方法自动进行权限过滤
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataAuth {

    /**
     * 资源名称，当前对某个资源进行权限过滤
     * eg：productCode   对产品编码过滤
     * @return
     */
    String resource() default "";

    /**
     * 过滤类型
     * roleAuth  角色权限过滤  根据角色拥有的权限过滤
     * userAuth  用户权限过滤  用户只能看到自己的数据，管理员查看所有
     * @return
     */
    String type() default "";

    /**
     * 过滤字段
     * 如果 过滤类型为userAuth 该字段必填
     * @return
     */
    String field() default "";

}
