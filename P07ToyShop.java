package Tema06Proverki;

import java.util.Scanner;

public class P07ToyShop {

	public static void main(String[] args) {
			
		
		Scanner scanner = new Scanner(System.in);
			
			double priceHoliday = Double.parseDouble(scanner.nextLine());
			double puzzleNum = Double.parseDouble(scanner.nextLine());
			double speakDollsNum = Double.parseDouble(scanner.nextLine());
			double teddyBearsNum = Double.parseDouble(scanner.nextLine());
			double minionsNUm = Double.parseDouble(scanner.nextLine());
			double trucksNum = Double.parseDouble(scanner.nextLine());
		
			double toysTotal = puzzleNum + speakDollsNum + teddyBearsNum + minionsNUm + trucksNum;
			
			double puzzlePrice = 2.60;
			double dollPrice = 3.00;
			double bearPrice = 4.10;
			double minionPrice = 8.20;
			double truckPrice = 2.00;
			
			double incomeTotal = puzzleNum * puzzlePrice + 
					speakDollsNum * dollPrice + 
					teddyBearsNum * bearPrice +
					minionsNUm * minionPrice +
					trucksNum * truckPrice;
			
			double incomeAfterDiscount;
			
			if(toysTotal >= 50) {
				incomeAfterDiscount = incomeTotal - incomeTotal * 0.25;
			} else {
				incomeAfterDiscount = incomeTotal;
			}
			double rentAomunt = incomeAfterDiscount * 0.1;
			double incomeNeto = incomeAfterDiscount - rentAomunt;
			
			double moneyLeft;
			if(incomeNeto >= priceHoliday) {
				moneyLeft =  incomeNeto - priceHoliday;
				System.out.printf("Yes! %.2f lv left.", moneyLeft);
			} else {
				moneyLeft =  Math.abs(incomeNeto - priceHoliday); //use .abs value because it will be negative value
				System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
			}

	}

}