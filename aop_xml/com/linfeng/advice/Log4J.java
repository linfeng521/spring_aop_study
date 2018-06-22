package com.linfeng.advice;

import org.aspectj.lang.JoinPoint;

public class Log4J {
	public void before(JoinPoint joinPoint) {
		System.out.println("添加日志"+joinPoint);
	}
}
