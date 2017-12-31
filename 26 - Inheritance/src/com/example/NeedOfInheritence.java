package com.example;
class Student{
	int stId;
	String name;
	void record(){
		
		System.out.println(stId+"  "+name);
	}
}

class Student1 {
	String clgName="Niet";
	void newRecord(){
		Student s=new Student();
		System.out.println(s.name+"   "+s.stId);
		s.record();
		System.out.println("RECORD");
		System.out.println(clgName);
	}
	
}

public class NeedOfInheritence {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.newRecord();

	}

}
