package com.spring.springTest.s0307;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.service.BmiService;
import com.spring.springTest.service.SungjukService;
import com.spring.springTest.vo.BmiVo;
import com.spring.springTest.vo.SungjukVo;

public class T05_BMI {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmi.xml");
	
		List<BmiVo> vos = new ArrayList<BmiVo>();
		BmiVo vo = null;
		BmiService service = new BmiService();
		
		vo= (BmiVo) ctx.getBean("vo1");
		vos.add(vo);
		
		vo= (BmiVo) ctx.getBean("vo2");
		vos.add(vo);
		
		vo= (BmiVo) ctx.getBean("vo3");
		vos.add(vo);
		service.getLine();
		for(BmiVo v : vos) {
			service.calBmi(v);
		}
		service.getLine();
		
	}
	
}
