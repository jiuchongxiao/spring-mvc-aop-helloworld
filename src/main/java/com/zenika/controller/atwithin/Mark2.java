package com.zenika.controller.atwithin;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 
 * 
 * @ClassName: Mark
 * 
 * @Description: �Զ���ע��
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��9��5�� ����12:02:46
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface Mark2 {

	public String value() default "";

}
