
public class Demo {
	int i = 7;
	long l = 7877777777777777777l;
	float f = 78;
	byte b;
	static String s = "hello";
static int sid;
	void disp() {
		System.out.println(i + "      " + f + "            " + s+"     "+b+"    "+sid);
	}

	public static void main(String[] args) {
		//int id = 0;
		Demo d=new Demo();
		d.i=767;
		d.disp();
		System.out.println(d.i);
        System.out.println(s);
        
        
    	Demo d1=new Demo();
		System.out.println(d1.i);
		d1.disp();
	}

}
