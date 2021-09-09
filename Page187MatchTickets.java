package bookExercises;

import java.util.Scanner;

public class Page187MatchTickets {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		double budget = Double.parseDouble(scanner.nextLine());
		String category = scanner.nextLine();
		int people = Integer.parseInt(scanner.nextLine());
		
		
		
		double VIP = 499.99;
		double Normal = 249.99;
		
		double transportExpense = 0;
		
		if(people >= 1 && people <= 4) {
			transportExpense = budget * 0.75;
		} else if(people >= 5 && people <= 9) {
			transportExpense = budget * 0.60;
		} else if(people >= 10 && people <= 24) {
			transportExpense = budget * 0.50;
		} else if(people >= 25 && people <= 49) {
			transportExpense = budget * 0.40;
		} else if(people >= 50) {
			transportExpense = budget * 0.25;
		}
		
		double restExpense = budget - transportExpense; 
		
		if(category.equals("VIP")) {
			double ticketExpense = people * VIP;
			if(restExpense >= ticketExpense) {
				double moneyLeft = restExpense - ticketExpense;
				System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
			} else if(restExpense < ticketExpense) {
				double moneyLeft = restExpense - ticketExpense;
				System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneyLeft));
			}
		} else if(category.equals("Normal")) {
			double ticketExpense = people * Normal;
			if(restExpense >= ticketExpense) {
				double moneyLeft = restExpense - ticketExpense;
				System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
			} else if(restExpense < ticketExpense) {
				double moneyLeft = restExpense - ticketExpense;
				System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneyLeft));
			}
		
		}
	}

}
