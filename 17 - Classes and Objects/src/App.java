class Person {
	
	// person object instatienation 
      public Person() {
    	  
		System.out.println("object instatienation");
	}
      
      public Person(String s, int a) {
    	  name=s;
    	  age=a;
  		System.out.println("object instatienation");
  	}
    
    // Classes can contain
     
    // 1. Data
    // 2. Subroutines (methods)
	
	 // Instance variables (data or "state")
    String name;
    int age;
    
    void display(){
    	
    	System.out.println(this.name+" "+this.age);
    }
    //Instance methods(Behaviour)
    void functionality(String s){
    	System.out.println(name+" "+s);
    }
    int workingCapacity(){
		return age*1;
    	
    }
}
 
 
public class App {
	

    public static void main(String[] args) {
   
        
        Person person1;
    	
     // Create a Person object using the Person class
    	 person1 = new Person(); 
    	 
    	System.out.println(person1.name);
    	System.out.println(person1.age);
    	person1.functionality("can play");
    	System.out.println(person1.workingCapacity());
    	
    	
    	
    	Person person2=new Person("munna", 1);
    	
    	System.out.println(person2.name);
    	System.out.println(person2.age);
    	person2.functionality("can play");
    	System.out.println(person2.workingCapacity());
    	person1.functionality("can play");
    	person1.display();
    	person2.display();
         
    }
 
}