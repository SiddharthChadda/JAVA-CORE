import java.io.IOException;
import java.sql.SQLClientInfoException;

public class Try1 {

	public static void main(String[] args) {

   try {
			int i = 50 / 5;
			System.out.println("test12");
			try {
				String s = null;
				System.out.println(s.length());
				System.out.println("test123 ");
			} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} 
			System.exit(0);
		} 
   finally{
	   System.out.println("test4");
   }
		System.out.println("test1");
	}

}
