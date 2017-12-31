
public class ThisDescription {
	int a, b;
 public ThisDescription(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("hello");
	}
 public ThisDescription(int b1) {
		b = b1;
		System.out.println("hello");
	}
	void insertRecord(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void disp() {
		System.out.println(a+ "   " +this.b);
	}
	public static void main(String[] args) {
		ThisDescription t = new ThisDescription(343, 678);
		ThisDescription t2 = new ThisDescription(33, 68);
		System.out.println(t.a);
		t.disp();
		t2.disp();
		t.insertRecord(12, 56);
		t.disp();
		t2.disp();
		t2.insertRecord(45, 78);
		t2.disp();
		t.disp();
	}

}
