package tema16onlineExamTest;

import java.util.Scanner;

public class P04Workout {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		int day = 0;
		double numDays = Integer.parseInt(scanner.nextLine());
		double currentKm = Double.parseDouble(scanner.nextLine());
		
		if(currentKm >=  1000 ) {
			System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(currentKm - 1000));
		}
		
		double kmSum = currentKm;
	
		while(kmSum < 1000) {
			day++;
			if(day > numDays) {
				break;
			}
			double percIncrease = Integer.parseInt(scanner.nextLine()) / 100.00;
			currentKm = currentKm + currentKm * percIncrease;
			kmSum = kmSum + currentKm;
		}
		
		
		if(kmSum >=  1000 ) {
			System.out.printf("You've done a great job running %.2f more kilometers!", Math.ceil(kmSum - 1000));
			
		} else {
			System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000.00 - kmSum));
		}
	}
}

