import java.util.Scanner;
class sch
 {
String name;
sch(String s)
{
name=s;

 }
String getName()
{
	
return name;
}
}
class hello
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no elements");
		 int d=sc.nextInt();
		 sch s1[]=new sch[d];
		 for(int i=0;i<s1.length;i++)
		 s1[i]=new sch(sc.next());
		
		 for(int i=0;i<s1.length;i++)
		 System.out.println("s1="+  s1[i].getName());
	 }
 } 
