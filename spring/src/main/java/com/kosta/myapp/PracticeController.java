package com.kosta.myapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PracticeController {
	
	@RequestMapping("/0613/practice")
	public String practice2(HttpServletRequest request){
		String t1 = request.getParameter("t1");
		String t2 = request.getParameter("t2");
		System.out.println("ù��°ĭ: "+t1+"�ι�°ĭ: "+t2);
		if(t1.equals("����") && t2.equals("õ��"))
			return "0613/success";
			
		else
			return "0613/fail";
	}
	
	@RequestMapping("/practice")
	public String practice(){
		return "0613/practice";
	}
}
