/* 
Shannon Vogelesang
Date:05-21-2019
Description: (Implement hashCode for string) Write a method that returns a hashcode for string using the approach described in 
			Section 27.3.2 with b value 31. Test class provided

Given: "4.5"      Expected: 51451
Given: "Hello"    Expected: 69609650
 */
public class Exercise27_09 { 
	public static void main(String[] args) {
		String s = "4.5";
		System.out.println(hashCodeForString(s));

		s = "Hello";
		System.out.println(hashCodeForString(s));
	}

	public static int hashCodeForString(String s) {
		// Add your code here
		int b = 31;
		int x = 0;
		for (int i = 0; i < s.length(); i++) {
			x = x * b + s.charAt(i);
		}
		return x;
	}
}