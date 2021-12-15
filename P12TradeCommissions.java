package tema07ConditionalStatementsAdv;

import java.util.Scanner;

public class P12TradeCommissions {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		String town = scanner.nextLine();
		double sales = Double.parseDouble(scanner.nextLine());
		
		
		double commission = 0;
		
			if(town.equals("Sofia")) {
					if(sales >= 0 && sales <= 500) {
						commission = 0.05;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 500 && sales <= 1000) {
						commission = 0.07;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 1000 && sales <= 10000) {
						commission = 0.08;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 10000) {
						commission = 0.12;
						System.out.printf("%.2f",commission * sales);
					} else {
						System.out.println("error");
					}
				} else if(town.equals("Varna")) {
					if(sales >= 0 && sales <= 500) {
						commission = 0.045;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 500 && sales <= 1000) {
						commission = 0.075;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 1000 && sales <= 10000) {
						commission = 0.1;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 10000) {
						commission = 0.13;
						System.out.printf("%.2f",commission * sales);
					} else {
						System.out.println("error");
					}
				} else if(town.equals("Plovdiv")) {
					if(sales >= 0 && sales <= 500) {
						commission = 0.055;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 500 && sales <= 1000) {
						commission = 0.08;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 1000 && sales <= 10000) {
						commission = 0.12;
						System.out.printf("%.2f",commission * sales);
					} else if(sales > 10000) {
						commission = 0.145;
						System.out.printf("%.2f",commission * sales);
					} else {
						System.out.println("error");
					}
				} else {
					System.out.println("error");
				}
	}

}
