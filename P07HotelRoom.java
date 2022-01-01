package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P07HotelRoom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String month = scanner.nextLine();
		int days = Integer.parseInt(scanner.nextLine());
		
		boolean studio;
		boolean appartment;
		
		switch(month) {
		
			case "May":
			case "October":
				if(days > 7 && days <= 14) {
					double priceStudio = days * 50;
					double priceStudioNeto = priceStudio - priceStudio*0.05;
					
					double priceAppartment = days * 65;
					System.out.printf("Apartment: %.2f lv.\n",priceAppartment);
					System.out.printf("Studio: %.2f lv.",priceStudioNeto);
				} else if(days > 14) {
					double priceStudio = days * 50;
					double priceStudioNeto = priceStudio - priceStudio*0.30;
					
					double priceAppartment = days * 65;
					double priceApparmentNeto = priceAppartment - priceAppartment*0.10;
					System.out.printf("Apartment: %.2f lv.\n",priceApparmentNeto);
					System.out.printf("Studio: %.2f lv.",priceStudioNeto);
				} else {
					double priceStudio = days * 50;
					double priceAppartment = days * 65;
					System.out.printf("Apartment: %.2f lv.\n",priceAppartment);
					System.out.printf("Studio: %.2f lv.",priceStudio);
				}
				break;
				
			case "June":
			case "September":
				if(days <= 14) {
					double priceStudio = days * 75.20;
					
					double priceAppartment = days * 68.70;
					System.out.printf("Apartment: %.2f lv.\n",priceAppartment);
					System.out.printf("Studio: %.2f lv.",priceStudio);
					
				} else if(days > 14) {
					double priceStudio = days * 75.20;
					double priceStudioNeto = priceStudio - priceStudio*0.20;
					
					double priceAppartment = days * 68.70;
					double priceApparmentNeto = priceAppartment - priceAppartment*0.10;
					System.out.printf("Apartment: %.2f lv.\n",priceApparmentNeto);
					System.out.printf("Studio: %.2f lv.",priceStudioNeto);
				} 
				break;
				
			case "July":
			case "August":
				if(days > 14) {
					double priceStudio = days * 76;
					
					double priceAppartment = days * 77;
					double priceApparmentNeto = priceAppartment - priceAppartment*0.10;
					System.out.printf("Apartment: %.2f lv.\n",priceApparmentNeto);
					System.out.printf("Studio: %.2f lv.",priceStudio);
				} else {
					double priceStudio = days * 76;
					
					double priceAppartment = days * 77;
					System.out.printf("Apartment: %.2f lv.\n",priceAppartment);
					System.out.printf("Studio: %.2f lv.",priceStudio);
				} 
				break;
			default:
				break;
		}

	}

}
