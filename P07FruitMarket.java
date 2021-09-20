package Exercises;

import java.util.Scanner;

public class P07FruitMarket {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		double strawberryPrice = Double.parseDouble(scanner.nextLine());
		double kgBanana = Double.parseDouble(scanner.nextLine());
		double kgOranges = Double.parseDouble(scanner.nextLine());
		double kgBerries = Double.parseDouble(scanner.nextLine());
		double kgStrawberries = Double.parseDouble(scanner.nextLine());

		
		double berriesPrice = strawberryPrice - (strawberryPrice * 50/100);
		double orangesPrice = berriesPrice - (berriesPrice * 40/100);
		double bananasPrice = berriesPrice - (berriesPrice * 80/100);
		
		double berriesExpense = berriesPrice * kgBerries;
		double orangesExpense = orangesPrice * kgOranges;
		double bananasExpense = bananasPrice * kgBanana;
		double strawberriesExpense = strawberryPrice * kgStrawberries;
		
		double totalFruitExpense = berriesExpense + orangesExpense + bananasExpense + strawberriesExpense;
		
		System.out.printf("%.2f", totalFruitExpense);
	}

}
