package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.calulator.MathCalulator;

public class AOPTest {

	ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void test() {
		MathCalulator bean = ioc.getBean(MathCalulator.class);
		bean.div(4, 2);
	}

}
