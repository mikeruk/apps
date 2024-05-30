package tema17onlineExam;

import java.util.Scanner;

public class P05ChristmasGifts {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String input = scanner.nextLine();
		
		int children = 0;
		int adults = 0;
		
		while(!input.equals("Christmas")) {
			
			int age = Integer.parseInt(input);
			if(age <= 16) {
				children++;
			} else {
				adults++;
			}
			
			input = scanner.nextLine();
		}
		int moneyToys = children * 5;
		int moneySweaters = adults * 15;
		System.out.printf("Number of adults: %d%n", adults);
		System.out.printf("Number of kids: %d%n", children);
		System.out.printf("Money for toys: %d%n", moneyToys);
		System.out.printf("Money for sweaters: %d%n", moneySweaters);
	}

}
