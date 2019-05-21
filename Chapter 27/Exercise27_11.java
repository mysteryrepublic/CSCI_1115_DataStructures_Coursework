/*
 * Shannon Vogelesang
 * 05-21-2019
 * 
 * Description: (setToList) Write the following method that returns an ArrayList from a set. Test class provided
 * 
 * Remember that a set will not conain duplicates
 * 
 * 
 * */
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Exercise27_11 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		set.add("Smith");
		set.add("Anderson");
		set.add("Lewis");
		set.add("Cook"); 
		set.add("Smith");

		ArrayList<String> list = setToList(set);
		System.out.println(list);
	}

	public static <E> ArrayList<E> setToList(Set<E> s) {
		 ArrayList<E> list = new ArrayList<E>();
		    list.addAll(s);
		    return list;
	}
}