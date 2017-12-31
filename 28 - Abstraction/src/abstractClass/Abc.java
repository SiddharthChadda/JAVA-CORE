package abstractClass;

public abstract class Abc {
	int i;
	static int j;

	public Abc() {
		System.out.println("inside Abc()");
	}

	abstract void msg();

	public Abc(int i) {
		this.i = i;
	}

	static void disp() {
		System.out.println("inside disp");
	}

	{
		System.out.println("instance");
	}

	static {
		System.out.println("static");
	}

	public static void main(String[] args) {

	}

}
