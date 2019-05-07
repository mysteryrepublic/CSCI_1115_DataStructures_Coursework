/*
Author: Shannon Vogelesang
Date: 05/07/2019

Description: Method that returns a new ArrayList while the new list contains the elements from the 
original list, without duplicates
 */
import java.util.ArrayList;

public class Exercise19_03 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);
    
    ArrayList<Integer> newList = removeDuplicates(list);
  
    
    System.out.print(newList);
  }

  private static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
	
	  for(int i = 0; i < list.size(); i++) { 
		  for(int j= i+1; j < list.size(); j++) {
			if(list.get(i) == list.get(j)) {
				list.remove(i);
				}
		  }
	  }
	
	  return list;
  }

}