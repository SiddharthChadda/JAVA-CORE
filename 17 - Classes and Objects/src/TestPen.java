
public class TestPen {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.showPenFunctionality();
		p.changePenState("abc", "red", 35);
		Pen p1 = new Pen();
		p1.showPenFunctionality();
		p.showPenFunctionality();
		
		Pen p2=new Pen("luxor", "blue", 45);
		p2.showPenFunctionality();
		System.out.println(p2.compName);
		Pen.change(false);
		Pen p3=new Pen("link");
		p3.showPenFunctionality();
	}
}
