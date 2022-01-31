package tema10ForLoopUpr;

import java.util.Scanner;

public class P03OddEvenPosition {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		double n = Double.parseDouble(scanner.nextLine());
		
		double sum = 0;
		double minEven = Double.POSITIVE_INFINITY;
		double maxEven = Double.NEGATIVE_INFINITY;
		
		double minOdd = Double.POSITIVE_INFINITY;
		double maxOdd = Double.NEGATIVE_INFINITY;
		
		double evenSum = 0;

		
		double oddSum = 0;

		
		for(int i = 1; i <= n; i++) {
			
			double currentNum = Double.parseDouble(scanner.nextLine());
			sum += n;
			
			if(i % 2 == 0) {
				evenSum += currentNum;
				if(currentNum > maxEven) {
					maxEven = currentNum;
				} 
				if(currentNum < minEven) {
					minEven = currentNum;
				}
				
			} else {
				oddSum += currentNum;
				if(currentNum > maxOdd) {
					maxOdd = currentNum;
				} 
				if(currentNum < minOdd) {
					minOdd = currentNum;
				}
				
			}
		}
		
		
		if(oddSum == 0) {
			System.out.printf("OddSum=%.2f,%nOddMin=No,%nOddMax=No,%n", oddSum, minOdd, maxOdd);
			
		} else {
			System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%n", oddSum, minOdd, maxOdd);
		}
		
		if(evenSum == 0) {
			System.out.printf("EvenSum=%.2f,%nEvenMin=No,%nEvenMax=No%n",evenSum);
		} else {
			System.out.printf("EvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f%n",evenSum, minEven, maxEven);
		}

	}

}
