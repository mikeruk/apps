package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P03NewHouse {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		String flower = scanner.nextLine();
		int numFlowers = Integer.parseInt(scanner.nextLine());
		int budget = Integer.parseInt(scanner.nextLine());
		
		double priceRoses = 5;
		double priceDahlias = 3.80;
		double priceTulips = 2.80;
		double priceNarcissus = 3;
		double priceGladiolus = 2.50;
		
		double discount = 0;
		
		double totalExpense = 0;
		
		if(flower.equals("Roses")) {
			if(numFlowers > 80) {
				discount = priceRoses * 0.1;
				priceRoses = priceRoses - discount;
				totalExpense = priceRoses * numFlowers;
			} else {
				totalExpense = numFlowers * priceRoses;
			}
		} else if(flower.equals("Dahlias")){
			if(numFlowers > 90) {
				discount = priceDahlias * 0.15;
				priceDahlias = priceDahlias - discount;
				totalExpense = numFlowers * priceDahlias;
			} else {
				totalExpense = numFlowers * priceDahlias;
			}
		} else if(flower.equals("Tulips")){
			if(numFlowers > 80) {
				discount = priceTulips * 0.15;
				priceTulips = priceTulips - discount;
				totalExpense = numFlowers * priceTulips;
			} else {
				totalExpense = numFlowers * priceTulips;
			}
		} else if(flower.equals("Narcissus")){
			if(numFlowers < 120) {
				priceNarcissus  += priceNarcissus * 0.15;
				totalExpense = numFlowers * priceNarcissus;
			} else {
				totalExpense = numFlowers * priceNarcissus;
			}
		} else if(flower.equals("Gladiolus")){
			if(numFlowers < 80) {
				priceGladiolus  += priceGladiolus * 0.20;
				totalExpense = numFlowers * priceGladiolus;
			} else {
				totalExpense = numFlowers * priceGladiolus;
			}
		}
		
		if(totalExpense <= budget) {
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numFlowers, flower, Math.abs(totalExpense - budget));
		} else {
			System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(totalExpense - budget));
		}
	}

}
