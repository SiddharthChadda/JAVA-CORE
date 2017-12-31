
public class App1 {

	public static void main(String[] args) {
		int []a[];
		         a=new int[3][5];
		         
		a[0][2]=89;
		a[1][2]=67;
		a[2][1]=678;
		a[1][4]=67;
		//using for loop
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(" "+a[i][j]);
			}
		}*/
		
		// using for each loop
		for (int[] is : a) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}

}
