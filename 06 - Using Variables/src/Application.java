public class Application {

	int a = 67;// instance variable
	static int a2 = 678;// static variable

	static void msg(){
		System.out.println(a2);
		Application ap=new Application();
		System.out.println(ap.a);
		ap.disp();
	}
	
	void disp(){
		msg();
		int aas=47565;
		System.out.println(aas);
		System.out.println(a2);
		System.out.println(a);
	}
	public static void main(String[] args) {
		int myNumber = 5736574;// local variable & need to initialize before
		int b ;
		byte myByte = 121;
		int d = myByte;// implicit type casting
//		byte c = (byte) b;// explicit type casting
//		int g=myNumber+++ ++b;
		
		System.out.println(myNumber);
		Application ap = new Application();
		Application ap1 = new Application();
		ap.a=89;
		ap1.a=56;
		System.out.println(a2);
		System.out.println(ap.a);
		System.out.println(ap1.a);
		System.out.println("Max value of Integer:" + Integer.SIZE);

	}

}