package com.atguigu.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class LogAspect {
	
	public void logStart(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP日志：【"+name+"】方法开始运行,参数是:"+Arrays.asList(args));
	}
	
	public void logEnd(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP日志：【"+name+"】方法运行结束!");
	}
	
	public void logException(JoinPoint joinPoint,Exception e) {
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP日志：【"+name+"】方法运行出现异常:"+e);
	}
	
	public void logReturn(JoinPoint joinPoint, Object res) {
		String name = joinPoint.getSignature().getName();
		System.out.println("AOP日志：【"+name+"】方法正常结束,返回值为:"+res);
	}
}
