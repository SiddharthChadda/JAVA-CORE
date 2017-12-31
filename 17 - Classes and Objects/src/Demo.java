
public class Demo {
int i;
static{
	System.out.println("inside static block2");
}
Demo() {
	System.out.println("inside default cons");
}
static{
	System.out.println("inside static block1");
}
{
	System.out.println("inside instance block2");
}
	public Demo(int i) {
	this.i = i;
	System.out.println("inside param cons");
}
	{
		System.out.println("inside instance block1");
	}
	public static void main(String[] args) {
	new Demo();

	}

}
