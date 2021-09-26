package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		double veggiePeice = Double.parseDouble(scanner.nextLine());
		double fruitsPrice = Double.parseDouble(scanner.nextLine());
		double veggieKg = Double.parseDouble(scanner.nextLine());
		double fruitsKg = Double.parseDouble(scanner.nextLine());
		
		double veggiesBGN = veggiePeice * veggieKg / 1.94;
		double fruitsBGN = fruitsPrice * fruitsKg / 1.94;
		double euro = veggiesBGN + fruitsBGN;
		
		System.out.printf("%.2f", euro);
	}

}
