package tema14MethodsLab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		checkForPositive(n);
		checkForNegative(n);
		checkForZero(n);

	}

	private static void checkForZero(int n) {
		if(n == 0) {
			System.out.printf("The number %d is zero.", n);
		}
		
	}

	public static void checkForNegative(int n) {
		
		if(n < 0) {
			System.out.printf("The number %d is negative.", n);
		}
	}

	public static void checkForPositive(int n) {
		
		if(n > 0) {
			System.out.printf("The number %d is positive.", n);
		}
		
	}

}
