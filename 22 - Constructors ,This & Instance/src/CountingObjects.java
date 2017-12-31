
public class CountingObjects {
	static int i;
	public CountingObjects() {
		i++;
		System.out.println(i);
	}


	public static void main(String[] args) {
		CountingObjects c=new CountingObjects();

		CountingObjects c5=new CountingObjects();
		CountingObjects c1=new CountingObjects();
		CountingObjects c2=new CountingObjects();
		CountingObjects c3=new CountingObjects();
		CountingObjects c4=new CountingObjects();
		System.out.println(i);
	}

}
