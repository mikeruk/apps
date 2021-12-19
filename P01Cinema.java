package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P01Cinema {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		String projekcia = scanner.nextLine();
		int rows = Integer.parseInt(scanner.nextLine());
		int columns = Integer.parseInt(scanner.nextLine());
		
		double premieraPrice = 12;
		double normalPrice = 7.50;
		double discountPrice = 5;
		
		double seatsTotal = rows * columns;
		
		switch(projekcia) {
			case "Premiere":
				double income = seatsTotal * premieraPrice;
				System.out.printf("%.2f leva",income);
				break;
			case "Normal":
				income = seatsTotal * normalPrice;
				System.out.printf("%.2f leva",income);
				break;
			case "Discount":
				income = seatsTotal * discountPrice;
				System.out.printf("%.2f leva",income);
				break;
			default:
				break;
		}
	}

}
