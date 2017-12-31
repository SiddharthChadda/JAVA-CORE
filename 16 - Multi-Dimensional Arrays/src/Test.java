
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[][] grid = {
		            {3, 5, 2343},
		            {2, 4},
		            {1, 2, 3, 4}
		        };
		 for (int[] is : grid) {
			 for (int i   : is) {
				 System.out.print(i+" ");
			}
			System.out.print("\n");
		}

	}

}
