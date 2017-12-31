package com.example;

public class AtmPrinter {
	private String user;
	private String pwd;

	public AtmPrinter(String user, String pwd) {
		this.user = user;
		this.pwd = pwd;
	}

	public void creditBalance(double bal) {
		Account ac = new Account();
		ac.setUser(user);
		ac.setPwd(pwd);
		ac.setBalance(bal);
		System.out.println(ac.getBalance());
	}

	public static void main(String[] args) {
		AtmPrinter ap = new AtmPrinter("ank", "123");
		ap.creditBalance(5678);
		AtmPrinter ap1 = new AtmPrinter("ank1", "1231");
		ap1.creditBalance(5678);
              
	}

}
