import java.util.*;
class UserMainCode
{
	static int checksum(int a)
	{int d,sum=0;
		while(a>0) {
			d=a%10;
			if(d%2!=0)
				sum=sum+d;
			a=a/10;
		}
		System.out.println("Sum="+sum);
		if(sum%2==0)
			return -1;
		else
			return 1;
		
	}
}
public class Main {
	public static void main(String args[])
	{
		int b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();


b=UserMainCode.checksum(n);
if(b==1)
{
	System.out.println("Sum of odd digits is odd");
}
else if(b==-1)
{
	System.out.println("Sum of odd digits is even");
}
}
}
