package com.example;

import java.util.Scanner;

class Student {
	int stId;
	String name;
	String clgname;
	String stClass;

	public Student(String clgname) {
		this.clgname = clgname;
	}

	public void inserRecord(int stId, String name, String stClass) {
		this.stId = stId;
		this.name = name;
		this.stClass = stClass;
	}

	public void dispRecord() {
		System.out.println(
				"Student [stId=" + stId + ", name=" + name + ", clgname=" + clgname + ", stClass=" + stClass + "]");
	}

}

public class Record {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of records");
		Student obj[]=new Student[sc.nextInt()];
		for (int i = 0; i < obj.length; i++) {
			obj[i]=new Student("IEC");
			System.out.println("enter STudent id");
			int id=sc.nextInt();
			System.out.println("enter STudent name");
			String stname=sc.next();
			System.out.println("enter STudent Class");
			String cls=sc.next();
			obj[i].inserRecord(id, stname, cls);
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.println("Record no "+i);
			obj[i].dispRecord();
		
		}

	}

}
