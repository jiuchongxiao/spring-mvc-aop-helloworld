package com.zenika.controller.atwithin;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @ClassName: AtWithinAspect
 * 
 * @Description: ��ע��@Aspect ������ǿ����
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��9��5�� ����1:53:40
 */

@Aspect
@Component
public class AtWithinAspect implements Ordered {
	@Pointcut(value="execution(* com.zenika.controller.*.*(..))")
	public void pointCut(){
	}
//	@Around("pointCut()")
	@Around("@target(com.zenika.controller.atwithin.Mark2)")
	public void crossCuttingCode(ProceedingJoinPoint joinPoint)
			throws Throwable {
		System.out.println("****AtWithinAspect.crossCuttingCode() : "
				+ joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		try {
			joinPoint.proceed();
		} finally {
			// Do Something useful, If you have
		}
		System.out.println("****AtWithinAspect.crossCuttingCode() : "
				+ joinPoint.getSignature().getName()
				+ ": After Method Execution \n");
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
