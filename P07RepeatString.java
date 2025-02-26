package tema14MethodsLab;

import java.util.Scanner;

public class P07RepeatString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int count = Integer.parseInt(scanner.nextLine());
		reapeatString(input, count);
	}

	private static void reapeatString(String input, int count) {
		for(int i = 1; i <= count; i++) {
			System.out.print(input);
		}
	}

}
