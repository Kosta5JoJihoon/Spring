package com.kosta.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class YouControl {

	@RequestMapping("/hi")
	public String you() {
		return "hello";
	}

	@RequestMapping("/hello")
	public void test() {

	}

	// 단순 jsp페이지 포워딩!
	@RequestMapping("/0613/form") // 가상의 url 요청을 정의
	public String form() {
		return "0613/loginForm";// 이동할 뷰에 대한 정보 return
		/*
		 * 리턴된 문자열은 InternalResourceViewResolver에 전달 ===>/WEB-INF/views. +
		 * "리턴 문자열" + .jsp
		 */
	}
	// 로그인처리

	@RequestMapping("0613/login")
	public String login(HttpServletRequest request) {
		// id = gildong, pass=1234였을때 로그인 성공!!
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		System.out.println("id=" + id + "pass" + pass);
		if (id.equals("gildong") && pass.equals("1234"))
			return "0613/success";
		else
			return "0613/fail";
	}

	@RequestMapping("0613/login2")
	public String login2(String id, String pass) {
		// id = gildong, pass=1234였을때 로그인 성공!!
		System.out.println("id=" + id + " pass" + pass);
		if (id.equals("gildong") && pass.equals("1234"))
			return "0613/success";
		else
			return "0613/fail";
	}

	@RequestMapping("0613/login3")
	public String login3(TestVO vo) {
		// id = gildong, pass=1234였을때 로그인 성공!!
		System.out.println(vo);
		if (vo.getId().equals("gildong") && vo.getPass().equals("1234"))
			return "0613/success";
		else
			return "0613/fail";
	}

	@RequestMapping("0613/login4")
	public String login4(TestVO vo, HttpSession session) {
		// id = gildong, pass=1234였을때 로그인 성공!!
		System.out.println(vo);
		if (vo.getId().equals("gildong") && vo.getPass().equals("1234")) {
			// 로그인 성공시 사용자 정보를 영역에 저장
			UserInfo user = new UserInfo();

			session.setAttribute("user", user);
			return "redirect:/0613/success";
		} else
			return "0613/fail";
	}

	@RequestMapping("0613/success")
	public void success() {

	}

	@RequestMapping("/login")
	public String login() {
		return "0613/loginForm";
	}

	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg, HttpServletRequest request, Model model) {
		// String msg = request.getParameter("msg");
		// request.setAttribute("msg",msg);
		// request.setAttribute("userInfo", new userInfo());
		// model.addAttribute("userInfo", new UserInfo());
		model.addAttribute(new UserInfo());
		// ---->key 값을 지정하지않는 클래스의 첫글자를 소문자로 하는 key값이 자동설정됨
		return "0613/result";

	}

	@RequestMapping("/0613/doE")
	public String doE(RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg", "6월 13일 입니다.");
		return "redirect:/doF";
	}

	@RequestMapping("/doF")
	public @ResponseBody String doF() {
		return "goodBye";
	}
	
	@RequestMapping("/doJSON")
	public @ResponseBody UserInfo doJSON(){
		UserInfo userinfo = new UserInfo();
		return userinfo;
	}
}
