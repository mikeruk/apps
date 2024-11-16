package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02SumDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		int sum = 0;
		while(true) {
			int lastDigit = n % 10;
			sum += lastDigit;
			int frontDigit = n / 10;
			n = frontDigit;
			
			if(n == 0) {
				break;
			}
		}
		System.out.println(sum);

	}

}
