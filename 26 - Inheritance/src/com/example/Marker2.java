package com.example;

public class Marker2  {
	int price;
	String compName;
	String color;

	public Marker2() {
		// TODO Auto-generated constructor stub
	}

	public Marker2(int price, String compName, String color) {
		this.price = price;
		this.compName = compName;
		this.color = color;
	}

	void writingQuality() {

		System.out.println("gud");
	}

	void lukfeel() {

		System.out.println("nice");
	}

	void pointerSize() {
		System.out.println("0.2mm");
	}
	void pointerSize(float size) {
		System.out.println(size+"mm");
	}
}
