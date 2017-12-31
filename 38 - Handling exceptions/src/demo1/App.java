package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {

		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);
			try {
				int i = 45 / 0;
			} catch (ArithmeticException a) {
				// System.out.println(a);
				// a.printStackTrace();
				System.out.println(a.getMessage());
			} catch (Exception a) {
				// System.out.println(a);
				// a.printStackTrace();
				System.out.println(a.getMessage());
			}
		} catch (FileNotFoundException a) {
			// System.out.println(a);
			// a.printStackTrace();
			System.out.println(a.getMessage());
		} catch (ArithmeticException a) {
			// System.out.println(a);
			// a.printStackTrace();
			System.out.println(a.getMessage());
		} catch (Exception a) {
			// System.out.println(a);
			// a.printStackTrace();
			System.out.println(a.getMessage());
		}
		System.out.println("hello aptech");
	}

}