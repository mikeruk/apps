package tema10ForLoopUpr2;

import java.util.Scanner;

public class P03Logistics {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
	
		
		int n = Integer.parseInt(scanner.nextLine());
		
	
		double tonesCarSofar = 0;
		double tonesCarTotal = 0;
		double totalExpenseCar = 0;
		
		double tonesTruckSofar = 0;
		double tonesTruckTotal = 0;
		double totalExpenseTruck = 0;
		
		double tonesTrainSofar = 0;
		double tonesTrainTotal = 0;
		double totalExpenseTrain = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int tones = Integer.parseInt(scanner.nextLine());
			
			if(tones <= 3) {
				tonesCarSofar = tones * 200;
				totalExpenseCar += tonesCarSofar;
				tonesCarTotal = tonesCarTotal + tones;
			} else if(tones <= 11) {
				tonesTruckSofar = tones * 175;
				totalExpenseTruck += tonesTruckSofar;
				tonesTruckTotal = tonesTruckTotal + tones;
			} else if(tones >= 12) {
				tonesTrainSofar = tones * 120;
				totalExpenseTrain += tonesTrainSofar;
				tonesTrainTotal = tonesTrainTotal + tones;
			}
			
		}
		double tonesTotal = tonesCarTotal + tonesTruckTotal + tonesTrainTotal;
		double tonesExpenseAvg = (totalExpenseCar + totalExpenseTruck + totalExpenseTrain) / tonesTotal;
		double percentTcar = tonesCarTotal / tonesTotal * 100.00;
		double percentTtruck = tonesTruckTotal / tonesTotal * 100.00;
		double percentTtrain = tonesTrainTotal / tonesTotal * 100.00;
		
		System.out.printf("%.2f%n", tonesExpenseAvg);
		System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n",percentTcar, percentTtruck, percentTtrain);
		

	}

}
