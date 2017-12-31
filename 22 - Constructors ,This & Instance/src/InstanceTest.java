
public class InstanceTest {
	int i, a;
	public InstanceTest(int a) {	
		
		// code of all instance initializer 
		this.a=a;
		System.out.println("inside param constructer");
	}
	public InstanceTest() {
	
	}
	{
		i = 90;
		System.out.println("inside instance block");
	}
	void disp(){
		System.out.println("value of i "+i+"   &  "+a);
	}
	public static void main(String[] args) {
		System.out.println("inside main before");
		InstanceTest it = new InstanceTest(45);
		it.disp();
	}
	{
		i = 906;
		System.out.println("inside instance block 2");
	}
	{
		i = 90689;
		System.out.println("inside instance block 5");
	}
	{
		i = 9087;
		System.out.println("inside instance block 8");
	}
}
