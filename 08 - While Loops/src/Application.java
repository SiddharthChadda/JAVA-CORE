public class Application {
	void printTable(int j){
		 int value = 1;
	     
	        while(value <= 10)
	        {
	        	System.out.println("The table of "+j+"  is: "+value*j);
	             
	            value = value + 1;
	        }
}
    public static void main(String[] args) {
    	
    	 Application a=new  Application();
         a.printTable(12);
    
         
       
    }
}