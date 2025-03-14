package tema15MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int count = 0;
		System.out.println(vowelCount(input, count));

	}
	
	public static int vowelCount(String input, int count) {
		
		for(int i = 1; i <= input.length()-1; i++) {
			
			char letter = input.charAt(i);
			
			switch(letter) {
				case 'a':
				case 'o':
				case 'u':
				case 'e':
				case 'i':
				case 'y':
				case 'A':
				case 'O':
				case 'U':
				case 'E':
				case 'I':
				case 'Y':
					count++;
					break;
				default:
					break;
			}
			
		}
		return count;
	}

}
