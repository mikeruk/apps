package Exercises;

import java.util.Scanner;

public class P05BirthdayParty {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double totalRent = Double.parseDouble(scanner.nextLine());
		
		
		
		double cakePrice = totalRent * 20/100;
		double drinksPrice = cakePrice - (cakePrice * 45/100);
		double animator = totalRent * 1/3;
		double totalBudged = totalRent + cakePrice + drinksPrice + animator;
		System.out.printf("%.1f",totalBudged);
		
	}

}
