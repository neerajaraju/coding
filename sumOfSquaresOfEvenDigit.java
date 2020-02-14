import java.util.*;
class user
{
	static int sumOfSquaresOfEvenDigits(int a)
	{ int d,sum=0;
		while(a>0)
		{
			d=a%10;
			if(d%2==0)
				sum=sum+(d*d);
			a=a/10;
		}
		return sum;
	}
}
public class Main3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int b=user.sumOfSquaresOfEvenDigits(n);
	System.out.println("The sum of squares of even digits is"+b);
}
}
