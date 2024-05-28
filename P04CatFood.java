package tema17onlineExam;

import java.util.Scanner;

public class P04CatFood {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double pricePerKgFood = 12.45;
		
		int numCats = Integer.parseInt(scanner.nextLine());
		
		int group1 = 0;
		int group2 = 0;
		int group3 = 0;
		double totaKgFood = 0;
		for(int i = 1; i <= numCats; i++) {
			double foodGramm = Double.parseDouble(scanner.nextLine());
			if(foodGramm >= 100 && foodGramm < 200) {
				totaKgFood += foodGramm;
				group1++;
			}
			if(foodGramm >= 200 && foodGramm < 300) {
				totaKgFood += foodGramm;
				group2++;
			}
			if(foodGramm >= 300 && foodGramm < 400) {
				totaKgFood += foodGramm;
				group3++;
			}
			
		}
		
		
		double totalKg = totaKgFood / 1000;
		double costs = totalKg * pricePerKgFood;
		System.out.printf("Group 1: %d cats.%n", group1);
		System.out.printf("Group 2: %d cats.%n", group2);
		System.out.printf("Group 3: %d cats.%n", group3);
		System.out.printf("Price for food per day: %.2f lv.", costs);
		
	}

}
