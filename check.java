abstract class animal
{
	abstract void eat();
}
abstract class Tiger extends animal
{
	void eat()
	{
	System.out.println("I am Tiger, I am a non vegeterian");
	}
}
class goat extends animal
{
	void eat()
	{
		System.out.println("Iam a goat,I am vegeterian");
	}
	
}
public class check {
	public static void main(String args[])
	{
		animal m;
		//m=new Tiger();
		//m.eat();
		
		m=new goat();
		m.eat();
	}
}
