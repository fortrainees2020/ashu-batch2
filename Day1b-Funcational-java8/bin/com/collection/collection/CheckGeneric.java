package collection;

import java.util.ArrayList;
import java.util.List;

public class CheckGeneric {
	public static void main(String [] args)
	{
		
		List<String> list1 = new ArrayList<>();  
		list1.add("HI");
		
		list1.add("35");
		
		list1.add("Hello");
		list1.add("44.5");
		
        //Approach2:
        System.out.println(" Traverse element using for each loop");
        for(String  num: list1) {
        	System.out.println(num);
        }
		
		
	}

}
