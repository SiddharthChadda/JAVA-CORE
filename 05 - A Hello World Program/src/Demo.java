import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
           System.out.println("Enter 1st number");
           Scanner sc =new Scanner(System.in);
           int a=sc.nextInt();
           System.out.println("Enter 2end number");
           int b=sc.nextInt();
           System.out.println("Enter 3rd number");
           int c=sc.nextInt();
           if (a>b) {
        	   if (a>c) {
				System.out.println(a+" is gretest");
			} else {
			System.out.println(b+"is greatest");
			}
			
		} else {
			if (b>c) {
				System.out.println(b+" is gretest");
			} else {
				System.out.println(c+" is gretest");
			}

		}
	}

}
