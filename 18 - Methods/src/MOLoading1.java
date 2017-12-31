public class MOLoading1 {

	void add(int... a ){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum =sum+a[i];	
		}
		System.out.println(sum);
	}

/*	void add(int []a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum =sum+a[i];	
		}
		System.out.println(sum);
	}
//	
	void add(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	void add(int a, int b, int d){
		int c=a+b+d;
		System.out.println(c);
	}
	void add(int a, int b, int d, int e){
		int c=a+b+d+e;
		System.out.println(c);
	}
	void add(int a, int b, int d, int e, int j){
		int c=a+b+d+e+j;
		System.out.println(c);
	}*/
	
	public static void main(String... args) {
     int a[]={34,56,7778,9877};
		MOLoading1 t=new MOLoading1();
	  t.add(a);
	     t.add();
		t.add(34,56);
		t.add(34,56,7778);
		t.add(12, 2345, 898, 89);
     t.add(34,56,7778,65,65546,6456,6567,464,46474,64,64,6455,6645,643564,644,644,6464,54654);
			}

}
