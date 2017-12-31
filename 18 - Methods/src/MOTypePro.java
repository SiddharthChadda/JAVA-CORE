
public class MOTypePro {
	
	
	void add(float a, float b){
		float c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		MOTypePro t=new MOTypePro();
		t.add('a', 'd');
		t.add(12.7f, 89.7f);
		t.add((byte)34, 56);

	}

}
