import java.util.*;
class use4
{
	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		a.addAll(b);
		Collections.sort(a);
		ar3.add(a.get(2));
		ar3.add(a.get(6));
		ar3.add(a.get(8));
		return ar3;
	}
}
public class Main8 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> ar1=new ArrayList<Integer>();
	System.out.println("enter 5 numbers");
	ar1.add(sc.nextInt());
	ar1.add(sc.nextInt());
	ar1.add(sc.nextInt());
	ar1.add(sc.nextInt());
	ar1.add(sc.nextInt());
	
	ArrayList<Integer> ar2=new ArrayList<Integer>();
	System.out.println("enter 5 numbers");
	ar2.add(sc.nextInt());
	ar2.add(sc.nextInt());
	ar2.add(sc.nextInt());
	ar2.add(sc.nextInt());
	ar2.add(sc.nextInt());
	ArrayList<Integer> ar4=new ArrayList<Integer>();
	ar4=use4.sortMergedArrayList(ar1,ar2);
	System.out.println("The 2,6 and 8 index of arraylist after sorting is"+ar4);
}
}
