package abstractClass;

public class DemoHouse {

	public static void main(String[] args) {
    TwoBhkHouse j=new JpConstruction();
	j.flatDescription();
	j.kitchinType();
	j.hallDimension();
	j.roomDimension();
	j.welcomeMsg();
	System.out.println(j.noOfRoom);
	Aashiyana a=new Aashiyana();
	a.flatDescription();
	a.kitchinType();
	a.hallDimension();
	a.roomDimension();

	}

}
