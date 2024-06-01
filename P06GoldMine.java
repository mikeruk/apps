package tema17onlineExam;

import java.util.Scanner;

public class P06GoldMine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int locations = Integer.parseInt(scanner.nextLine());
		double quantity = 0;
		double qTotal = 0;
		//double avg = 0;
		
		for(int i = 1; i <= locations; i++) {
			
			double avgQperDay = Double.parseDouble(scanner.nextLine());
			int numDays = Integer.parseInt(scanner.nextLine());
			
			for(int j = 1; j <= numDays; j++) {
				quantity = Double.parseDouble(scanner.nextLine());
				qTotal += quantity;
			}
			double avg = qTotal / numDays;
			if(avg >= avgQperDay) {
				
				System.out.printf("Good job! Average gold per day: %.2f.%n", avg);
			} else {
				System.out.printf("You need %.2f gold.%n", avgQperDay - avg);
			}
			qTotal = 0;
			
			
			
		}

	}

}
