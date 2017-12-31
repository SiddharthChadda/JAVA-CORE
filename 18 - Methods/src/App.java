class Person {

    void speak() {
            System.out.println("My name is: ");
    }
     
    int game(){
    	speak();
		return 56;
    	
    }
    void sayHello() {
    	game();
        System.out.println("Hello there!");
    }
}
 
public class App {
 
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.sayHello();
   
 
    }
 
}