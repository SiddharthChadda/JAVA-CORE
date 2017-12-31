class Machine1 {
	String name;
	int code;
	int id;
	boolean light=true;
	
	{
		light=true;
	}

	public Machine1(String name, int code, int id) {
		
		this.name = name;
		this.code = code;
		this.id = id;
	}
	{
		light=false;
	}
	void msg() {
		System.out.println("gud morning");
	}

	void disp() {
		this.msg();
		System.out.println(this.name + "  " + this.code + "     " + id+"        "+light);
	}
}

public class DefaultCon {
	public static void main(String[] args) {
	
		Machine1 m2 = new Machine1("abc", 567, 12);
	         m2 = new Machine1("abc1", 5671, 121);
		m2.disp();
		System.out.println(m2.code);
	}
}
