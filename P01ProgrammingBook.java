package tema17onlineExam;

import java.util.Scanner;

public class P01ProgrammingBook {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double pricePage = Double.parseDouble(scanner.nextLine());
		double priceCover = Double.parseDouble(scanner.nextLine());
		double discount = Double.parseDouble(scanner.nextLine()) / 100.00;
		double costDesigner = Double.parseDouble(scanner.nextLine());
		double percPaid = Double.parseDouble(scanner.nextLine()) / 100.00;
		
		
		
		
		double costsPaper = pricePage * 899 + priceCover * 2;
		
		double sumDiscount = costsPaper * discount;
		
		costsPaper -= sumDiscount;
		costsPaper += costDesigner;
		
		double partCosts = costsPaper * percPaid;
		
		double netoCosts = costsPaper - partCosts;
		System.out.printf("Avtonom should pay %.2f BGN.", netoCosts);
		
		
		
		
	}

}
