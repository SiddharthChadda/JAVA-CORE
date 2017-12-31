package com.example;

class Test {
	int i;
	public Test() {
		super();
		
		System.out.println("inside test default constructor");
	}
	static {
		System.out.println("insiode test static blk 1");
	}
	{
		System.out.println("insiode test instance blk 1");
	}
	public Test(int i) {
		this();
		this.i = i;
		System.out.println("insiode test param constructor");
	}

	{
		System.out.println("insiode test instance blk 2");
	}

	static {
		System.out.println("insiode test static blk 2");
	}
}

public class Demo extends Test{
	int a=89;
	
	public Demo(int a) {
		super();
		this.a = a;
		System.out.println("inside Demo param constructor");
	}

	static {
		System.out.println("insiode Demo static blk 1");
	}

	{
		System.out.println("insiode Demo instance blk 1");
	}

	public Demo() {
		System.out.println("inside Demo defult constructor");
	}
	{
		System.out.println("insiode Demo instance blk 2");
	}

	static {
		System.out.println("insiode Demo static blk 2");
	}

	public static void main(String[] args) {
	new Demo(67);
	}

}
