
public class Variables {
    int id;// instance variable
    static int rollNumber;// static variable
   
    float f=67.7f;
    char c='h';
    long l=  c;// implicit type casting
    byte b=(byte)c;// explicit type casting
    void disp(){// instance method
    	int number=0;
    	System.out.println(number);
    	System.out.println(id+"      "+rollNumber);
    }
    
    
	public static void main(String[] args) {
		/*Variables var=new Variables();
		System.out.println(var.id);
		var.disp();*/
		int id=8;
		// 1000;
		//00001000;
		//00000100
		//00000010
		//00000001
		
		System.out.println(id|3);
		
		System.out.println(id>0?"positive number":"negative number");
		   
	}

}
