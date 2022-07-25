package tema16onlineExamTest;

import java.util.Scanner;

public class P02DeerOfSanta {

	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
		
		int days = Integer.parseInt(scanner.nextLine());
		int foodKg = Integer.parseInt(scanner.nextLine());
		
		double foodD1 = Double.parseDouble(scanner.nextLine());
		double foodD2 = Double.parseDouble(scanner.nextLine());
		double foodD3 = Double.parseDouble(scanner.nextLine());
		
		double foodNeeded = (foodD1 + foodD2 + foodD3) * days;
		
		if(foodKg >= foodNeeded) {
			System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - foodNeeded));
		} else {
			System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(foodKg - foodNeeded)));
			
		}
	}

}
