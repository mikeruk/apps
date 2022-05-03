package tema11WhileLoop;

import java.util.Scanner;

public class P05AccountBalance {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		double installment = 0;
		
		
		while(true) {
			String input = scanner.nextLine();
			
			if(!input.equals("NoMoreMoney")) {
				
				double sum = Double.parseDouble(input);
				if(sum < 0) {
					System.out.println("Invalid operation!");
					break;
				}
				System.out.printf("Increase: %.2f%n", sum);
				installment += sum;
			} else {
				break;
			}
			
		}
		
		System.out.printf("Total: %.2f", installment);
		

	}

}
