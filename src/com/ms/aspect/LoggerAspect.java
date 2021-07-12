package com.ms.aspect;
/**
 * 注解->切面
 * 注解->bean
 * 注解->条件
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
		System.out.println("开始日志："+joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("结束日志："+joinPoint.getSignature().getName());
		return object;
	}
}
