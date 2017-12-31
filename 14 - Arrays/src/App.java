import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int ab[]={5,57,65,7,75,7};
		int b[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		b=new int[n];
		for (int i = 0; i < b.length; i++) {
			System.out.println("enter value");
			b[i] = sc.nextInt();

		}
	/*	for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}*/
		
		/*for(data_type ref_var:Array_Name){
			System.out.println(ref_var);
		}*/
		for(int a:b){
			System.out.println(a);
		}
		
	}

}