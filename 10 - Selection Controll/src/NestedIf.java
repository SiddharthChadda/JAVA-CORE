import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			if (a % 3 == 0) {
				System.out.println("so number will be dvisible by 6 also");
			} else {
				System.out.println("it will be divisible only by 2. number will not  be dvisible by 6");
			}

		} else {
			
			System.out.println("it will not  be divisible only by 2");
		}

	}

}
