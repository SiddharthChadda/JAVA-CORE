
public class StaticTest {
	static String Name = "director";

	static void rulesDeclation() {
		System.out.println("you must be follow it");
	}

	static void change() {
		Name = "ismaila";
	}

	static {
		Name = "Nikhil";
		System.out.println("must be come office on time");
	}

	void msg() {
		System.out.println(Name);
	}

	public static void main(String[] args) {
		System.out.println(Name);
		change();
		System.out.println(Name);
		rulesDeclation();
		StaticTest st = new StaticTest();
		st.msg();
		System.out.println(st.Name);

	}

}
