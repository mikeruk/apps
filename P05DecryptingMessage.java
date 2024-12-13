package tema09DataTypesAndVariablesMoreExcr;

import java.util.Scanner;

public class P05DecryptingMessage {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int s = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		
		String message = "";
		for(int i = 1; i <= n; i++){
			String input = scanner.nextLine();
			char letter = input.charAt(0);
			int numLetter = letter;
			numLetter += s;
			char newLetter = (char) numLetter;
			
			message += newLetter;
			
		}
		System.out.print(message);

	}

}
