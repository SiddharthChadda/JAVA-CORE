class Acc {
     
	private int bal;
	
	public Acc(int bal) {
		this.bal = bal;
	}

	public void setBal(int b){
		if (b>1000) {
			bal=b;
		} else {
           this.bal=0;
		}
	}
     
	public int getBal(int a){
		if (a<500) {
			bal=bal-a;
			return bal;
		} else {
			return 0;
		}
		
		
		
	}
     
}
 
 
public class App {
 
    public static void main(String[] args) {
    	Acc ac=new Acc(5000);
    	System.out.println(ac.getBal(234));
        ac.setBal(1678);
        System.out.println(ac.getBal(234));
    }
 
}