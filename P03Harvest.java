package Tema0602ProverkiUprajnenie2;

import java.math.MathContext;
import java.util.Scanner;

public class P03Harvest {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			 double sqMetersLoze = Double.parseDouble(scanner.nextLine());
			 double grozdePerSqM = Double.parseDouble(scanner.nextLine());
			 double litresWineNeeded = Double.parseDouble(scanner.nextLine());
			 double broiRabotnici = Double.parseDouble(scanner.nextLine());
			 
			 double grozdeTotal = (sqMetersLoze * grozdePerSqM);
			 double wineLitersTotal = grozdeTotal / 2.5;
			 double wineLitersProduced = wineLitersTotal * 0.4;
			 
			double wineDifference = wineLitersProduced - wineLitersTotal;
			 
			
			
			
			//System.out.println("wineDifference " + wineDifference);
			 
			 if(wineLitersProduced < litresWineNeeded) {
				// double total = Math.floor( litresWineNeeded - wineLitersProduced);
				 double difference = Math.abs(wineLitersProduced - litresWineNeeded);
				 System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litresWineNeeded - wineLitersProduced));
			 } else if(wineLitersProduced >= litresWineNeeded){
				 
				 double total = Math.ceil(wineLitersProduced - litresWineNeeded);
				 System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(wineLitersProduced));
				 System.out.printf("%.0f liters left -> %.0f liters per person.",total,Math.ceil(total / broiRabotnici));
			 }

	}

}
