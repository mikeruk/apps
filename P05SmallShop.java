package tema07ConditionalStatementsAdv;

import java.util.Scanner;

public class P05SmallShop {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String product = scanner.nextLine();
		String town = scanner.nextLine();
		double quantity = Double.parseDouble(scanner.nextLine());
		
		double total = 0;
				
		switch(product) {
			case "coffee":
				if(town.equals("Sofia")) {
					total = quantity * 0.50;
				} else if(town.equals("Plovdiv")) {
					total = quantity * 0.40;
				} else if(town.equals("Varna")) {
					total = quantity * 0.45;
				} break;
			case "water":
				if(town.equals("Sofia")) {
					total = quantity * 0.80;
				} else if(town.equals("Plovdiv")) {
					total = quantity * 0.70;
				} else if(town.equals("Varna")) {
					total = quantity * 0.70;
				} break;
			case "beer":
				if(town.equals("Sofia")) {
					total = quantity * 1.20;
				} else if(town.equals("Plovdiv")) {
					total = quantity * 1.15;
				} else if(town.equals("Varna")) {
					total = quantity * 1.10;
				} break;
			case "sweets":
				if(town.equals("Sofia")) {
					total = quantity * 1.45;
				} else if(town.equals("Plovdiv")) {
					total = quantity * 1.30;
				} else if(town.equals("Varna")) {
					total = quantity * 1.35;
				} break;
			case "peanuts":
				if(town.equals("Sofia")) {
					total = quantity * 1.60;
				} else if(town.equals("Plovdiv")) {
					total = quantity * 1.50;
				} else if(town.equals("Varna")) {
					total = quantity * 1.55;
				} break;
			default:
				System.out.println("product is out of stock");
		}
		System.out.println(total);
		
		
		
		
		
		
		
		

	}

}
