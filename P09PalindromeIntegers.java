package tema15MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String reversed = "";
		
		loop(input,scanner,reversed);
		
	}
	
	public static void loop(String input, Scanner scanner, String reversed ) {
		while(!input.equals("END")) {
			reversIt(input, reversed);
			checkIfpalindrome(input, reversed);
			input = scanner.nextLine();
		}
		
	}
	
	
	public static void checkIfpalindrome(String input, String reversed) {
		if(input.equals(reversIt(input,reversed))) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
	}
	
	
	
	public static String reversIt(String input, String reversed) {
		
		for(int i = input.length()-1; i >= 0; i--) {
			char letter = input.charAt(i);
			reversed += letter;
		}
		return reversed;
	}

}
