import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		int[] p;
		Scanner sc= new Scanner(System.in);	
		System.out.println("enter aray size");
         	p=new int[sc.nextInt()];
	
	/*syntax of forEach loop
	 * for (data_type ref_variable : Array_name/collection_name) {
		System.out.println(ref_variable);
	}*/
		
	for (int i = 0; i < p.length; i++) {
		System.out.println("enter value");
		p[i]=sc.nextInt();
	}
	/*for (int i = 0; i <= p.length; i++) {
		System.out.println(p[i]);
	}*/
	for (int i : p) {
		System.out.println(i);
	}
	}

}
