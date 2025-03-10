package com.spring.springTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.springTest.service.SungjukService;
import com.spring.springTest.vo.SungjukVo;

@Controller
@RequestMapping("/0307")
public class T0307Controller {
	
	@Autowired
	SungjukService sungjukService;
	
//@RequestMapping("/0307/test1")
	@RequestMapping("/xmlMenu")
	public String xmlMenuGet()	{
		return "0307/xmlMenu";
	}
	
	@RequestMapping("/test1")
	public String test1Get()	{
		return "0307/test01";
	}
	
	@RequestMapping("/test3")
	public String test2Get(Model model)	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		SungjukVo vo = null;
		
		List<SungjukVo> vos = new ArrayList<SungjukVo>();
		for(int i=1;i<=3;i++) {
			String str = "vo" +i;
			vo = (SungjukVo) ctx.getBean(str);
			vo = sungjukService.calc(vo);
			vos.add(vo);
		}
		model.addAttribute("vos",vos);
		
		ctx.close();
		
		return "0307/test3";
	}
	
	
	
}
