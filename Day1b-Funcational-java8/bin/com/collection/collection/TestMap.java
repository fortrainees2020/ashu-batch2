package collection;

import java.util.Collection;
import java.util.HashMap;
 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String args[])
	  {
		        Map<Integer, String> map = new HashMap<>();
		        map.put(1, "Java");
		        map.put(2, "Python");
		        map.put(3, "C++");

		        // Retrieve all keys
		        Set<Integer> keys = map.keySet();
		        System.out.println("Keys: " + keys);

		        // Iterate keys to get values
		        for (Integer key : keys) {
		            System.out.println("Key: " + key + ", Value: " + map.get(key));
		        }
		   
		        // Retrieve all values
		        Collection<String> values = map.values();
		        System.out.println("Values: " + values);
		        
		        Set<Map.Entry<String,Integer>> st = map.entrySet();  //returns Set view
			    
			    for(Map.Entry<String,Integer> me1:st)
			    { System.out.print(me1.getKey()+":");
			      System.out.println(me1.getValue());
			    
			   
			    

		
		//HashMap
	    HashMap<String,Integer> hm = new HashMap<String,Integer>();
	    
	    hm.put("a",100); 
	    hm.put("z",600);
	    hm.put("c",300);
	    hm.put("b",400);
	    hm.put("d",4000);
	    
	    hm.put(null,4100);
	    hm.put(null,4100);
	    
	    hm.put(null,null);
	    hm.put(null,null);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println(" Display Data using treemap");
	    
	    
	    //TreeSet - Sort s the elements-----------------------------------
	    TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
	    tm.put("a",100);
	    tm.put("c",200);
	    tm.put("b",300);
	    tm.put("d",400);

	    Set<Map.Entry<String,Integer>> st1 = tm.entrySet();
	    for(Map.Entry<String,Integer> me:st1)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	    
	    //LinkedHaspMap
	    System.out.println(" Display Data using LinkedHashMap - Maintains insertion order with Linked list");
	    LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
	    lm.put("a",100);
	    lm.put("b1",200);
	    lm.put("c",300);
	    lm.put("d",400);

	    Set<Map.Entry<String,Integer>> s = lm.entrySet();
	    for(Map.Entry<String,Integer> me:s)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	  }
	  }}
