import java.util.Scanner;

public class IFElseIfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter VAlue");
		int garde = sc.nextInt();
		if (garde >= 90) {
			System.out.println("A++");
		} else if (garde >= 80 && garde < 90) {
			System.out.println("A+");
		} 
		else if (garde >= 70 && garde < 80) {
			System.out.println("A+");
		} 
		else {
			System.out.println("fail");
		}

	}

}
