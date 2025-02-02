package com.lw.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wenLiu
 * @create 2020-09-19 23:06
 */

/**
 * 实体检验自定义注解类，根据我们自定义的注解去检查实体各个字段是否在规定的值内
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)  //runtime运行时一直持续
public @interface ValidateEntity {
    boolean required() default false; //是否检验null

    boolean requiredMaxLength() default false; //是否检验检验长度最大值

    boolean requiredMinLength() default false; //是否检验检验长度最小值

    boolean requiredMaxValue() default false; //是否检验最大值

    boolean requiredMinValue() default false; //是否检验最小值




    int maxLength() default -1; //最大长度

    int minLength() default -1; //最小长度

    double maxValue() default -1; //大值

    double minValue() default -1; //最小值





    String errorRequiredMsg() default ""; //值为null时的错误提示信息

    String errorMinLengthMsg() default ""; //最小长度不满足时的提示信息

    String errorMaxLengthMsg() default ""; //最大长度不满足时的提示信息

    String errorMinValueMsg() default ""; //最小值不满足时的提示信息

    String errorMaxValueMsg() default ""; //最大值不满足时的提示信息
}
