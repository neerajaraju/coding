import java.util.*;
public class HashMapDemo {
public static void main(String args[])
{
	HashMap hm=new HashMap();
	hm.put("OOP","object orieneted programming");
	hm.put("object","has state & behaviour");
	hm.put("class","defines state and behaviour shared by object");
			System.out.println(hm);
			Set s=hm.entrySet();
			System.out.println();
			System.out.println( "\n hashmap current size:"+hm.size());
			System.out.println("elements of hashmap");
			System.out.println();
			Iterator itr=s.iterator();
			while(itr.hasNext())
			{
				Object ob=itr.next();
				System.out.println(" "+ob);
			}
			
			
			
			TreeMap tm=new TreeMap();
			tm.put("xava is","oop");
			tm.put("java is","simple");
			tm.put("zava is","robust");
			tm.put("rava is","temporary");
			System.out.println();
			System.out.println(tm);
			System.out.println("\n elements of treemap by iteration");
			System.out.println();
			
			Set s1=tm.entrySet();
Iterator itr1=s1.iterator();
while(itr1.hasNext())
{
	Map.Entry me=(Map.Entry)itr1.next();
	//Object ob1=itr1.next();
	//System.out.println(""+ob1);
	
	System.out.println(me.getKey());
	System.out.println(me.getValue());
	
}
System.out.println("\n tremap currentsize:"+tm.size());
tm.putAll(hm);
System.out.println("\n putting amap into invoke map result will sort");
System.out.println("\n"+tm);
System.out.println(tm.remove("ram is")+": iam removed value");
System.out.println("\n treeemap current size:"+tm.size());
System.out.println("\n checking specific key/values status:"+tm.containsKey("java is") +tm.containsValue("temporary"));
System.out.println("retreive value by key:"+hm.get("oop"));
		
		 Collection c=tm.values();
		 System.out.println("/n values of my treemap:"+c);
		 System.out.println("\n keys of treemap:"+tm.keySet());
}
}
