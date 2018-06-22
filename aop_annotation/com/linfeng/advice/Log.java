package com.linfeng.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //切面类
public class Log {
	//配置切入点, 该方法没有方法体,主要为了同类中其他方法使用此配置的切入点
	@Pointcut("execution(* com.linfeng.service..ad*(..))")
	public void add() {}
	
	/**
	 * 配置前置通知, 使用在方法add()上注册的切入点 同时接受JoinPoint切入点对象. 可以没有该参数
	 * @param joinPoint
	 */
	@Before("add()")
	public void before(JoinPoint joinPoint){
			System.out.println("添加日志信息---"+joinPoint);
	}
	@Around("add()")
	public void around(JoinPoint joinPoint) {
		System.out.println("开始环绕");
		ProceedingJoinPoint pjp = (ProceedingJoinPoint)joinPoint;
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("接受环绕");
	}
	
	@After("add()")
	public void after() {
		System.out.println("关闭数据库连接");
	}
	
	
}
