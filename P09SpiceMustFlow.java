package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int yield = Integer.parseInt(scanner.nextLine());
		
		int days = 0;
		float extracted = 0f;
		while(yield >= 100) {
			int yieldEx = yield;
			extracted += yieldEx - 26;
			yield -= 10;
			days++;
			
		}
		if(days == 0 && yield <= 100) {
			System.out.println(days);
			System.out.printf("%.0f",extracted);
		} else {
			extracted -= 26;
			System.out.println(days);
			System.out.printf("%.0f",extracted);
		}
		
	}

}
