package com.spring.springTest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public String logTestGet() {
		//로깅레벨(Logging Level)
		//trace/debug/  info/warning/error  /fatal
		//디버깅 목적으로 사용 : trace,debug(로그저장X)
		//로그확인용 : info/warning/error
		
		Date today = new Date();
		
		log.info("Lombok라이브러리를 이용한 출력(@Slf4j");
		log.info("1. 현재 날짜 시간은? {}", today);
		log.debug("2. 현재 날짜 시간은(trace)? {}", today); //안나옴
		log.trace("3. 현재 날짜 시간은(trace)? {}", today); //안나옴
		log.warn("4. 현재 날짜 시간은(trace)? {}", today);
		log.error("5. 현재 날짜 시간은(trace)? {}", today);
		
		System.out.println();
		
		logger.info("Logger 객체를 이용한 로그 출력");
		logger.info("1. 현재 날짜 시간은? {}", today);
		logger.debug("2. 현재 날짜 시간은(trace)? {}", today); //안나옴
		logger.trace("3. 현재 날짜 시간은(trace)? {}", today); //안나옴
		logger.warn("4. 현재 날짜 시간은(trace)? {}", today);
		logger.error("5. 현재 날짜 시간은(trace)? {}", today);
		//logger.fatal("5. 현재 날짜 시간은(trace)? {}", today);
		
		
		
		
		
		return "redirect:/message/homeOk";
	}
	
}
