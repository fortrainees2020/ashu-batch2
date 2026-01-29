package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println(listNumbers);
		
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		
		Set <Integer> s= new HashSet<>();
		System.out.println(uniqueNumbers); //unique member
	
		//Add an element
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		 
		if (names.add("Peter")) 
		{ System.out.println("Peter is added to the set");	}
		 
		if (!names.add("Tom")) 
		{System.out.println("Tom is already added to the set");}
		
		//Traverse all elements
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
		    String name = iterator.next();
		    System.out.println(name);
		}
		//Search an element
		if (names.contains("Mary")) {
		    System.out.println("Found Mary");
		}
		
		//Bulk Operations
		//a. subset
		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5)); 
		Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
		 
		if (s1.containsAll(s2)) {
		    System.out.println("s2 is a subset of s1");
		    
		 //b. union
		    s1.addAll(s2);
		    System.out.println("s1 after union: " + s1);
		    
		  //c. Intersection
		    s1.retainAll(s2);		    
		    System.out.println("s1 after intersection: " + s1);

		}
	}

}
