/*
 * Shannon Vogelesang
 * 05-13-2019
 * Description - Program prompts user to enter a string and displays the maximum consecutive increasingly ordered substring. 
 * 				Analyze the time complexity of your program
 * 
 * */

import java.util.*;

public class Assignment_22_1 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);				//Scanner
		LinkedList<Character> maximum = new LinkedList<>();	//linkedlist for saving maximum consecutive substring
		LinkedList<Character> list = new LinkedList<>();		//linkedlist for keeping track of substrings
		System.out.print("Please enter a string");			//asking for user input for a string
		String string = input.nextLine();					//getting the user input of a string

		for(int i=0; i < string.length(); i++) {				//when we reach the next substring clear list to start keeping the next one
			if(list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
				list.clear();
			}
			list.add(string.charAt(i));
			if(list.size() > maximum.size()) {			//saving the maximum substring to maximum and clearing the last max if new one has been reached
				maximum.clear();
				maximum.addAll(list);
			}
		}
		for(Character ch: maximum) {
			System.out.print(ch);
		}
		System.out.println();
	}


}
/*
 * since there are two for loops that are not nested together than the time complexity would be O(2n)
 * 
 * 
 * */
