package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P06Pets {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		double dni = Double.parseDouble(scanner.nextLine());
		double ostavenaFoodKg = Double.parseDouble(scanner.nextLine());
		double dogFoodKg = Double.parseDouble(scanner.nextLine());
		double catFoodKg = Double.parseDouble(scanner.nextLine());
		double turtleFoodGramms = Double.parseDouble(scanner.nextLine());
		
		double turtleFoodKG = turtleFoodGramms / 1000;
		
		double totalFoodKG = (dogFoodKg + catFoodKg + turtleFoodKG) * dni;
		
		double difference = Math.abs(totalFoodKG - ostavenaFoodKg);
		if(totalFoodKG > ostavenaFoodKg) {
			
			System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));
			
		} else if(totalFoodKG <= ostavenaFoodKg) {
			
			System.out.printf("%.0f kilos of food left.", Math.floor(difference));
		}
		
	}

}
