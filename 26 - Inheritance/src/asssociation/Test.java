package asssociation;
public class Test  extends Object{
String name;
int age;
	public Test(String name, int age) {
	this.name = name;
	this.age = age;
}
	@Override
public String toString() {
	return "Test [name=" + name + ", age=" + age + "]";
}
public Test() {
}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t);
		Test t1=new Test("ank",56);
		System.out.println(t1.name+"     "+t1.age);

	}

}
