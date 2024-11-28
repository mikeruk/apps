package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		double minNum = Double.MIN_VALUE;
		String winner = "";
		for(int i = 1; i <= n; i++) {
			String model = scanner.nextLine();
			float radius = Float.parseFloat(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());
			
			double volume = Math.PI * Math.pow(radius, 2) * height;
			if (volume >= minNum) {
				minNum = volume;
				winner = model; 
			}
		}
		System.out.println(winner);
	}

}
