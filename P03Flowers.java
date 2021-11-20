package tema07ConditionalStatAdvUpr2;

import java.util.Scanner;

public class P03Flowers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		int chrisantemen = Integer.parseInt(scanner.nextLine());
		int roses = Integer.parseInt(scanner.nextLine());
		int tulips = Integer.parseInt(scanner.nextLine());
		String season = scanner.nextLine();
		String holiday = scanner.nextLine();
		
		double totalExpense = 0;
		double totalFlowers = chrisantemen + roses + tulips;
		if(season.equals("Spring") || season.equals("Summer")) {
			double chExpns = chrisantemen * 2;
			double roExpns = roses * 4.10;
			double laExpns = tulips * 2.50;
			totalExpense = chExpns + roExpns + laExpns;
		}
		
		if(season.equals("Autumn") || season.equals("Winter")) {
			double chExpns = chrisantemen * 3.75;
			double roExpns = roses * 4.50;
			double laExpns = tulips * 4.15;
			totalExpense = chExpns + roExpns + laExpns;
		}
		
		if(holiday.equals("Y")) {
			totalExpense *= 1.15; 
		}
		
		if(tulips > 7 && season.equals("Spring")) {
			totalExpense *= 0.95;
		}
		if(roses >= 10 && season.equals("Winter")) {
			totalExpense *= 0.90;
		}
		if (totalFlowers > 20) {
			totalExpense *= 0.80;
		}
		
		System.out.printf("%.2f", totalExpense+2);
		
		
		
				
					
		}
}



