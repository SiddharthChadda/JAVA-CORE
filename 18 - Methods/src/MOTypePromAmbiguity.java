
public class MOTypePromAmbiguity {
	
	
	void add(int a, long b){
		float c=a+b;
		System.out.println(c);
	}
	

	void add(long a, int b){
		float c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		MOTypePromAmbiguity t=new MOTypePromAmbiguity();
		
		t.add(12, 89);
      //  t.add(34, 56l);

	}

}
