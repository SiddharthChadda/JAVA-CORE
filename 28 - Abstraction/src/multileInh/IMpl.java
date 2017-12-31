package multileInh;

public class IMpl implements I1,I2{
	public static final int ABC=100; 
	public static void main(String[] args) {
		IMpl i=new IMpl();
		i.disp();
	}
	@Override
	public void disp() {
		System.out.println("Iiiiiiii");
		
	}

	

}
