package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P05Time15Minutes {

	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in);
		
		double hours = Integer.parseInt(scanner.nextLine());
		double minutes = Integer.parseInt(scanner.nextLine());
		
		double minutesPlus15 = minutes + 15;
		
		if(minutesPlus15 > 59) {
			hours += 1;
			minutesPlus15 -= 60;
		} 
		if(hours > 23) {
			hours = 0;
		}
		System.out.printf("%.0f:%02.0f",hours,minutesPlus15);

	}

}
