package tema15MethodsExercise;

import java.util.Scanner;

public class P04PasswordValidator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String password = scanner.nextLine();
		
		boolean checkLength = checkLength(password);
		if(!checkLength) {
			System.out.println("Password must be between 6 and 10 characters");
		}
		
		boolean checkLettersAndDigits = checkLettersAndDigits(password);
		if(!checkLettersAndDigits) {
			System.out.println("Password must consist only of letters and digits");
		}
		
		boolean countDigits = countDigits(password);
		if(!countDigits) {
			System.out.println("Password must have at least 2 digits");
		}
		
		if(checkLength && checkLettersAndDigits && countDigits) {
			System.out.println("Password is valid");
		}

	}
	
	
	
	public static boolean countDigits(String password) {
		int count = 0;
		
		for(int i = 0; i <= password.length()-1; i++) {
			
			if(Character.isDigit(password.charAt(i))) {
				count++;
			}
		}
		
		return count >= 2;
		//this is same as:
		//if(count >= 2) {
		//	return true;
		//} else {
		//	return false;
		//}
	}
	
	public static boolean checkLettersAndDigits(String password) {
		
		for(int i = 0; i <= password.length()-1; i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkLength(String password) {
		
		if(password.length() >= 6 && password.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}

}
