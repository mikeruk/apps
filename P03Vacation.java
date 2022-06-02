package tema12WhileLoopUpr;

import java.util.Scanner;

public class P03Vacation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double neededMoney = Double.parseDouble(scanner.nextLine());
		double cash = Double.parseDouble(scanner.nextLine());
		int countSpend = 0;
		
		boolean trying = true;
		
		int days = 0;
		while(trying) {
			String input = scanner.nextLine();
			double sum = Double.parseDouble(scanner.nextLine());
			days++;
			if(input.equals("spend")) {
				countSpend++;
				cash -= sum;
				if(cash < 0) {
					cash = 0;
				}
			}
			if(countSpend == 5) {
				break;
			}
			
			if(input.equals("save")) {
				countSpend = 0;
				cash += sum;
			}
			
			
			if(cash >= neededMoney) {
				break;
			}
			
		}
		
		if(countSpend == 5) {
			System.out.println("You can't save the money.");
			System.out.println(days);
		}
		
		if(cash >= neededMoney) {
			System.out.printf("You saved the money for %d days.", days);
		}
	}

}
