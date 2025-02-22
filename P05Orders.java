package tema14MethodsLab;

import java.util.Scanner;

public class P05Orders {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String product = scanner.nextLine();
		int quantity = Integer.parseInt(scanner.nextLine());		
		double price = getPrice(product);
		
		calculateExpense(quantity, price);

	}

	private static double calculateExpense(int quantity, double price) {
		double expense = quantity * price;
		System.out.printf("%.2f", expense);
		//or System.out.printf("%.2f", calculateExpense(quantity, price));
		return expense;
	}

	private static double getPrice(String product) {
		double price = 0;
		if(product.equals("coffee")) {
			price = 1.50;
		}
		if(product.equals("water")) {
			price = 1.00;
		}
		if(product.equals("coke")) {
			price = 1.40;
		}
		if(product.equals("snacks")) {
			price = 2.00;
		}
		return price;
	}

}
