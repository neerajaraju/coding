import java.util.*;
public class prob11 {
	
	
	public static void main(String args[])
	{
	int[] qw=new int[10];
	Scanner s=new Scanner(System.in);
	Set<Integer> h=new HashSet<Integer>();
	System.out.println("Enter 10 numbers");
	h.add( qw[0]=s.nextInt());
	h.add( qw[1]=s.nextInt());
	h.add( qw[2]=s.nextInt());
	h.add( qw[3]=s.nextInt());
	h.add(qw[4]=s.nextInt());
	h.add( qw[5]=s.nextInt());
	h.add(qw[6]=s.nextInt());
	h.add( qw[7]=s.nextInt());
	h.add( qw[8]=s.nextInt());
	h.add(qw[9]=s.nextInt());
	int[] ar=new int[10];
	for(int i=0;i<10;i++)
	{
	ar[i]=qw[i];
	}
	for(int i=0;i<10;i++)
	{
	System.out.println("index="+i + "   data=" + ar[i]);
	}
	}
}

