import java.util.*;
class usercode
{
	static int methodvalidateNumber(String s)
	{
		if((s.charAt(3)=='-') && (s.charAt(7)=='-'))
	return 1;
		else
	return -1;
	}
}
public class Main1 {
public static void main(String args[])
{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
		str=sc.next();
	int b=usercode.methodvalidateNumber(str);
	if(b==1)
		System.out.println("Valid number format");
	else
		System.out.println("Invalid number format");
}
}
