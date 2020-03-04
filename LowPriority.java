
public class LowPriority {
public static void main(String args[])
{
	MyThread3 t1=new MyThread3(1);
	MyThread3 t2=new MyThread3(2);
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.NORM_PRIORITY);
}
}
class MyThread3 extends Thread
{
	int id; 
	MyThread3(int id)
	{
		this.id=id;
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("My id is"+id);
	}
}
