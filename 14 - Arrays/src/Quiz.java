import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctAns=0;
		String cQues[] = { "What is C \n 1. Langugae   2. Compiler \n 3. Alphabet 4. None",
				"Does C support pointers?\n 1.Yes     2. No \n 3. may be    4. None" };
		int[] uAns = new int[cQues.length];
		int []rAns={1,3};
		while (true) {
			System.out.println("Welcome to Quiz");
			System.out.println("Press 1 for C");
			System.out.println("Press 2 for C++");
			System.out.println("Press 3 for Java");
			System.out.println("Press 0 for exit");

			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Welcome to C Quiz \n Please select one answer");
				for (int i = 0; i < cQues.length; i++) {
					System.out.println(cQues[i]);
                     uAns[i]=sc.nextInt();
				}
				for (int i = 0; i < uAns.length; i++) {
						if (uAns[i]==rAns[i]) {
							correctAns++;
					}
				}
				System.out.println("Ur Score is "+correctAns+"/"+cQues.length);

				break;
			case 2:

				break;
			case 3:

				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}
	}

}
