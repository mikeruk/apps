package Exercises;

import java.util.Scanner;

public class P06CharityCampaign {

	public static void main(String[] args) {
		
		

						
		Scanner scanner = new Scanner(System.in);
		
		int campaignDays =  Integer.parseInt(scanner.nextLine());
		int numBakers = Integer.parseInt(scanner.nextLine());
		int numCakes = Integer.parseInt(scanner.nextLine());
		int numWaffles = Integer.parseInt(scanner.nextLine());
		int numPancakes = Integer.parseInt(scanner.nextLine());
		
		
		
		double cakePrice = 45;
		double wafflePrice = 5.8;
		double pancake = 3.20;
		
		double sumCakes = numCakes * cakePrice;
		double sumWaffles = numWaffles * wafflePrice;
		double sumPancackes = numPancakes * pancake;
		
		double amountPerDay = (sumCakes + sumWaffles + sumPancackes)*numBakers;
		double totalAmount = amountPerDay * campaignDays;
		double netAmount = totalAmount - (totalAmount * 1/8);
		
		System.out.printf("%.2f",netAmount);
	}

}
