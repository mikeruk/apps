package tema15MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06MiddleCharacters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		giveChar(input);
	}
	
	
	public static void giveChar(String input) {
		char c;
		char d;
		if(input.length() % 2 != 0) {
			c = input.charAt((input.length()-1)/2);
			System.out.print(c);
		} else if(input.length() % 2 == 0){
			c = input.charAt((input.length()-1)/2);
			d = input.charAt(input.length()/2);
			System.out.print("" +c+d);
		}
		
	}

}
