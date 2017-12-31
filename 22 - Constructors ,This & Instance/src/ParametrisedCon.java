class Student {
	String name;
	int stId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String n, int i) {
		System.out.println("Third constructor running");
		name = n;
		stId = i;
	}
	void disp() {
		System.out.println(this.name + "  " +this.stId);
	}
}
public class ParametrisedCon {
	public static void main(String[] args) {
		Student st2=new Student();
		Student st = new Student("Avishi", 7);
		st.disp();
		Student st1 = new Student("manish", 78);
		st1.disp();
		st2.disp();
	}
}