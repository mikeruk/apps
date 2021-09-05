package bookExercises;

import java.util.Scanner;

public class Page125SumiraneNaSekundi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int competitor1 = Integer.parseInt(scanner.nextLine());
		int competitor2 = Integer.parseInt(scanner.nextLine());
		int competitor3 = Integer.parseInt(scanner.nextLine());
		
		int total = competitor1 + competitor2 + competitor3;
		double minutes = total / 60.0;
		double seconds = total % 60.0;
		
		System.out.printf("%.0f:%02.0f", Math.floor(minutes), seconds);		
		
	}

}
