package MyPackageDemo;

import java.util.Scanner;

public class P08PetShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogs = Integer.parseInt(scanner.nextLine());
		int animals = Integer.parseInt(scanner.nextLine());
		double dogfood = 2.5;
		int food = 4;
		double sum = (dogs * dogfood) + (animals * food);
		
		//System.out.println(sum+" lv.");
		System.out.println(dogs*2.5 + animals * 4 + " lv.");
		

	}

}
