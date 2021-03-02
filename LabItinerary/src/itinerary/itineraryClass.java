package itinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class itineraryClass {

	public static void main(String[] args) {

		ArrayList<String> itinerary = new ArrayList<String>();

		boolean userInputting = true;

		Scanner userInput = new Scanner(System.in);

		while (userInputting) {
			System.out.print("Destination: ");
			String userString = userInput.nextLine();
			userInputting = !(userString.equalsIgnoreCase("done"));

			if (userInputting) {
				itinerary.add(userString);
			}
		}
		
		userInput.close();
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<itinerary.size();i++){
			String next = itinerary.get(i).toUpperCase();
			sb.append(next);
			if(i!=itinerary.size()-1){
				sb.append(" to ");
			}
		}
		
		String travelRoute = sb.toString();
		System.out.println("Travel Route: ");
		System.out.println(travelRoute);

	}
}
