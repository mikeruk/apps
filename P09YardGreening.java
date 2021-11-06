package MyPackageDemo;

import java.util.Scanner;

public class P09YardGreening {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sqmeter = Double.parseDouble(scanner.nextLine());
		double sqprice = 7.61;
		double discount = sqprice*0.18;
		double discountprice = sqprice - discount;
		double finaldiscount = discount*sqmeter;
		double price = discountprice*sqmeter;
		
		System.out.println("The final price is: "+price+" lv.");
		System.out.println("The discount is: "+finaldiscount+" lv.");

	}

}
