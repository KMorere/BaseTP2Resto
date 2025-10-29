package tp2;

import java.util.Scanner;

public class Restaurant {

	static Scanner scan = new Scanner(System.in);
	static String[] menuType = {"Entry", "Main course", "Accompaniment", "Drink", "Desert"} ; // String array of the menu name.
	static String[][] menu = { // 2 Dimensionnal array of the menu.
			{"None", "Salad", "Soup", "Quiche"},
			{"None", "Chicken", "Beef", "Fish", "Vegan"},
			{"None", "Rice", "Pasta", "Fries", "Vegetables"},
			{"None", "Water", "Soda", "Wine"},
			{"None", "Pie", "Chocolate Mousse", "Tiramisu"},
	};
	
	public static void main(String[] args) {
		System.out.println("Hello, how many orders do you want ?");
		if (!scan.hasNextInt())
			System.out.println("Please select a valid amount.");
		
		int amount = scan.nextInt();
		
		for (int i = 0; i < amount; i++) { // Do as many orders as requested beforehand.
			System.out.println("Starting order " + (i+1));
			startOrder();
		}
		
		System.out.println("Enjoy your meal !");
		
		scan.close();
	}
	
	// Initialize an order.
	private static void startOrder() {
		String[] order = new String[menu.length];
		for(int i = 0; i < menu.length; i++)
			order[i] = selectOrder(i);

		System.out.print("[");
		for(int i = 0; i < order.length; i++) {
			System.out.print(order[i]);
			if (i < order.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
		System.out.println("\n");
	}
	
	/**
	 * Selection of an element from the menu array.
	 * @param index Index parameter given from startOrder() for the selected order.
	 * @return Returns the element from the menu array.
	 */
	private static String selectOrder(int index) {
		for(int i = 0; i < menu[index].length; i++) {
			System.out.print("[" + i + " - " + menu[index][i] + "]");
		}
		System.out.println();
		
		System.out.println("Select " + menuType[index].toLowerCase() + " :");
		if (!scan.hasNextInt())
			return menu[index][0]; // Return None in the menu if the input is not valid.
		
		int input = scan.nextInt();
		
		if (input < 0 && input >= menu[index].length)
			return menu[index][0]; // Return None in the menu if the input is not valid.
		
		return menu[index][input];
	}
}
