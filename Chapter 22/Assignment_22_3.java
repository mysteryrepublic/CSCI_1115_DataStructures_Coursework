/*
 * Shannon Vogelesang
 * 05-13-2019
 * 
 * 
 * Description: (pattern matching) Write a program that prompts the user to enter two strings and tests whether 
 * the second string is a substring of the first string. Suppose the neighboring characters in the string are 
 * distinct. (Don't use the indexOf method in the String class.) 
 * 
 * 
 * */
import java.util.*;
public class Assignment_22_3 {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);	
		System.out.print("Please enter a string");			//asking for user input for a string
		String string = input.nextLine();					//getting the string from the user
		System.out.print("Please enter a second string");		//asking the user for a second string
		String string2 = input.nextLine();					//getting the second string from the user
		int count = 0;  										// Count matches
		int index = -1; 										// Stores index of string2 as a substring of string
		for (int i = 0; i < string.length(); i++) {			// tests whether the second string is a substring of the first string
			if (string.charAt(i) == string2.charAt(0) && count == 0) {
				index = i;
				count++;
			}
			else if (string.charAt(i) == string2.charAt(count)) {
				count++;
			}
			else {
				count = 0;
				index = -1;
			}
			if (count == string2.length()) {
				break;
			}
		}
		if (index > 1) {
			System.out.println("String2 matched String at index " + index);
		}
		else {
			System.out.println("String2 is not a substring of String");
		}

		
		/*For the time complexity since there is only 1 for loop that is not nested then my time complexity for the loop is O(n)
		 * 
		 * 
		 * */

	}
}