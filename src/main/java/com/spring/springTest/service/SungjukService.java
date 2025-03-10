package com.spring.springTest.service;

import org.springframework.stereotype.Service;

import com.spring.springTest.vo.SungjukVo;

//@Component
@Service
public class SungjukService {
	public void getLine() {
		System.out.println("======================================");
	}

	public SungjukVo calc(SungjukVo vo) {
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		double avg = tot /3.0;
		String grade = "";
		if(avg>=90) grade="A";
		else if(avg>=80) grade="B";
		else if(avg>=70) grade="C";
		else if(avg>=60) grade="D";
		else grade = "F";
		
		vo.setTot(tot);
		vo.setAvg(avg);
		vo.setGrade(grade);
		
		sungjukPrint(vo);
		
		return vo; //웹에 찍으려면 리턴타입 필요, void에서 SungjukVo로변경
	}

	private void sungjukPrint(SungjukVo vo) {
		System.out.println(vo.getName()+"\t"+vo.getKor()+"\t"+vo.getEng()+"\t"+vo.getMat()+"\t"+vo.getTot()+"\t"+vo.getAvg()+"\t"+vo.getGrade()+"\t");
	}
}
