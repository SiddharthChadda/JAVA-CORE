import java.*;
import java.util.Scanner;
public class T1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter 1st number");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a%100==0) {
        	if (a%400==0) {
				System.out.println("leap year");
			} else {
				System.out.println("not leap year");
			}
		} else {
			if (a%4==0) {
				System.out.println("leap year");
			} else {
				System.out.println("not leap year");

			}

		}
}
}