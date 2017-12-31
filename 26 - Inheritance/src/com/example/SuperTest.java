package com.example;
class Person {
    String name="ankit";
   int age=24;
    void disp(){
    	System.out.println("inside Person disp msg");
    }
    
    public Person(String name, int age) {
    	System.out.println("Person Constructor running! param");
		this.name = name;
		this.age = age;
	}

	public Person() {
		this("ank", 56);
        System.out.println("Person Constructor running!");
    }
}
public class SuperTest extends Person {
	String name="tinkal";
	 int age=25;
	 void disp(){
	    	System.out.println("inside test disp msg");
	    }
		public SuperTest() {
			super();// by default called by JVm no need to write
			System.out.println(super.hashCode()+"   "+this.hashCode());
			System.out.println(super.equals(this));
			System.out.println(super.getClass()+"   "+this.getClass());
			
		}
	
	public static void main(String[] args) {
		
		try {
			new SuperTest();
			Thread.currentThread().sleep(50*60*6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
