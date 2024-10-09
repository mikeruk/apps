package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P07VendingMachine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		double money = 0;
		String stop = "";
		double coins = 0;
		
		while(!input.equals("Start")) {
			coins = Double.parseDouble(input);
			
			if((coins == 0.1) || (coins == 0.2) || (coins == 0.5) ||( coins == 1) || (coins == 2)) {
				money += coins;	
			} else {
				System.out.printf("Cannot accept %.2f\n", coins);
			}
			input = scanner.nextLine();
		}
		
		input = scanner.nextLine();
		double price = 0;
		double totalPrice = 0;
		double diff = 0;
		while(!input.equals("End")) {
			
			if(input.equals("Nuts")) {
				price = 2.0;
			} else if(input.equals("Water")) {
				price = 0.7;
			} else if(input.equals("Crisps")) {
				price = 1.5;
			} else if(input.equals("Soda")) {
				price = 0.8;
			} else if(input.equals("Coke")) {
				price = 1.0;
			} else {
				System.out.println("Invalid product");
			}
			
			totalPrice += price;
			
			if(money < totalPrice) {
				System.out.println("Sorry, not enough money");
				totalPrice = 0;
			} else {
				System.out.printf("Purchased %s\n", input);
				diff = money - totalPrice;
			}
			input = scanner.nextLine();
			
			
		}
		
		System.out.printf("Change: %.2f", money);
		
	}

}
