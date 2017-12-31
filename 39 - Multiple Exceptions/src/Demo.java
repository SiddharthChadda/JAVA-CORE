import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Demo {

	void display(int b){
		if(b>0)
		throw new ArithmeticException("u cant devide any number by 0");
	}
	void test() throws FileNotFoundException, ArithmeticException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}
	public static void main(String[] args) {
	Demo d=new Demo();
//	try {
//		d.test();
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	d.display(6);
	System.out.println("aptech");

	}

}
