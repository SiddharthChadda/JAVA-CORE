import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		if (a == 4) {
			System.out.println("a is equal to 4");
		}
		else if(a==5){
			System.out.println("a is equal to 5");
		}
		else if(a==6){
			System.out.println("a is equal to 6");
		}
		else if(a==7){
			System.out.println("a is equal to 7");
		}
		else{
			System.out.println("a is not  equal to 4,5,6,7");
		}
	}
}
