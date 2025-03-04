package tema14MethodsLab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sumEven = 0;
		int sumOdd = 0;
		int digit = 0;
		int newN = 0;
		
		multiplyEvensByOdds(n, sumOdd, digit, newN, sumEven);
		
		
		

	}
	
	public static void multiplyEvensByOdds(int n, int sumOdd, int digit, int newN, int sumEven) {
		int result = sumEven(n, sumEven, digit, newN) * sumOdd(n, sumOdd, digit, newN);
		System.out.println(result);
	}
	
	public static int sumOdd(int n, int sumOdd, int digit, int newN) {
		
		digit = n;
		while(digit != 0) {
			digit = n % 10;
			if(digit % 2 != 0) {
				sumOdd += digit;
			}
			newN = n / 10;
			digit = newN;
			n = newN;
		}
		return sumOdd;
	}
	
	public static int sumEven(int n, int sumEven, int digit, int newN) {
		digit = n;
		while(digit != 0) {
			digit = n % 10;
			if(digit % 2 == 0) {
				sumEven += digit;
			}
			newN = n / 10;
			digit = newN;
			n = newN;
		}
		return sumEven;
	}
	

}
