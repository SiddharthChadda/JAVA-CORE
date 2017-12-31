
public class ThisTest {

	void m(){
		System.out.println("inside m");
	}
	void k(){
	    l();
		System.out.println("inside k");
	}
	void l(){
	this.m();
		System.out.println("inside l");
	}
	public static void main(String[] args) {
		ThisTest t=new ThisTest();
		t.k();
		ThisTest t1=new ThisTest();
		t1.k();

	}

}
