import java.util.Scanner;


public class DemoScanner {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String");
	     char a[]=sc.nextLine().toCharArray();
 for (char c : a) {
	System.out.println(c);
}
	}

}
