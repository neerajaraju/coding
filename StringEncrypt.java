import java.util.*;
class use7
{
	static String encrypt(String s)
	{int	j=96;
		StringBuilder b=null;
		b=new StringBuilder(s);
		for(int i=0;i<s.length();i=i+2)
		{
			int a=s.charAt(i);
			if(a==122)
			{
			j++;
			b.deleteCharAt(i);
			b.insert(i,(char)j);
			}
			else
			{
			a++;
			b.deleteCharAt(i);
			b.insert(i,(char)a);
		}
		}
		System.out.println(b);
		return  b.toString();
	}
}
public class Main11 {
public static void main(String args[])throws Exception
{
	String h=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=sc.next();
	h=use7.encrypt(a);
	System.out.println(h);
}
}
