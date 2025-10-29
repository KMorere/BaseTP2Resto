package tp2;

import java.util.Scanner;

public class Restaurant {

	static Scanner scan = new Scanner(System.in);
	static String[][] menu = { // 2 Dimensionnal array of the menu.
			{"None", "Salad", "Soup", "Quiche"},
			{"None", "Chicken", "Beef", "Fish", "Vegan"},
			{"None", "Rice", "Pasta", "Fries", "Vegetables"},
			{"None", "Water", "Soda", "Wine"},
			{"None", "Pie", "Chocolate Mousse", "Tiramisu"},
	};
	
	public static void main(String[] args) {
		System.out.println("Hello, how many orders do you want ?");
		int amount = scan.nextInt();
		
		for (int i = 0; i < amount; i++) // Do as many orders as requested beforehand.
			startOrder();
		
		scan.close();
	}
	
	// Initialize an order.
	private static void startOrder() {
		String[] order = new String[menu.length];
		for(int i = 0; i < menu.length; i++)
			order[i] = selectOrder(i);

		System.out.print("[");
		for(String ord : order) {
			System.out.print(ord);
			System.out.print(" ");
		}
		System.out.print("]");
		System.out.println();
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
		
		System.out.println("Select a number :");
		int input = scan.nextInt();
		
		if (input < 0 && input >= menu[index].length)
			return menu[0][0]; // Return None in the menu if the input is not valid.
		
		return menu[index][input];
	}
}
