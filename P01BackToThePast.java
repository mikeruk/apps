package tema10ForLoopUpr2;

import java.util.Scanner;

public class P01BackToThePast {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		double money = Double.parseDouble(scanner.nextLine());
		
		int year = Integer.parseInt(scanner.nextLine());
		
		int baseYear = 1800;
		int age = 0;
		
		for(int i = baseYear; i <= year; i++) {
			
			if(i % 2 == 0) {
				money -= 12000;				
			} else {
				money -= 12000 + 50*(18+age);
			}
			age++;
		}
		
		if(money >= 0) {
			System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
			
		} else {
			System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
			
		}
	}

}
