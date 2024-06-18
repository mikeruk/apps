package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P08Scholarship {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double dohod = Double.parseDouble(scanner.nextLine());
		double sredenUspeh = Double.parseDouble(scanner.nextLine());
		double minZaplata = Double.parseDouble(scanner.nextLine());
		
		
		boolean approvedForSocial = dohod < 480.00 && sredenUspeh > 4.5;
		boolean approvedForSuccess = sredenUspeh >= 5.5;
		
		double stipendiaSocial = 0.00;
		double stipendiaSuccess = 0.00;
		
		if(approvedForSocial && !approvedForSuccess) {
			stipendiaSocial = minZaplata * 0.35;
			System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(stipendiaSocial));
		} else if(approvedForSuccess && !approvedForSocial) {
			stipendiaSuccess = sredenUspeh * 25.00;
			System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(stipendiaSuccess));
		} else if(approvedForSocial && approvedForSuccess) {
			stipendiaSuccess = Math.floor(sredenUspeh * 25.00);
			stipendiaSocial = Math.floor(minZaplata * 0.35);
			if(stipendiaSuccess >= stipendiaSocial) {
				System.out.printf("You get a scholarship for excellent results %.0f BGN", stipendiaSuccess);
			} else if(stipendiaSuccess < stipendiaSocial) {
				System.out.printf("You get a Social scholarship %.0f BGN", stipendiaSocial);
			}
		} else if(!approvedForSocial && !approvedForSuccess) {
			System.out.println("You cannot get a scholarship!");
		}
	}

}
