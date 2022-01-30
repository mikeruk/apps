package tema10ForLoopUpr;

import java.util.Scanner;

public class P02HalfSumElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int sum = 0;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			
			int currentNum = Integer.parseInt(scanner.nextLine());
			sum += currentNum;
			
			if(currentNum > maxValue) {
				maxValue = currentNum;
			}
		}
		
		int sumNeto = sum - maxValue;
		
		if(sumNeto == maxValue) {
			System.out.printf("Yes%nSum = %d", maxValue);
			
		} else {
			System.out.printf("No%nDiff = %d", Math.abs(sumNeto - maxValue));
		}
	}

}
