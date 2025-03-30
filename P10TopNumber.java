package tema15MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int m = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		checkAllNumbers(m, sum);

	}
	
	public static void checkAllNumbers(int m, int sum) {
		for(int n = 1; n <= m; n++) {
			if(giveResult(n, sum)) {
				System.out.println(n);
			}
		}
		
	}
	
	public static boolean giveResult(int n, int sum) {
		boolean firstCheck = false;
		boolean secondCheck = false;
		
		if(checkForOddDigit(n)) {
			firstCheck = true;
		}
		if(checkIfDivisible(n, sum)) {
			secondCheck =  true;
		}
		
		if(firstCheck && secondCheck) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean checkForOddDigit(int n) {
		
		while(n > 0) {
			
			if((n % 10)%2 != 0) {
				return true;
			} else {
				n /= 10;
			}
		}
		return false;
	}
	
	public static boolean checkIfDivisible(int n, int sum) {
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		if(sum % 8 == 0) {
			return true;
		}
		return false;
	}

}
