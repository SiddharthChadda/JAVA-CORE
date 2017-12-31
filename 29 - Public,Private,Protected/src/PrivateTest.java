class Test1 {
private int i = 40;
 Test1() {
	// TODO Auto-generated constructor stub
}
	private void name() {
		System.out.println("inside test1 method");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
	}
}

class PrivateTest {

	 private int i=40;
	 private void name() {
	 System.out.println("inside test1 method");
	 }
	
	public static void main(String[] args) {
		Test1 t = new Test1();
	       t.name();
		
	}

}
