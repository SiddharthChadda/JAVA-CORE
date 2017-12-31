package com.example;
class DadaJi{
	int carId=67;
	public DadaJi() {
		super();
		System.out.println("inside DadaJi class");
	}
}
class PapaJi extends DadaJi{
	int carId=90;
	String name="Ram singh";
	
	public PapaJi() {
		super();
		System.out.println("inside PapaJi class");
	}
}
public class BetaJi extends PapaJi{
int carId=2004;

void disp(){
	System.out.println(carId);
	System.out.println(super.carId);
    System.out.println(((DadaJi)this).carId);	
}
	public BetaJi() {
		super();
		System.out.println("inside BetaJi class");
	}
	
	public static void main(String[] args) {
		BetaJi st=new BetaJi();
		
		st.disp();

	}

}
