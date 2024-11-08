package tema07DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		//int lastDigit = 0;
		
		for(int i = 1; i <= n; i++) {
			int current = i;
			while(true) {
				int lastDigit = current % 10;
				int newDigit = current / 10;
				
				sum += lastDigit;
				current = newDigit;
				
				if(newDigit == 0) {
					
					if(sum == 5 || sum == 7 || sum == 11) {
						System.out.printf("%d -> True\n",i);
					} else {
						System.out.printf("%d -> False\n",i);
					}
					sum = 0;
					break;
				}
			}
			
			
			
			
		}

	}

}
