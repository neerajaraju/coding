class AB
{
	int x=1000;
void	A()
	{
		System.out.println("A");
	}
}
class BA extends AB
{
	void B()
	{
		System.out.println("B");
	}
}
public class sam
{
	public static void main(String args[])
	{
		BA obj=new BA();
		obj.B();
		obj.A();
	}

}
