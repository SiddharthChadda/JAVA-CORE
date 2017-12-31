
public class MOLoading2 {
	void add(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	void add(float a, float b){
		float c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MOLoading2 t = new MOLoading2();	
		t.add(12,56);
		t.add(12.4f,45.0f);
		
	}

}
