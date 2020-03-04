import java.util.Scanner;
abstract class course
{
	abstract void name();
	abstract void fee();
	abstract void delivery();
	abstract void time();
	abstract void register();
	abstract void deregister();
}
class course1 extends course
{ int register1;
	public void name()
	{
		System.out.println("Java");
	}
	public void fee()
	{
		System.out.println("course fee = 1000");
	}
	public void delivery()
	{
		System.out.println("Classroom delivered");
	}
	public void time()
	{
		System.out.println("FUll time");
	}
	public void register()
	{ register1++;
	System.out.println("Registered for java");

	}
	public void deregister()
	{
		register1--;
	}
	
		
	
}
class course2 extends course
{ int register2;
	public void name()
	{
		System.out.println("CSS");
	}
	public void fee()
	{
		System.out.println("course fee = 500");
	}
	public void delivery()
	{
		System.out.println("Online delivered");
	}
	public void time()
	{
		System.out.println("Part time");
	}
	public void register()
	{ register2++;
		
	}
	public void deregister()
	{
		register2--;
	}
}
class course3 extends course
{ int register3;
	public void name()
	{
		System.out.println("Html");
	}
	public void fee()
	{
		System.out.println("course fee = 2000");
	}
	public void delivery()
	{
		System.out.println("Classroom delivered");
	}
	public void time()
	{
		System.out.println("FUll time");
	}
	public void register()
	{ register3++;
		
	}
	public void deregister()
	{
		register3--;
	}
}
public class employee {
	public static void main(String args[])
	{
		int n;
		course c;
		System.out.println("Enter the no of choice you want to choose ");
		System.out.println("1. To register for a course");
		System.out.println("2. To deregister for a course");
		System.out.println("3. To list the courses offered");
		System.out.println("4. To list the employees registered for a specific course.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		 System.out.println("Enter the required course");
		String h=sc.next();
		if(h=="Java")
		{
			n=1;
		}
		else if(h=="CSS")
		{
			n=2;
		}	
		else {
			n=3;
		}
		switch(a)
		{
		case 1:
		{if(n==1)
		{
			c=new course1();
			c.register();
		}
		else if(n==2)
		{
			c=new course2();
			c.register();
		}	
		else if(n==3) {
			c=new course3();
			c.register();
		}
			
		}
		case 2:
		{if(n==1)
		{
			c=new course1();
			c.deregister();
		}
		else if(n==2)
		{
			c=new course2();
			c.deregister();
		}	
		else if(n==3) {
			c=new course3();
			c.deregister();
		}
			
		}
		case 3:
		/*{
			System.out.println("Couse1:java ");
			System.out.println("Couse2:CSS ");
			System.out.println("Couse3:html ");
		}*/
		case4:
		{
			
		}
		}
		}
	}


