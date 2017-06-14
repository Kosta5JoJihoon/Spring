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

	// �ܼ� jsp������ ������!
	@RequestMapping("/0613/form") // ������ url ��û�� ����
	public String form() {
		return "0613/loginForm";// �̵��� �信 ���� ���� return
		/*
		 * ���ϵ� ���ڿ��� InternalResourceViewResolver�� ���� ===>/WEB-INF/views. +
		 * "���� ���ڿ�" + .jsp
		 */
	}
	// �α���ó��

	@RequestMapping("0613/login")
	public String login(HttpServletRequest request) {
		// id = gildong, pass=1234������ �α��� ����!!
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
		// id = gildong, pass=1234������ �α��� ����!!
		System.out.println("id=" + id + " pass" + pass);
		if (id.equals("gildong") && pass.equals("1234"))
			return "0613/success";
		else
			return "0613/fail";
	}

	@RequestMapping("0613/login3")
	public String login3(TestVO vo) {
		// id = gildong, pass=1234������ �α��� ����!!
		System.out.println(vo);
		if (vo.getId().equals("gildong") && vo.getPass().equals("1234"))
			return "0613/success";
		else
			return "0613/fail";
	}

	@RequestMapping("0613/login4")
	public String login4(TestVO vo, HttpSession session) {
		// id = gildong, pass=1234������ �α��� ����!!
		System.out.println(vo);
		if (vo.getId().equals("gildong") && vo.getPass().equals("1234")) {
			// �α��� ������ ����� ������ ������ ����
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
		// ---->key ���� ���������ʴ� Ŭ������ ù���ڸ� �ҹ��ڷ� �ϴ� key���� �ڵ�������
		return "0613/result";

	}

	@RequestMapping("/0613/doE")
	public String doE(RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg", "6�� 13�� �Դϴ�.");
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
