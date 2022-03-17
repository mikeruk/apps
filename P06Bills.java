package tema10ForLoopUpr2;

import java.util.Scanner;

public class P06Bills {

	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		
		int months = Integer.parseInt(scanner.nextLine());
		
		
		
		
		double elBill = 0;
		double elBillTotal = 0;
		
		
		int waterBill = 20;
		int internetBill = 15;
		double total = elBill + waterBill + internetBill;
		
		
		double otherBillsTotal = 0;
		double otherBillsSoFar = 0;
		
		for(int i = 1; i <= months; i++) {
			elBill = Double.parseDouble(scanner.nextLine());
			elBillTotal += elBill;
			total = elBill + waterBill + internetBill;
			otherBillsSoFar = total + total*0.2;
			otherBillsTotal += otherBillsSoFar;
		}
		
		double waterBillTotal = waterBill * months;
		double internetBillTotal = internetBill * months;
		double grandTotal = (waterBillTotal + internetBillTotal + otherBillsTotal + elBillTotal) / months;
		
		System.out.printf("Electricity: %.2f lv%n", elBillTotal);
		System.out.printf("Water: %.2f lv%n", waterBillTotal);
		System.out.printf("Internet: %.2f lv%n", internetBillTotal);
		System.out.printf("Other: %.2f lv%n", otherBillsTotal);
		System.out.printf("Average: %.2f lv%n", grandTotal);
		
		
		
	}

}
