package com.spring.springTest.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.controller.HelloController;

public class HelloMain {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("application-config.xml");
		
		
		HelloController controller = context.getBean(HelloController.class);
		controller.hello("홍길동");
		System.out.println();
		
		controller = context.getBean(HelloController.class);
		controller.hello("김말숙");
		
		context.destroy();
		context.close();
	}
}
