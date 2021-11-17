package tema07ConditionalStatAdvUpr2;

import java.util.Scanner;

public class P02BikeRace {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		
		int juniors = Integer.parseInt(scanner.nextLine());
		int seniours = Integer.parseInt(scanner.nextLine());
		String trace = scanner.nextLine();
		
		switch(trace) {
			case "trail":
				double expenseJuniours = juniors * 5.50;
				double expenseSeniours = seniours * 7;
				double brutoIncome = expenseJuniours + expenseSeniours;
				double netoIncome = brutoIncome - brutoIncome* 0.05;
				System.out.printf("%.2f", netoIncome);
				break;
				
			case "cross-country":
				expenseJuniours = juniors * 8;
				expenseSeniours = seniours * 9.5;
				brutoIncome = expenseJuniours + expenseSeniours;
				if(juniors+seniours >= 50) {
					brutoIncome = brutoIncome - brutoIncome*0.25;
				}
				netoIncome = brutoIncome - brutoIncome* 0.05;
				System.out.printf("%.2f", netoIncome);
				break;
			case "downhill":
				expenseJuniours = juniors * 12.25;
				expenseSeniours = seniours * 13.75;
				brutoIncome = expenseJuniours + expenseSeniours;
				netoIncome = brutoIncome - brutoIncome* 0.05;
				System.out.printf("%.2f", netoIncome);
				break;
				
			case "road":
				expenseJuniours = juniors * 20;
				expenseSeniours = seniours * 21.5;
				brutoIncome = expenseJuniours + expenseSeniours;
				netoIncome = brutoIncome - brutoIncome* 0.05;
				System.out.printf("%.2f", netoIncome);
				break;
			default:
				break;
			}
			
		}

}


