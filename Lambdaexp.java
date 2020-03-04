import java.util.*;
import java.util.stream.Stream;

@FunctionalInterface
interface MyFunctionalInterface
{
	public String sayHello(String x);
}
public class Lambdaexp {
public static void main(String args[])
{
List<String> list=new ArrayList<String>();
list.add("def");
list.add("fgf");
list.add("vvvv");
list.add("fff");
list.add("ssss");
 
	//list.forEach(
		//	(names) -> 
//
	//{System.out.println(names);}
	//);
	/*list
	.stream()
	.filter(s -> s.startsWith("f"))
	.map(String::toUpperCase)
	.sorted()
	.forEach(System.out::println);*/
Stream.of("a1","a2","a3")
.findFirst()
.ifPresent(System.out::println);
Arrays.stream(new int[] {1,2,3})
.map(n -> 2 * n + 1)
.average()
.ifPresent(System.out::println);

}
}
