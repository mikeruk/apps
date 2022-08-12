package tema16onlineExamTest;

import java.util.Scanner;

public class P04WorkoutSecondSolution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int day = 1;
		double numDays = Integer.parseInt(scanner.nextLine());
		double currentKm1 = Double.parseDouble(scanner.nextLine());
		double percIncrease = Integer.parseInt(scanner.nextLine()) / 100.00;
		
		double currentKm2 = currentKm1;
		
		
		 for(int i = 1; i <= numDays; i++) {
			 
			 
			 if(currentKm1 >= 1000) {
				 System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(currentKm1 - 1000));
				 break;
			 }
			 currentKm1 = currentKm1 + currentKm1*percIncrease;
			 currentKm2 += currentKm1;
			 
			 if(i >= numDays && currentKm2 <= 1000) {
				 System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000.00 - currentKm2));
				 break;
			 } else if(i >= numDays && currentKm2 >= 1000){
				 System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(currentKm2 - 1000));
				 break;
			 }
			 
			 percIncrease = Integer.parseInt(scanner.nextLine()) / 100.00;
			 }
		 

	}

}
