package week5.day1.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

         List<Integer> lst=new ArrayList<Integer>();
         //add the data to list 
         lst.add(10); 
         lst.add(30); 
         lst.add(50); 
         lst.add(40); 
         lst.add(20); 
         lst.add(20); 
         lst.add(30); 
         //size 
         System.out.println(lst.size()); 
         //print my list 
         System.out.println(lst.add(40)); 
         System.out.println(lst); 
         //arrange the order
         Collections.sort(lst); 
         //to get some value 
         System.out.println(lst.get(2)); 
         //remove the value 
         System.out.println(lst.remove(4)); 
         //check the list contains 
         System.out.println(lst.contains(60)); 
         /* * lst.clear(); 
          * System.out.println(lst); 
          * System.out.println(lst.isEmpty()); */ 
         for (int i = 0; i < lst.size(); i++) { 
        	 System.out.println(lst.get(i));
         }

	}

}
