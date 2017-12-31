class MyThred extends Thread
{
	synchronized public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
	}
	
}
public class Main 
{

	public static void main(String[] args)
	{
		MyThred mt=new MyThred();
		
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		Thread t3=new Thread(mt);
		//t1.start();
		t1.run();
		t2.run();
		//t2.start();
		//t3.start();

	}

}
