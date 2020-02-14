import java.util.*;
class use
{
	static String getMiddleCharspresent(String b)
	{int d;
		d=b.length()/2;
		String j=b.substring(d-1,d+1);
		return j;
	}
}
public class main4 {
	public static void main(String args[])
	{
		String h=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string having even length");
		String s=sc.next();
		if(s.length()%2==0)
		{
		 h=use.getMiddleCharspresent(s);
		 System.out.println(h);
		}
		else
			System.out.println("Cannot take odd length string");
	}

}
