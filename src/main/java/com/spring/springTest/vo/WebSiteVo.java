package com.spring.springTest.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor //@Data랑 충돌됨 같이사용X
@NoArgsConstructor
public class WebSiteVo {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
}
