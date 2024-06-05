package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P02BonusScore {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number = Double.parseDouble(scanner.nextLine());
		double bonus;
		
		if(number <= 100) {
			bonus = 5;
		} else if(number < 1001) {
			bonus = number * 0.20;
		} else {
			bonus = number * 0.10;
		}
		
		
		if(number % 2 == 0) {
			bonus += 1;
		} else if(number % 10 == 5) {
			bonus += 2;
		}
		
		System.out.println(bonus);
		System.out.println(number + bonus);
	
	}

}
