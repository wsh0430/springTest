package com.spring.springTest.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BmiVo {
	private String name;
	private double weight;
	private double height;
	private double bmi;
	private String grade;
}
