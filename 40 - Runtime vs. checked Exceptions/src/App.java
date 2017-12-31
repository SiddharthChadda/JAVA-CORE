public class App {
 
    public static void main(String[] args) {
         
        // Null pointer exception ....
       
       
        System.out.println("try more exception of nullpointer");
        try {
        	 String text = null;
			System.out.println(text.length());
 		} catch (NullPointerException e) {
 			e.printStackTrace();
 			System.out.println(e.getMessage());
	           System.out.println(e);
		}
        catch( Throwable e){
        	System.out.println(e);
        	} 
        System.out.println("rest of the code..."); 
      
        // Arithmetic exception ... (divide by zero)
       // int value = 7/0;
          System.out.println("try more exception");
        // You can actually handle RuntimeExceptions if you want to;
        // for example, here we handle an ArrayIndexOutOfBoundsException
//        String[] texts = { "one", "two", "three" };
// 
//        try {
//            System.out.println(texts[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.toString());
//        }
    }
}