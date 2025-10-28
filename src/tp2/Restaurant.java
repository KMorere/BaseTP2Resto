package tp2;

import java.util.Scanner;

public class Restaurant {

	static Scanner scan = new Scanner(System.in);
	static String[][] menu = {
			{"None", "Salad", "Soup", "Quiche"},
			{"None", "Chicken", "Beef", "Fish", "Vegan"},
			{"None", "Rice", "Pasta", "Fries", "Vegetables"},
			{"None", "Water", "Soda", "Wine"}
	};
	
	public static void main(String[] args) {
		startOrder();
		
		scan.close();
	}
	
	private static void startOrder() {
		System.out.println("Hello, how many orders do you want ?");
		int amount = scan.nextInt();
		
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
	
	private static String selectOrder(int index) {
		for(int i = 0; i < menu[index].length; i++) {
			System.out.print("[" + i + " - " + menu[index][i] + "]");
		}
		System.out.println();
		
		System.out.println("Select a number :");
		int input = scan.nextInt();
		
		return menu[index][input];
	}
}
