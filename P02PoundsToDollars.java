package tema07DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double USD = Double.parseDouble(scanner.nextLine());
		
		double GPB = USD * 1.31;
		
		System.out.printf("%.3f", GPB);
		
	}

}
