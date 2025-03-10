package com.spring.springTest.service;

import com.spring.springTest.vo.BmiVo;

public class BmiService {
	public void getLine() {
		System.out.println("======================================");
	}
	
	public void calBmi(BmiVo vo) {
		double heightmeter = vo.getHeight()/(double)100;
		double heightmetersquare = heightmeter*heightmeter;
		double bmi = vo.getWeight() / heightmetersquare;
		String grade ="";
		if(bmi<=18.5) grade = "저체중";
		else if(bmi<=22.9) grade = "정상";
		else if(bmi<=24.9) grade = "과체중";
		else if(bmi<=29.9) grade = "1단계 비만";
		else if(bmi<=34.9) grade = "2단계 비만";
		else grade = "3단계 비만";
		
		vo.setGrade(grade);
		vo.setBmi(bmi);
		
		BmiPrint(vo);
	}
	private void BmiPrint(BmiVo vo) {
		System.out.println(vo.getName()+"\t"+vo.getWeight()+"\t"+vo.getHeight()+"\t"+vo.getBmi()+"\t"+vo.getGrade());
	}
}
