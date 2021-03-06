package com.ektha.app.aspect;

import java.sql.SQLException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	private Logger logger = LoggerFactory.getLogger(LogAspect.class);

//	@Before("execution(public * com.ektha.app.controller.*.*(..))")
//	public void logMethod(JoinPoint joinPoint) {
//		
//		logger.info(joinPoint.toShortString());
//	}

//	@AfterReturning(pointcut="execution(public * com.ektha.app.controller.*.*(..))", returning="returnValue")
//	public void logMethod(JoinPoint joinPoint, Object returnValue) {
//		
//		logger.info(joinPoint.toShortString());
//		System.out.println(returnValue);
//	}
//
//	@Around("execution(public * com.ektha.app.controller.*.*(..))")
//	public Object logMethod(ProceedingJoinPoint proceedingJointPoint) throws Throwable {
//
//		logger.info("Before : " + proceedingJointPoint.toShortString());
//		Object returnValue = proceedingJointPoint.proceed();
//		logger.info("After : " + proceedingJointPoint.toShortString());
//		return returnValue;
//		
//	}
	
	

	@AfterThrowing(pointcut = "execution(public * com.ektha.app.controller.*.*(..))", throwing = "sqlException")
	public void logMethod(JoinPoint joinPoint, SQLException sqlException) throws Throwable {
		logger.info(joinPoint.toShortString());
	}

}
