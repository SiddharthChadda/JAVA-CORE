package com.example;

public class Account {
	private double balance;
	private String user;
	private String pwd;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	String check() {
		if (user.equals("ank") && pwd.equals("123")) {
			return "success";
		} else {
			return "fail";
		}
	}

	public double getBalance() {
		if (check().equals("success")) {
			return  balance;
		} else {
			return 0;
		}
	}

	public void setBalance(double balance) {
		if (check().equals("success")) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
		
	}

}
