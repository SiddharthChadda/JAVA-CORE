
public class StateChanged extends Object{
int a,b;

void change(int a, int b){
	this.a=a;
	this.b=b;
}
void disp(){
	System.out.println(this.a+"  "+this.b);
}
	public static void main(String[] args) {
		StateChanged d=new StateChanged();
		d.disp(); 
		StateChanged d1=new StateChanged();
		d.change(23, 34);
		d1.disp();
		d.disp();
		d1.change(78, 45);
		d.disp();

	}

}
