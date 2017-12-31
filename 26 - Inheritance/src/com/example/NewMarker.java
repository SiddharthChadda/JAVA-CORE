package com.example;

public class NewMarker extends Marker {
	int price = 90;
	public NewMarker() {
	}
	public NewMarker(int price, String compName, String color) {
		super(price, compName, color);
	}
	void oldMarkerDetails() {
		System.out.println(super.price + "     " + super.compName + "     " + super.color);
	}
	void markerDetails() {
		System.out.println(this.price + "     " + compName + "     " + color);
	}

	void addGrip() {
		System.out.println("grip added");
	}

	@Override
	void pointerSize() {
		System.out.println("0.5mm");
	}

}
