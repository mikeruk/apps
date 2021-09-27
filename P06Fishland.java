package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P06Fishland {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double skumriaPrice = Double.parseDouble(scanner.nextLine());
		double cacaPrice = Double.parseDouble(scanner.nextLine());
		double palamudKg = Double.parseDouble(scanner.nextLine());
		double safridKg = Double.parseDouble(scanner.nextLine());
		double midiKg = Double.parseDouble(scanner.nextLine());
		
		
		
		double midiPrice = 7.50;
		double palamudPrice = skumriaPrice + skumriaPrice * 0.60;
		double safridPrice = cacaPrice + cacaPrice * 0.8;
		
		double palamudTotalPrice = palamudKg * palamudPrice;
		double safridTotalPrice = safridKg * safridPrice;
		double midiTotalPrice = midiKg * midiPrice;
		
		double totalCosts = palamudTotalPrice + safridTotalPrice + midiTotalPrice;
		
		System.out.printf("%.2f", totalCosts);
		
		
		
	}

}
