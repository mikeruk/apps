package tema16onlineExamTest;

import java.util.Scanner;

public class P04WorkoutThirdSolution {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double days = Integer.parseInt(scanner.nextLine());
		double km = Double.parseDouble(scanner.nextLine());
		
		
		double kmTotal = km;
		
		
		 for(int i = 1; i <= days;) {
			 
			 
			 if(kmTotal > 1000) {
				 System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(kmTotal - 1000));
				 break;
			 }
			 
			 i++;
			 
			 double percent = Double.parseDouble(scanner.nextLine())/100.00;
			 km = km + km*percent;
			 kmTotal += km;
			 
			 if(kmTotal > 1000) {
				 double total1 = Math.ceil(kmTotal - 1000.00);
				 System.out.printf("You've done a great job running %.0f more kilometers!", Math.abs(total1));
				 
				 
			 } else if(i > days && kmTotal < 1000){
				 double total0 = 1000.00 - kmTotal;
				 System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.abs(Math.ceil(total0)));
				 
			 }
		}

	}

}
