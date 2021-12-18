package tema07ConditionalStatementsAdv;

import java.util.Scanner;

public class P13SkiTrip {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int days = Integer.parseInt(scanner.nextLine()) - 1;
		String place = scanner.nextLine();
		String evaluation = scanner.nextLine();
		
		if(place.equals("room for one person")) {
			double price = days * 18;
			if(evaluation.equals("positive")) {
				price = price + price*0.25;
				System.out.printf("%.2f", price);
			} else if(evaluation.equals("negative")) {
				price = price - price*0.10;
				System.out.printf("%.2f", price);
			}
		}
		if(place.equals("apartment") && days < 10) {
			double price = days * 25;
			double priceNeto = price - price*0.30;
			if(evaluation.equals("positive")) {
				priceNeto = priceNeto + priceNeto*0.25;
				System.out.printf("%.2f", priceNeto);
			} else if(evaluation.equals("negative")) {
				priceNeto = priceNeto - priceNeto*0.10;
				System.out.printf("%.2f", priceNeto);
			}
		} else if(place.equals("apartment") && days >= 10 && days <= 15) {
			double price = days * 25;
			double priceNeto = price - price*0.35;
			if(evaluation.equals("positive")) {
				priceNeto = priceNeto + priceNeto*0.25;
				System.out.printf("%.2f", priceNeto);
			} else if(evaluation.equals("negative")) {
				priceNeto = priceNeto - priceNeto*0.10;
				System.out.printf("%.2f", priceNeto);
			}
		} else if(place.equals("apartment") && days > 15) {
			double price = days * 25;
			double priceNeto = price - price*0.50;
			if(evaluation.equals("positive")) {
				priceNeto = priceNeto + priceNeto*0.25;
				System.out.printf("%.2f", priceNeto);
			} else if(evaluation.equals("negative")) {
				priceNeto = priceNeto - priceNeto*0.10;
				System.out.printf("%.2f", priceNeto);
			}
		} else if(place.equals("president apartment") && days < 10) {
				double price = days * 35;
				double priceNeto = price - price*0.10;
				if(evaluation.equals("positive")) {
					priceNeto = priceNeto + priceNeto*0.25;
					System.out.printf("%.2f", priceNeto);
				} else if(evaluation.equals("negative")) {
					priceNeto = priceNeto - priceNeto*0.10;
					System.out.printf("%.2f", priceNeto);
				}
			} else if(place.equals("president apartment") && days >= 10 && days <= 15) {
				double price = days * 35;
				double priceNeto = price - price*0.15;
				if(evaluation.equals("positive")) {
					priceNeto = priceNeto + priceNeto*0.25;
					System.out.printf("%.2f", priceNeto);
				} else if(evaluation.equals("negative")) {
					priceNeto = priceNeto - priceNeto*0.10;
					System.out.printf("%.2f", priceNeto);
				}
			} else if(place.equals("president apartment") && days > 15) {
				double price = days * 35;
				double priceNeto = price - price*0.20;
				if(evaluation.equals("positive")) {
					priceNeto = priceNeto + priceNeto*0.25;
					System.out.printf("%.2f", priceNeto);
				} else if(evaluation.equals("negative")) {
					priceNeto = priceNeto - priceNeto*0.10;
					System.out.printf("%.2f", priceNeto);
				}
		
			}

	}

}
