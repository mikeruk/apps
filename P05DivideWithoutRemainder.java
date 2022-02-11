package tema10ForLoopUpr;

import java.util.Scanner;

public class P05DivideWithoutRemainder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double n = Integer.parseInt(scanner.nextLine());
		
		int p1 = 0, p2 = 0, p3 = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int currentNumber = Integer.parseInt(scanner.nextLine());
			
			if(currentNumber % 2 == 0) {
				p1++;
			} 
			if(currentNumber % 3 == 0) {
				p2++;
			} 
			if(currentNumber % 4 == 0) {
				p3++;
			}
			
		}
		
		double percentP1 = p1 / n * 100.00;
		double percentP2 = p2 / n * 100.00;
		double percentP3 = p3 / n * 100.00;
		
		System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n", percentP1, percentP2, percentP3);
		
		
	}

}
