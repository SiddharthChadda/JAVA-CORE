
public class Record {

	public static void main(String[] args) {
		System.out.println("inside main");
		Student s = new Student(12, "ankit");
		Student s1 = new Student(13, "Manisha");
		Student s2 = new Student(15, "Kavya");
		s2.disp();
		s1.disp();
		Student.change("NIIT");
		s.disp();
	}

}
