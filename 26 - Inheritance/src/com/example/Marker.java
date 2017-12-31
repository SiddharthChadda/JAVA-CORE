package com.example;

public class Marker  {
	int price;
	String compName;
	String color;

	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(int price, String compName, String color) {
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
void pointerSize(final float size) {
		        float  size1=size+9;
		System.out.println(size+"mm");
	}
}
