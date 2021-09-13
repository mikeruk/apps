package Exercises;

import java.util.Scanner;

public class P01USDtoBGN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double usd = Double.parseDouble(scanner.nextLine());
		double exchangeRate = 1.79549;
		double USDtoBGN = usd * exchangeRate;
		System.out.println(USDtoBGN);
		
		
		

	}

}
