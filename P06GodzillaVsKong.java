package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P06GodzillaVsKong {

	public static void main(String[] args) {
				
		
		Scanner scanner = new Scanner(System.in);
		
		double budget = Double.parseDouble(scanner.nextLine());
		double statisti =  Double.parseDouble(scanner.nextLine());
		double clothesPrice = Double.parseDouble(scanner.nextLine());
		
		double decorExpense =  budget*0.1;
		double clothesExpenses = clothesPrice * statisti;
		
		if(statisti > 150) {
			clothesExpenses *= 0.9;
		}
		
		
		if(decorExpense + clothesExpenses > budget) {
			double difference = Math.abs(decorExpense+clothesExpenses-budget);
			System.out.println("Not enough money!");
			System.out.printf("Wingard needs %.2f leva more.",difference);
		} else if (decorExpense + clothesExpenses <= budget) {
			double difference2 = budget - decorExpense - clothesExpenses;
			System.out.println("Action!");
			System.out.printf("Wingard starts filming with %.2f leva left.",difference2);
		}
	}

}
