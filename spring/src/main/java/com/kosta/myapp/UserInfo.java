package com.kosta.myapp;

public class UserInfo {
	
	private String name="나길동";
	private String email="gildong@naver.com";
	private String addr="가산이노플렉스";
	

	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", email=" + email + ", addr=" + addr + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddr() {
		return addr;
	}
	
	
}
