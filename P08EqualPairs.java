package tema10ForLoopUpr2;

import java.util.Scanner;

public class P08EqualPairs {

	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int oddSum = 0;
		int evenSum = 0;
		int diff = 0;
		
		boolean areTheSumsEqual = true;
		
		for(int i = 1; i <= n; i++) {
			
			int num1 = Integer.parseInt(scanner.nextLine());			
			int num2 = Integer.parseInt(scanner.nextLine());
			
			if(i == 1) {
				oddSum = num1 + num2;
			}
			
			
			if(i % 2 != 0 && i != 1) {
				if(num1 + num2 == evenSum) {
					areTheSumsEqual = true;
					oddSum = num1 + num2;
				} else if(num1 + num2 > evenSum && Math.abs(num1 + num2 - evenSum) > diff) {
					areTheSumsEqual = false;
					diff = Math.abs(num1 + num2 - evenSum); 
				} else if(num1 + num2 < evenSum && Math.abs(num1 + num2 - evenSum) > diff){
					areTheSumsEqual = false;
					diff = Math.abs(num1 + num2 - evenSum);
				}
				
			} else if(num1 + num2 == oddSum && i != 1) {
				areTheSumsEqual = true;
				evenSum = num1 + num2;
			} else if(num1 + num2 > oddSum && Math.abs(num1 + num2 - oddSum) > diff) {
				areTheSumsEqual = false;
				diff = Math.abs(num1 + num2 - oddSum); 
			} else if(num1 + num2 < oddSum && Math.abs(num1 + num2 - oddSum) > diff){
				areTheSumsEqual = false;
				diff = Math.abs(num1 + num2 - oddSum);
			}
		}
		if(areTheSumsEqual) {
			System.out.printf("Yes, value=%d", evenSum=oddSum);
		} else if(!areTheSumsEqual){
			System.out.printf("No, maxdiff=%d", diff);
		}
		

	}

}
