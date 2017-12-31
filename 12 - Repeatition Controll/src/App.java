import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st no ");
		/*
		 * int value = scanner.nextInt(); while (value != 10) {
		 * System.out.println("Enter a inner number: "); value =
		 * scanner.nextInt(); System.out.println(value); }
		 */

		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
			System.out.println("do executed......");
			System.out.println(value);
		} while (value != 5);
		System.out.println("Got 5!");

	}
}