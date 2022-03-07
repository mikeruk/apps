package tema10ForLoopUpr2;

import java.util.Scanner;

public class P05GameOfIntervals {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		double n = Double.parseDouble(scanner.nextLine());

		
		
		double points = 0;
		double pointsSoFar = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		
		for(int i = 1; i <= n; i++) {
			
			double num = Double.parseDouble(scanner.nextLine());
			
			if(num >= 0 && num <= 9) {
				pointsSoFar = num * 20/100;
				points += pointsSoFar;
				count1++;
			} else if(num >= 10 && num <= 19) {
				pointsSoFar = num * 30/100;
				points += pointsSoFar;
				count2++;
			} else if(num >= 20 && num <= 29) {
				pointsSoFar = num * 40/100;
				points += pointsSoFar;
				count3++;
			} else if(num >= 30 && num <= 39) {
				pointsSoFar = 50;
				points += pointsSoFar;
				count4++;
			} else if(num >= 40 && num <= 50) {
				pointsSoFar = 100;
				points += pointsSoFar;
				count5++;
			} else if(num < 0 || num > 50) {
				points /= 2;
				count6++;
			}
		}
		
		double percentCount1 = 0;
		double percentCount2 = 0;
		double percentCount3 = 0;
		double percentCount4 = 0;
		double percentCount5 = 0;
		double percentCount6 = 0;
		
		percentCount1 = count1 / n * 100;
		percentCount2 = count2 / n * 100;
		percentCount3 = count3 / n * 100;
		percentCount4 = count4 / n * 100;
		percentCount5 = count5 / n * 100;
		percentCount6 = count6 / n * 100;
		
		System.out.printf("%.2f%n", points);
		System.out.printf("From 0 to 9: %.2f%%%n", percentCount1);
		System.out.printf("From 10 to 19: %.2f%%%n", percentCount2);
		System.out.printf("From 20 to 29: %.2f%%%n", percentCount3);
		System.out.printf("From 30 to 39: %.2f%%%n", percentCount4);
		System.out.printf("From 40 to 50: %.2f%%%n", percentCount5);
		System.out.printf("Invalid numbers: %.2f%%%n", percentCount6);
		

	}

}
