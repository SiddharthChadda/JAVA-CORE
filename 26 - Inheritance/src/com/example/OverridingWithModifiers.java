package com.example;

class Test12 {
  void disp() {
		System.out.println("inside disp()");
	}
  void disp(String s) {
		System.out.println("inside disp()");
	}
}

public class OverridingWithModifiers extends Test12 {
	@Override
	public void disp() {
		
		System.out.println("inside disp() of OverridingWithModifiers");
	}
	@Override
	void disp(String s) {

		System.out.println("inside disp(String s) of OverridingWithModifiers");
	}

	public static void main(String[] args) {
         
	}

}
