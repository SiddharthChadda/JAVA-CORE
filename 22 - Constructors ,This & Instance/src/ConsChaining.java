class Person {
   String name;
    int age;
    public Person() { 
        System.out.println("Constructor running!");
       System.out.println(name+"  "+age);
    }
     
    public Person(String name) {
        this(); 
        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        // this.name = name;
       System.out.println(name+"  "+age);
        
    }
    public Person(String name, int age) {
    	this(name);
        System.out.println("Third constructor running");
        this.name = name;
        this.age = age;
      System.out.println(name+"  "+age);
    }
    
    void disp(){
    	System.out.println(name+"  "+age);
    }
}
public class ConsChaining {
static int ab;
	public static void main(String[] args) {
		Person p1=new Person("naveen", 24);
		p1.disp();
//		Person p11=new Person("naveen");
//		p11.disp();
//		new Person("abhishek", 23).disp();    
//		new Person("abhishek", 23).disp();  
	}
}
