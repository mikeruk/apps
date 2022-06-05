package tema12WhileLoopUpr;

import java.util.Scanner;

public class P05Coins {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double sum = Double.parseDouble(scanner.nextLine()) * 100;
		
		int coins = 0;
		
		
		while(sum > 0) {
			
			if(sum >= 200) {
				coins += (int) sum / 200;
				sum = sum % 200;
			}
			
			if(sum >= 100) {
				coins += (int) sum / 100;
				sum = sum % 100;
			}
			
			if(sum >= 50) {
				coins += (int) sum / 50;
				sum = sum % 50;
			}
			
			if(sum >= 20) {
				coins += (int) sum / 20;
				sum = sum % 20;
			}
			
			if(sum >= 10) {
				coins += (int) sum / 10;
				sum = sum % 10;
			}
			
			if(sum >= 5) {
				coins += (int) sum / 5;
				sum = sum % 5;
			}
			
			if(sum >= 2) {
				coins += (int) sum / 2;
				sum = sum % 2;
			}
			
			if(sum >= 1) {
				coins += (int) sum / 1;
				sum = Math.floor(sum);
				sum = sum % 1;
			}
			
			break;
			
			
		}
		
		System.out.println(coins);
		

	}

}
