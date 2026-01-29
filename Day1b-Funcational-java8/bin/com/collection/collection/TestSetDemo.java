package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetDemo {
	public static void main(String []args)
	{
		Set< String> nameSet = new HashSet<>();
		nameSet.add("James");
		nameSet.add("amartin");
		
		for( String name : nameSet)
		{
			System.out.println(name);
		}	
		
		
		Set <String> ts = new TreeSet<String>();
		ts.add("America");
		ts.add("London");
		ts.add("India");
		System.out.println(ts);
	}
}
