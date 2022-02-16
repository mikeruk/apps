package tema10ForLoopUpr;

import java.util.Scanner;

public class P11CleverLily {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		double n = Double.parseDouble(scanner.nextLine());
		double washMachinePrice = Double.parseDouble(scanner.nextLine());
		double toyPrice = Double.parseDouble(scanner.nextLine());
		
		double diff = 10;
		
		
		double money = 0;
		double toys = 0;
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0) {
				money += diff - 1;
				diff += 10;
			} else {
				toys++;
			}
			
		}
		
		double soldToysMoney = toyPrice * toys;
		double moneyTotal = soldToysMoney + money;
		
		if(moneyTotal >= washMachinePrice) {
			System.out.printf("Yes! %.2f", moneyTotal - washMachinePrice);
			
		} else {
			System.out.printf("No! %.2f", Math.abs(moneyTotal - washMachinePrice));
		}
	}

}
