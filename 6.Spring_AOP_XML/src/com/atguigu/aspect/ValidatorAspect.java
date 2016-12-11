package com.atguigu.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class ValidatorAspect {
	
	public void valiStart(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP参数验证：【"+name+"】方法开始运行,参数是:"+Arrays.asList(args));
	}
	
	public void valiEnd(JoinPoint joinPoint, Object res) {
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP参数验证：【"+name+"】方法运行结束,返回值是:"+res);
	}
	
}
