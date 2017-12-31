public class Application {
	void printTable(int j){
	        for(int i=1;i<=10 ;i++) {
	            System.out.println("The table of "+j+"  is: "+i*j);
	        }
	}
	void printTrangle(int l){
        for(int i=0;i<l ;i++) {
        	for (int k = 0; k <= i; k++) {
				
        		System.out.print("* ");
			}
            System.out.println("\n");
        }
}
    public static void main(String[] args) {
        Application a=new  Application();
     //a.printTable(4);
        a.printTrangle(12);
    }
}