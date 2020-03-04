
public class excep3 {
	static String s;
	public static void main(String args[])
	{
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException ae)
		{
			System.out.println(ae);
		}
		System.out.println("After exception");
	}
	}


