package tema09DataTypesAndVariablesMoreExcr;

import java.util.Scanner;

public class P02FromLeftToTheRight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= n; i++) {
			long l1 = Long.parseLong(scanner.next());
			long l2 = Long.parseLong(scanner.next());
			
			long winner = 0;
			
			if(l1 > l2) {
				winner = l1;
			} else {
				winner = l2;
			}
			
			
			
			
			long sum = 0;
			while(winner != 0) {
				long lastDigit = winner % 10;
				winner /= 10;
				sum += lastDigit;
				
			}
			System.out.println(Math.abs(sum));
			
			
		}
		
		
	}

}
