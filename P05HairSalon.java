package tema16onlineExamTest;

import java.util.Scanner;

public class P05HairSalon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int target = Integer.parseInt(scanner.nextLine());

		String input = scanner.nextLine();
		
		double income = 0;
		double incomeTotal = 0;
		
		while(!input.equals("closed")) {
			
			
			if(input.equals("haircut")) {
				String haircut = scanner.nextLine();
				if(haircut.equals("mens")) {
					income = 15;
					incomeTotal += income;
					
				} else if(haircut.equals("ladies")) {
					income = 20;
					incomeTotal += income;
				} else if(haircut.equals("kids")) {
					income = 10;
					incomeTotal += income;
				}
				
			} else if(input.equals("color")){
				String color = scanner.nextLine();
				if(color.equals("touch up")) {
					income = 20;
					incomeTotal += income;
				} else if(color.equals("full color")) {
					income = 30;
					incomeTotal += income;
				} 
				
			}
			
			if(incomeTotal >= target) {
				break;
			}
			
			input = scanner.nextLine();
			
			
		}
		
		if(incomeTotal >= target) {
			System.out.println("You have reached your target for the day!");
			
		} else {
			System.out.printf("Target not reached! You need %.0flv. more.%n", Math.abs(incomeTotal - target));
		}
		
		System.out.printf("Earned money: %.0flv.", incomeTotal);
		

	}

}
