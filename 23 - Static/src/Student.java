
public class Student {
	int rollNum=12;
	String name;
	static String clgName="jhj";
	
	static{
		clgName="amity";
		System.out.println("inside static blk");
	}
	public Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}
	
	static void change(String clgName){
		Student.clgName=clgName;
	}
	
	
	
	void disp() {
		System.out.println(rollNum + "   " + name + "    " + clgName);
	}
}
