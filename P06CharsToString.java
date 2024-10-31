package tema07DataTypesAndVariablesLab;

import java.util.Scanner;

public class P06CharsToString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char c;
		String str = "";
		for(int i = 1; i <= 3; i++) {
			 c = scanner.nextLine().charAt(0);
			 str += c;
		}
		System.out.println(str);

	}

}
