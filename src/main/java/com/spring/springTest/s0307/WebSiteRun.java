package com.spring.springTest.s0307;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.vo.WebSiteVo;

public class WebSiteRun {
	public static void main(String[] args) {
		//AbstractApplicationContext ctx = new GenericApplicationContext("xml/webSite.xml");
		//new GenericXmlApplicationContext("xml/sungjuk.xml");
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webSite2.xml");
		WebSiteVo infor = (WebSiteVo) ctx.getBean("infor2");
		System.out.println("driver : " + infor.getDriver());
		System.out.println("url : " + infor.getUrl());
		System.out.println("user: " + infor.getUser());
		System.out.println("password: " + infor.getPassword());
	}
}
