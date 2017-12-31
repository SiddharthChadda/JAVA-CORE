
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("try more exception of nullpointer");
	        try {
	        	 String text = null;
				System.out.println(text.length());
	 		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArrayStoreException  e) {
	 			e.printStackTrace();
	 			System.exit(0);
			}
	        finally{
	        	System.out.println("inside finally bloack");
	        }
//	        catch( Exception e){
//	        	System.out.println(e);
//	        	} 
	        System.out.println("rest of the code..."); 
	}

}
