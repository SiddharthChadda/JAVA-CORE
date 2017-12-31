import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String s = sc.next();
		switch (s) {
		default:
			System.out.println("default");
			break;
		case "a": 
			System.out.println("hello 5");
			System.out.println("hello 67");
			System.out.println("hello 567");
			break;
		
		case "hghjgh": {
			System.out.println("hello 3");
		}
			break;
		case "6": {
			System.out.println("hello 4");
		}
		}
	}
}
