package tema15MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char start = scanner.nextLine().charAt(0);
		char end = scanner.nextLine().charAt(0);
		printCharsInbetween(start, end);
	}
	
	
	public static void printCharsInbetween(char start, char end) {
		
		if(start < end) {
			for(int i = start+1; i <= end-1; i++) {
				System.out.printf("%c ", i);
			}
		} else {
			
			for(int i = end+1; i <= start-1; i++) {
				System.out.printf("%c ", i);
			}
		}
		
		
	}

}
