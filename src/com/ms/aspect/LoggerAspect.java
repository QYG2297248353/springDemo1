package com.ms.aspect;
/**
 * ע��->����
 * ע��->bean
 * ע��->����
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggerAspect {
	@Around(value = "execution(* com.ms.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("��ʼ��־��"+joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("������־��"+joinPoint.getSignature().getName());
		return object;
	}
}
