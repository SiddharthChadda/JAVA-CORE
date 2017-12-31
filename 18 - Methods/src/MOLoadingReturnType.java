class Test {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	String add(int a, int b) {
		System.out.println(a + b);
		return "hello";
	}

	public static void main(String[] args) {
		Test t = new Test();
t.add(56, 78);
	}

}
