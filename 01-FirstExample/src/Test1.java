
public class Test1 {
 // Classes can contain
    
    // 1. Data(fields=static & instance)
    // 2. Subroutines (methods)
	// 3. constructor
	// 4. block(static & instanace)
	
	// instance fields
	byte myByte = 127;
    short myShort = 847;
    int age = 28;
    long myLong = 9797;
    double myDouble = 7.3243;
    float myFloat = 324.3f;    
    char myChar = 'a';
    boolean myBoolean = false; 
    String name="ank";
    
    //static fields 
  static int i=90;
  static String str="aptech";
     
  //methods
  static void disp(){
	  System.out.println("inside disp");
  }
    void speak() {
    	//local fields
    	int i;
        for(i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
   public  void  test1(){
	   System.out.println(str);
    	System.out.println("inside Test method");
    }
   
   
    // constructors
//   public Test1() {
//        System.out.println("Constructor running!");
//  }
     
    public Test1(String name) {
    //	this();
        System.out.println("Second constructor running");
    }
//     
//    public Test1(String name, int age) {
//    	 this(name);
//    	 this.age = age;
//        System.out.println("Third constructor running");
//    
//    }

	public static void main(String[] args) {
	Test1 t=new Test1("ank");
System.out.println(t.age+" "+t.name);
	disp();
    System.out.println(i+"    "+str);
    t.test1();
	}

}
