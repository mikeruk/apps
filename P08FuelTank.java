package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P08FuelTank {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String gorivo = scanner.nextLine();
		Double litri = Double.parseDouble(scanner.nextLine());
		
		if(gorivo.equals("Diesel")) {
			if(litri >= 25) {
				System.out.printf("You have enough %s.", gorivo.toLowerCase());
			}
			if(litri < 25) {
				System.out.printf("Fill your tank with %s!", gorivo.toLowerCase());
			}
			
		} else if(gorivo.equals("Gasoline")) {
			if(litri >= 25) {
				System.out.printf("You have enough %s.", gorivo.toLowerCase());
			}
			if(litri < 25) {
				System.out.printf("Fill your tank with %s!", gorivo.toLowerCase());
			}
		} else if(gorivo.equals("Gas")) {
			if(litri >= 25) {
				System.out.printf("You have enough %s.", gorivo.toLowerCase());
			}
			if(litri < 25) {
				System.out.printf("Fill your tank with %s!", gorivo.toLowerCase());
			}
		} else {
			System.out.println("Invalid fuel!");
		}
	}

}
