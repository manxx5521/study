package com.base.annotation.example;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ˮ������ע��
 */
@Target(ElementType.FIELD)  //������
@Retention(RetentionPolicy.RUNTIME)  //����ʱ��Ч
@Documented		//���Ա��ĵ���
public @interface FruitName {
    String value() default "";
}
