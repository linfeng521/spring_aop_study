package com.linfeng.advice;

import java.lang.reflect.Method;

public class Log {
	public static void test(Method method) {
		System.out.println("---ii-----------添加日志------------\nmethod:"+method.getName());
	}
}
