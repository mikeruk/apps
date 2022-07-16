package tema14NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		
		int n1 = Integer.parseInt(scanner.nextLine());
		int n2 = Integer.parseInt(scanner.nextLine());

		
		
		
		for(int i = n1; i <= n2; i++) {
			int evenSum = 0;
			int oddSum = 0;
			int currentNum = i;
			
			for(int x = 6; x >= 1; x--) {
				
				int digit = currentNum % 10;
				currentNum /= 10;
				
				if(x % 2 == 0) {
					evenSum += digit;
				} else {
					oddSum += digit;
				}
				
			}
			
			if(evenSum == oddSum) {
				System.out.print(i + " ");
			}
			
		}
	}

}