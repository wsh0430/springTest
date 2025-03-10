package com.spring.springTest.controller;


import com.spring.springTest.service.IHelloService;

public class HelloController {
//	어노테이션방식(구 방식)
//	@Autowired
//	IHelloService iHelloService;
	
//	//setter를 통한 값 주입(의존성주입)
//	private IHelloService iHelloService;
//	public void setiHelloService(IHelloService iHelloService) {
//		this.iHelloService = iHelloService;
//	}
	
	//스프링 부트에서 쓸 방식(요즘 쓰는방식)
	private final IHelloService iHelloService;
	
	public HelloController(IHelloService iHelloService) {
		this.iHelloService = iHelloService;
	}
	
	
	// 이름을 매개값으로 받아서, 그 값을 서비스객체에서 처리 후 돌려받은 후 컨트롤러에서 그 결과를 출력시켜보자.
	public void hello(String name) {
		String res = iHelloService.sayHello(name);
		System.out.println("전달된 값 : " + res);
	}
	
	
}
