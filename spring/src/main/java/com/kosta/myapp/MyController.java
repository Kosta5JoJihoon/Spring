package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/gildong")//glidong 요청이 들어왔을때 실행할 메소드
	public String m1(){
		System.out.println("m1()");
		return "hello";
	}
	@RequestMapping("/lime.nhn")//lime.nhn요청이 들어왔을때 실행할 메소드
	public String m2(){
		System.out.println("m2()");
		return "sub/hello"; //root 폴더 밑, sub 폴더 안에 있는 hello.jsp 를 실행하겠다!!!
	}
}
