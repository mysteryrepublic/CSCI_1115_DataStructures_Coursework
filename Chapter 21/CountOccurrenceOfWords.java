/*
 * Shannon Vogelesang
 * 05-11-2019
 * 
 * Description: display the words in ascending order of occurrence counts
 * 
 * */


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
				"Have a good visit. Have fun!";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();

			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}

		// Display key and value for each entry
		//map.forEach((k, v) -> System.out.println(k + "\t" + v));
		ArrayList<OccurrenceOfWords> list = new ArrayList<>();
		map.forEach((k,v) -> list.add(new OccurrenceOfWords(k,v)));
		Collections.sort(list);
		  list.forEach((word) -> System.out.println(word.word + "\t" + word.count));	
		  }
	private static class OccurrenceOfWords implements Comparable<OccurrenceOfWords>{
		int count;
		String word;

		public OccurrenceOfWords(String word, int count) {
			this.word = word;
			this.count = count;
		}

		@Override
		public int compareTo(OccurrenceOfWords o) {
			if (o.count > count)
				return -1;
			else if (o.count < count)
				return 1;
			else
				return 0;
		}
	}


}