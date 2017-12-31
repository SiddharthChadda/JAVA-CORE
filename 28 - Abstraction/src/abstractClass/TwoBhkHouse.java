package abstractClass;

public abstract class TwoBhkHouse{
	final int noOfRoom = 2;
	static final int hall = 1;
	String vendorName(String name) {
		return name;
	}
	abstract void kitchinType();

	abstract void roomDimension();

	abstract void hallDimension();

	abstract void flatDescription();

}
