package com.example;

class Super {
	 void mai() {
       System.out.println("inside super");
	}
}

public class MethodHidding extends Super {
	@Override
	 void mai() {
	       System.out.println("inside MethodHidding");
		}
	public static void main(String[] args) {
		System.out.println("inside method hidding");
	}

}
