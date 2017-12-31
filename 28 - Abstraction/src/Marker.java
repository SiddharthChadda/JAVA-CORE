

abstract public class Marker  {
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
	void markerDetails() {
		System.out.println(price + "     " + compName + "     " + color);
	}
abstract	void writingQuality() ;
abstract  void lukfeel() ;
abstract void pointerSize() ;
abstract void pointerSize(final float size) ;
}
