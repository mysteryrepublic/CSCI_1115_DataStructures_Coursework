/*
 * Shannon Vogelesang
 * 05-12-2019
 * 
 * Description: Store pairs of states and their capitals so that questions can be displayed randomly
 * */

import java.util.*;

public class Exercise08_37 {
	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);
		Map<String, String> data = getData();								// states and their capitals
		while(data.size() > 0) {
			System.out.print("Enter a state you want to know the capital of ");	// have user to enter a state
			String state = input.nextLine();		
			state = state.toLowerCase();
			//user inputs a states
			if (data.get(state) != null) {										// show the capital for the state if map isn't empty
				System.out.println("The capital of is " + data.get(state));	
			}
			else {																//else statement so code doesn't 'break'
				System.out.println("We do not have that in our system, please try a different state");
			}
		}
	}
	public static Map<String, String> getData() {							
		Map<String, String> map = new HashMap<>();
		String[][] stateCapitals = {
				{"Alabama", "Montgomery"}, 
				{"Alaska", "Juneau"}, 
				{"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, 
				{"California", "Sacramento"},
				{"Colorado", "Denver"}, 
				{"Connecticut", "Hartford"}, 
				{"Delaware", "Dover"}, 
				{"Florida", "Tallahassee"}, 
				{"Georgia", "Atlanta"},
				{"Hawaii", "Honolulu"}, 
				{"Idaho", "Boise"},
				{"Illinois", "Springfield"}, 
				{"Indiana", "Indianapolis"},
				{"Iowa Des", "Moines"}, 
				{"Kansas", "Topeka"}, 
				{"Kentucky","Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, 
				{"Maine", "Augusta"}, 
				{"Maryland", "Annapolis"}, 
				{"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, 
				{"Minnesota", "Saint Paul"}, 
				{"Mississippi", "Jackson"}, 
				{"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, 
				{"Nebraska", "Lincoln"}, 
				{"Nevada	", "Carson City"}, 
				{"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, 
				{"New Mexico", "Santa Fe"}, 
				{"New York", "Albany"}, 
				{"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"},
				{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, 
				{"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, 
				{"Rhode Island", "Providence"}, 
				{"South Carolina", "Columbia"}, 
				{"South Dakota", "Pierre"}, 
				{"Tennessee", "Nashville"}, 
				{"Texas", "Austin"}, 
				{"Utah", "Salt Lake City"}, 
				{"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, 
				{"Washington", "Olympia"}, 
				{"West Virginia", "Charleston"}, 
				{"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}};

		for (int s = 0; s < stateCapitals.length; s++) {
			map.put(stateCapitals[s][0].toLowerCase(), stateCapitals[s][1]);	//puts everything in the map since it is an array
		}

		return map;								//return statement because I need one and this is what it recommended
	}
}