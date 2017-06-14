package com.kosta.myapp;

public class TestVO {
	private String id;
	private String pass;
	

	

	@Override
	public String toString() {
		return "TestVO [id=" + id + ", pass=" + pass + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
