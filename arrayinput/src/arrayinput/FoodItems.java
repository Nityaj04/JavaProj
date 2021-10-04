package arrayinput;

import java.util.LinkedList;
import java.util.Collections;

public class FoodItems {

	public static void main(String[] args) {
		//Creating arraylist object
		LinkedList<String>foodItems = new LinkedList<String>();
		
		//Adding items to the arraylist
		foodItems.add("Jelly");
		foodItems.add("Chocolate");
		foodItems.add("Chips");
		foodItems.add("Burger");
		foodItems.add("Salad");
		
		//calling sort method from collections
		//Collections.sort(foodItems);
		
		//iterating through array elements and printing them
		for(String i : foodItems) {
			System.out.println(i);
		}

	}

}
