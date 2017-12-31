import java.util.Scanner;
public class Calcultor {

	void addition(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	void subtraction(int a, int b){
		int c=a-b;
		System.out.println(c);
	}
	void multiplication(int a, int b){
		int c=a*b;
		System.out.println(c);
	}
	void division(double a, double b){
		double c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter 2end number");
		int b=sc.nextInt();
		Calcultor c=new Calcultor();
		c.addition(a, b);
		c.subtraction(a, b);
		c.multiplication(a, b);
		c.division(a, b);

	}

}
