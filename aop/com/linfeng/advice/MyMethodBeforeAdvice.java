package com.linfeng.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
/**
 * 前置通知类
 * @author Administrator
 *
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * method 被调用的方法
	 * args 参数列表
	 * target 被代理的对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		//添加日志
		Log.test(method);
	}

}
