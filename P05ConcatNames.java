package tema07DataTypesAndVariablesLab;

import java.util.Scanner;

public class P05ConcatNames {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String first = scanner.nextLine();
		
		String last = scanner.nextLine();
		
		String delimiter = scanner.nextLine();
		
		System.out.printf("%s%s%s",first, delimiter, last);
		

	}

}
