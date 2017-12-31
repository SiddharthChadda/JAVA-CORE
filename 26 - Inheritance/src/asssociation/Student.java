package asssociation;

public class Student {
	String name;
	int age;
	String collegeName;
	final Address address;

	public Student(String name, int age, String collegeName, Address address) {
		this.name = name;
		this.age = age;
		this.collegeName = collegeName;
		this.address = address;
	}

/*	public Student(String name, int age, String collegeName) {
		this.name = name;
		this.age = age;
		this.collegeName = collegeName;
	}*/

	void msg() {
		System.out.println("inside smg student");
	}

	void disp() {
		System.out.println(name + "  " + age + " " + collegeName);
	///System.out.println(address);
		 System.out.println(address.line1+" "+address.line2+"  "+address.district);
	}

	public static void main(String[] args) {
		Address ad = new Address("b-33", "sector-2", "G.B. nagar");
		Student st = new Student("ragvendra", 23, "amity",ad);
		// System.out.println(st);
		st.disp();
	}

}
