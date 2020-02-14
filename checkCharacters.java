import java.util.*;
class user1
{
	static int checkCharacters(String s)
	{
		int a=s.length();
		if(s.charAt(0)==s.charAt(a-1))
		{
			return 1;
		}
		else return -1;
	}
}
public class Main5 {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String n=sc.next();
		int b=user1.checkCharacters(n);
		if(b==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		}
	}


