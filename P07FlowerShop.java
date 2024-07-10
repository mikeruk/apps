package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P07FlowerShop {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int broiMagnolii = Integer.parseInt(scanner.nextLine());
		int broiZumbiuli = Integer.parseInt(scanner.nextLine());
		int broiRozi = Integer.parseInt(scanner.nextLine());
		int broiKaktusi = Integer.parseInt(scanner.nextLine());
		double podarakPrice = Double.parseDouble(scanner.nextLine());
		
		double priceMagnolii = 3.25;
		double priceZumbiuli = 4;
		double priceRozi = 3.5;
		double priceKaktusi = 8;
		
		double PrihodBruto = broiMagnolii*priceMagnolii + broiZumbiuli*priceZumbiuli
				+ broiRozi*priceRozi + broiKaktusi*priceKaktusi;
		
		double taxesSum = PrihodBruto * 0.05;

		double prihodNeto = PrihodBruto - taxesSum;
		
		double difference = Math.abs(prihodNeto - podarakPrice);
		
		
		if(prihodNeto >= podarakPrice){
			
			System.out.printf("She is left with %.0f leva.", Math.floor(difference));
		} else if(prihodNeto < podarakPrice) {
			
			System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
		}
		

	}

}
