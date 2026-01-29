package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		//1. Ways to declare an arrayList
		ArrayList<String> list1 = new ArrayList<String>();            //First Method //  //'list' can hold 10 elements (Default Initial Capacity)
		//ArrayList<Integer> list2 = new ArrayList<Integer>(20);         //Second Method
        //ArrayList<Integer> list3 = new ArrayList<Integer>(list2);  //Third Method
	   // ArrayList<Integer > arr = new ArrayList<>();
       //List<String> list1 = new ArrayList<>(); //Interface
     
     //  List <String> l = new List(); //Interface cannot be instantiated.
      // Add elements
        list1.add("ONE");
        list1.add("TWO");
        list1.add("THREE");
        list1.add("FOUR");
        list1.add(null);
        list1.add("ONE");
      //  list1.add(3);
    
    
        
//Approach1:    
        System.out.println(" Traverse element using for loop");
        for ( int i =0;i<5;i++)
        {
        	System.out.println(list1.get(i));
        }
  //  ArrayList<String> list2 = new ArrayList<String>(list1); 
    //print the list2
        
        
         		
  
        //Approach2:
        System.out.println(" Traverse element using for each loop");
        for( String num: list1) {
        	System.out.println(num);
        }
        
        
        //Approach3:
        System.out.println(" Traverse element using iterator");
        Iterator<String> iterat = list1.iterator();  //IN forward direction
        
        while(iterat.hasNext())
        { 
        	System.out.println(" The element is :"+iterat.next()); 
        }
       
        
        //Approach4: To reverse the collection elements
        System.out.println(" Traverse element using Listiterator");
        ListIterator<String> literat = list1.listIterator(); //Moves backward and forward
        
        while(literat.hasNext())
        { System.out.println(" The Next element is  :"+literat.next()); }
        
        
        while(literat.hasPrevious())
        { System.out.println(" The Previous element is  :"+literat.previous()); }
        
       
        
        
        
        
        
        
        
        
        
        
        
    
      //find the number of elements present in an ArrayList  
        System.out.println(list1.size());  //5
        list1.ensureCapacity(20);
        
       //Check empty
        System.out.println(list1.isEmpty());   //True/false
        
        //Check availability
        System.out.println(list1.contains("TWO"));  

        //check position
        System.out.println(list1.indexOf("ONE")); 
        System.out.println(list1.lastIndexOf("ONE"));  
        
        //Get element in particular position
        System.out.println(list1.get(3));    
        
        //Remove an element
        list1.remove(2);
        System.out.println(list1);
        
      
        
        //Join two arraylist
        ArrayList<String> list4 = new ArrayList<String>();     
        list4.add("555");
        list4.add("666");
        list4.add("777");
        list4.add("888");
        list4.addAll(list1);
        list1.addAll(2, list4);
        System.out.println("Watch: "+list1); //Inserting all elements of list4 at index 2 of list1
        //System.out.println(list4);
        
        
        //Traverse Array using Iterator
        System.out.println(" Display element using Iterator");
        Iterator<String> it = list4.iterator();    //Declaring Iterator
        while(it.hasNext())
        {  
          System.out.print("\nElement of Arraylist: "+ it.next()+" ");
        }
        
        //Display elements using ListIterator
        System.out.println(" \nDisplay element using List Iterator");
        ListIterator<String> litr = list4.listIterator();
        while(litr.hasNext())   //In forward direction
        {
          System.out.print("\nNext element: "+litr.next()+" ");
        }
        System.out.println(" \nDisplay element in reverse order  using List Iterator");
        while(litr.hasPrevious())   //In backward direction
        {
          System.out.print("\nPrevious element :"+litr.previous()+" ");
        }
	}

}
