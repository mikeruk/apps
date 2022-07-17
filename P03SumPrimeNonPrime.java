package tema14NestedLoopsExercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int composite = 0;
		int prime = 0;
		boolean isPrime = true;
		
		while(!input.equals("stop")) {
			isPrime = true;
			int number = Integer.parseInt(input);
			
			if(number < 0) {
				System.out.println("Number is negative.");
				input = scanner.nextLine();
				continue;
			}
			
			for(int i = 2; i < number; i++) {
				if(number % i == 0) {
					composite += number;
					isPrime = false;
					break;
				} 
			}
			
			if(isPrime) {
				prime += number;
			}
			input = scanner.nextLine();
			
		}
		System.out.println("Sum of all prime numbers is: " + prime);
		System.out.println("Sum of all non prime numbers is: " + composite);

	}

}
