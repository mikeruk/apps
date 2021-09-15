package Exercises;

import java.util.Scanner;

public class P03DepositCalculator {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double deposit = Double.parseDouble(scanner.nextLine());
		int months = Integer.parseInt(scanner.nextLine());
		double interestRate = Double.parseDouble(scanner.nextLine());
		
		
		double annualInterestAmount = deposit * interestRate / 100;
		double monthInterestAmount = annualInterestAmount / 12;
		double totalEndAmount = deposit + months*monthInterestAmount;
		System.out.printf("%.2f",totalEndAmount);

	}

}
