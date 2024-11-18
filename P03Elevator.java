package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03Elevator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int capacity = Integer.parseInt(scanner.nextLine());
		int people = Integer.parseInt(scanner.nextLine());
		
		
		double courses = 1.00 * capacity / people;
		int courses1 = capacity / people;
		
		if(courses > courses1) {
			System.out.println(courses1 + 1);
		} else {
			System.out.println(courses1);
		}
	}

}
