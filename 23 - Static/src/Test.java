public class Test{
 int i;
	public Test() {
		System.out.println("insiode test default constructor");
	}
	static{
		System.out.println("insiode test static blk 1");
	}
	{
		System.out.println("insiode test instance blk 1");
	}
	public Test(int i) {
		this();
		this.i = i;
		System.out.println("insiode test param constructor");
	}
	{
		System.out.println("insiode test instance blk 2");
	}
	static{
		System.out.println("insiode test static blk 2");
	}
	
}
