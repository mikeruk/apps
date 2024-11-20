package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P04SumOfChars {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			String s = scanner.nextLine();
			char c = s.charAt(0);
			sum += c;
		}
		System.out.println("The sum equals: "+sum);
	}

}
