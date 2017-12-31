import java.util.Scanner;

public class MethodDeclation {
	
	int a=90;
	
	int disp(){
		return a;
	}
	void show(){
		System.out.println("Value of a:= "+a);
	}
	String msg(int a){
		return "hello";
	}
	void dispaly(String name, int d){
		System.out.println("inside display"+name+"    "+d);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entter value");
		String s=sc.next();
		System.out.println("entter value number");
		int a=sc.nextInt();
		MethodDeclation m=new MethodDeclation();
		m.dispaly(s, a);
		System.out.println(m.disp());
		System.out.println(m.msg(a));
	}

}
