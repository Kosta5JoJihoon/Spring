package com.kosta.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/gildong")//glidong ��û�� �������� ������ �޼ҵ�
	public String m1(){
		System.out.println("m1()");
		return "hello";
	}
	@RequestMapping("/lime.nhn")//lime.nhn��û�� �������� ������ �޼ҵ�
	public String m2(){
		System.out.println("m2()");
		return "sub/hello"; //root ���� ��, sub ���� �ȿ� �ִ� hello.jsp �� �����ϰڴ�!!!
	}
}
