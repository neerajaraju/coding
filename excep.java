
public class excep {
	public static void main(String args[])
	{
		int num=10,a=0;
		try {
		System.out.println(num/a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("After exception");
	}

}
