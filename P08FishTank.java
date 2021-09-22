package Exercises;

import java.util.Scanner;

public class P08FishTank {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		double length = Double.parseDouble(scanner.nextLine());
		double width = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		double percent = Double.parseDouble(scanner.nextLine()) / 100;
		
		double tankVolume = length * width * height;
		double bruttoVolume = tankVolume * 0.001;
		double netVolume = bruttoVolume*(1-percent);
		
		System.out.printf("%.2f",netVolume );
	}

}
