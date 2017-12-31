package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	
	public static void main(String[] args) {
		
         try {
        	 File file = new File("test.txt");
     		FileReader fr = new FileReader(file);
			int i=50/0;
		} catch (ArithmeticException | FileNotFoundException | NullPointerException e) {
			
			e.printStackTrace();
		}
        // System.out.println("hello");
         finally{
        	 System.out.println("java");
         }
	}

}
