package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P10WeatherForecastPart2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double gradusi = Double.parseDouble(scanner.nextLine());
		
		if(gradusi >= 26.00 && gradusi <= 35.00) {
			System.out.println("Hot");
		} else if(gradusi >= 20.1 && gradusi <= 25.90) {
			System.out.println("Warm");
		} else if(gradusi >= 15.00 && gradusi <= 20.00) {
			System.out.println("Mild");
		} else if(gradusi >= 12.00 && gradusi <= 14.90) {
			System.out.println("Cool");
		} else if(gradusi >= 5.00 && gradusi <= 11.90) {
			System.out.println("Cold");
		} else {
			System.out.println("unknown");
		}

	}

}
