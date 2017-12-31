
public class Pen {
	String compName, color;
	float price;
	float gripSize;
	static boolean cap;
	static{
		cap=true;
	}
	
	static void change(boolean capstatus){
		cap=capstatus;
	}
	public Pen(String compName, String color, float price, float gripSize) {
		this.compName = compName;
		this.color = color;
		this.price = price;
		this.gripSize = gripSize;
	}
	public Pen(String compName, String color, float price) {
		this.compName = compName;
		this.color = color;
		this.price = price;
	}
	public Pen(String compName, String color) {
		this(compName, color, 56);
		this.compName = compName;
		this.color = color;
	}
	public Pen(String compName) {
		this(compName, "Black");
		this.compName = compName;
	}
	public Pen() {
		System.out.println("pen default constructor");
	}
	void penusedFor(String s) {
		System.out.println(s);
	}
	void showPenFunctionality() {
		this.penusedFor("for writting");
		System.out.println(this.compName + "   " + color + "   " + price+"        "+gripSize+"     "+cap);
	}
	{
		gripSize=0.98f;
	}
	void changePenState(String cn, String c, float p) {
		compName = cn;
		color = c;
		price = p;
	}
}
