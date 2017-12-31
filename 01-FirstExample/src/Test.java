import java.util.Scanner;

public class Test {
	static int b;

	public Test() {
		b++;
	}

	void msg() {
		System.out.println(b);
	}

	public static void main(String[] args) {

		Test t = new Test();
		Test t1 = new Test();
		Test a1 = new Test();
		Test s1 = new Test();
		Test af1 = new Test();
		t.msg();
		t1.msg();
		System.out.println(t instanceof Object);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt(5);     
		System.out.println(a);
	}

}
