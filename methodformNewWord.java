import java.util.*;
class use2
{
	static String methodformNewWord(String s,int l)
	{
		String c=null;
	int j;
	j=s.length()-l;
		if(s.length()<(2*l))
		{
			return"cannot be done";
			
		}
		else
		{
		c=s.substring(0,l)+s.substring(j)	;
		return c;
		}
	}
}
public class Main6 {
public static void main(String args[])
{
	String h=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string and no");
	String a=sc.next();
	int n=sc.nextInt();
	h=use2.methodformNewWord(a,n);
	System.out.println(h);
}
}
