package com.spring.springTest.s0307;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.vo.SungjukVo;

public class T02_sungjukRun {
	public static void main(String[] args) {
		/*
		xml 파일을 읽어오는 위치와 시점에 따른 4가지 Class
		ClassPathXmlApplicationContext : ClassPath에 위치한 xml파일을 읽어 설정정보를 로딩시켜줌
		FileSystemXmlApplicationContext : 파일경로로 지정된곳의 xml파일을 읽어 설정정보를 로딩시켜줌
		XmlWebApplicationContext : 웹 어플리케이션에 위치한곳의 xml파일을 읽어 설정정보를 로딩시켜줌
		AnnotationConfigApplicationContext : @Configuration어노테이션의 붙은 클래스에서의 xml파일을 읽어 설정정보를 로딩시켜줌
		
		앞에 정의된것들에 보편화된 클래스 : GenericXmlApplicationContext()
		
		xml로 만든파일을 스프링컨테이너에 bean으로 등록시켰으면, 호출시는 'getBean("id")', 'getBean("id",클래스)'로 불러서 사용
		*/
		/*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		//SungjukVo vo = ctx.getBean("vo1", SungjukVo.class); //적어주면알아서 컨트롤 스페이스로 class임포트됨
		SungjukVo vo = (SungjukVo) ctx.getBean("vo1"); //윗줄꺼 이렇게 써도 됨(강제타입변환)
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng: " + vo.getEng());
		System.out.println("mat: " + vo.getMat());
		System.out.println();
		
		vo = ctx.getBean("vo2", SungjukVo.class);
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng: " + vo.getEng());
		System.out.println("mat: " + vo.getMat());
		System.out.println();
		
		vo = ctx.getBean("vo3", SungjukVo.class);
		System.out.println("name : " + vo.getName());
		System.out.println("kor : " + vo.getKor());
		System.out.println("eng: " + vo.getEng());
		System.out.println("mat: " + vo.getMat());
		System.out.println();
	}
}
