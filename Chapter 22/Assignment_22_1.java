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
		 String input = promptString();
	        String substring = getMaximum(input);
	        System.out.println(substring);
	    }
	    private static int compare(String string, String string2) {
	        return string.length() - string2.length();
	    }
	    private static String getMaximum(String input) {
	        String maxLength = "";
	        int index = 0;
	        for (int index2 = 1; index2 <= input.length(); index2++) {
	            if (index2 == input.length() || input.charAt(index2) <= input.charAt(index2 - 1)) {
	                String substring = input.substring(index, index2);
	                if (compare(maxLength, substring) < 0) {
	                    maxLength = substring;
	                }
	                index = index2;
	            }
	        }
	        return maxLength;
	    }
	    private static String promptString() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        return scanner.nextLine();
	    }
	}
/*
 * since there is one for loops than the time complexity would be O(n)
 * 
 * 
 * */
