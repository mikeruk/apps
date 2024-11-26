package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		double capacity = 0;
		int all = 255;
		
		for(int i = 1; i <= n; i++) {
			double liters = Double.parseDouble(scanner.nextLine());
			if (capacity + liters <= all){
                capacity+=liters;
            }else {
                System.out.println("Insufficient capacity!");
            }
		}
		
		System.out.printf("%.0f", capacity);
	}

}
