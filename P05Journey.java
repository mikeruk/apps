package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P05Journey {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double budget = Double.parseDouble(scanner.nextLine());
		String season = scanner.nextLine();
		String destination  = "";
		
		switch(season) {
			case "summer":
				if(budget <= 100) {
					double expense = budget * 0.30;
					destination = "Bulgaria";
					System.out.printf("Somewhere in %s\nCamp - %.2f", destination, expense);
				} else if(budget <= 1000) {
					double expense = budget * 0.40;
					destination = "Balkans";
					System.out.printf("Somewhere in %s\nCamp - %.2f", destination, expense);
				} else if(budget > 1000) {
					double expense = budget * 0.90;
					destination = "Europe";
					System.out.printf("Somewhere in %s\nHotel - %.2f", destination, expense);
				}
				break;
			case "winter":
				if(budget <= 100) {
					double expense = budget * 0.70;
					destination = "Bulgaria";
					System.out.printf("Somewhere in %s\nHotel - %.2f", destination, expense);
				} else if(budget <= 1000) {
					double expense = budget * 0.80;
					destination = "Balkans";
					System.out.printf("Somewhere in %s\nHotel - %.2f", destination, expense);
				} else if(budget > 1000) {
					double expense = budget * 0.90;
					destination = "Europe";
					System.out.printf("Somewhere in %s\nHotel - %.2f", destination, expense);
				}
				break;
			default:
				break;
		}
	}

}
