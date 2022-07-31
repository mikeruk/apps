package tema16onlineExamTest;

import java.util.Scanner;

public class P03ExcursionCalculator {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		int people = Integer.parseInt(scanner.nextLine());
		String season = scanner.nextLine();
		
		double expense = 0;
		
		switch(season) {
			case "spring":
				if(people <= 5) {
					expense = people * 50.00;
				} else {
					expense = people * 48.00;
				}
				break;
				
			case "summer":
				if(people <= 5) {
					expense = people * 48.50 * 0.85;
				} else {
					expense = people * 45.00 * 0.85;
				}
				break;
			case "autumn":
				if(people <= 5) {
					expense = people * 60.00;
				} else {
					expense = people * 49.50;
				}
				break;
			case "winter":
				if(people <= 5) {
					expense = people * 86.00 * 1.08;
				} else {
					expense = people * 85.00 * 1.08;
				}
				break;
			default:
				break;
		}
			System.out.printf("%.2f leva.", expense);
		
		
		
		

	}

}
