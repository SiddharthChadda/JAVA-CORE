

public class NewMarker extends Marker {
	int price = 90;
 int id=890;
	public NewMarker() {
	}

	public NewMarker(int price, String compName, String color) {
		super(price, compName, color);
	}

	void markerDetails() {
		System.out.println(price + "     " + compName + "     " + color);
	}

	void addGrip() {
		System.out.println("grip added");
	}

	@Override
	void pointerSize() {
		System.out.println("0.5mm");
	}

}
