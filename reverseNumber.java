import java.util.*;
class use3
{
	static int reverseNumber(int a)
	{int r=0,k=0;
		while(a>0)
		{
		r=a%10;
		k=(k*10)+r;
		a=a/10;
		}
		return k;
	}
}
public class Main7 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	int n=sc.nextInt();
	int h=use3.reverseNumber(n);
	System.out.println("The reversed no is"+h);
}
}
