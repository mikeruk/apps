package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P09PadawanEquipment {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		float budget = Float.parseFloat(scanner.nextLine());
		int students = Integer.parseInt(scanner.nextLine());
		float sabersPrice = Float.parseFloat(scanner.nextLine());
		float robesPrice = Float.parseFloat(scanner.nextLine());
		float beltsPrice = Float.parseFloat(scanner.nextLine());
		
		double studentsd = students;
		double sabersAll = Math.ceil(studentsd *= 1.10);
		int netoBelts = students - students/6;
		
		
		double sabersCosts = sabersPrice * sabersAll;
		float robesCosts = robesPrice * students;
		float beltsCosts = beltsPrice * netoBelts;
		double totalCosts = sabersCosts + robesCosts + beltsCosts;
		
		if(totalCosts <= budget) {
			System.out.printf("The money is enough - it would cost %.2flv.", totalCosts);
		} else {
			double diff = Math.abs(budget - totalCosts);
			System.out.printf("George Lucas will need %.2flv more.", diff);
		}
		

	}

}
