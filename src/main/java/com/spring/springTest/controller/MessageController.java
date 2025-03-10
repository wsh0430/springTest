package com.spring.springTest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
	
	@RequestMapping(value = "/message/{msgFlag}", method = RequestMethod.GET)
	public String getMessage(Model model, @PathVariable String msgFlag,
			@RequestParam(name = "mid", defaultValue = "", required = false) String mid
		) {
		
		if(msgFlag.equals("MemberNo")) {
			model.addAttribute("message","정회원이 아니시군요.\\회원가입 해주세요.");
			model.addAttribute("url","/");
		}
		else if(msgFlag.equals("MemberOk")) {
			model.addAttribute("message","정회원님 반갑습니다.");
			model.addAttribute("url","/0306/test14");
		}
		else if(msgFlag.equals("homeOk")) {
			model.addAttribute("message","홈으로 갑니다.");
			model.addAttribute("url","/");
		}
		
		return "include/message";
		
	}
	
}
