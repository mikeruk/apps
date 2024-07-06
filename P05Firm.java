package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P05Firm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double neobhodimiHours = Double.parseDouble(scanner.nextLine());
		double days = Double.parseDouble(scanner.nextLine());
		double broiWorkersExtra = Double.parseDouble(scanner.nextLine());
		double dniObuchenie = days * 0.1;
		double hoursObuchenie = dniObuchenie * 8;
		double hoursWork = days * 8;
		
		double hoursWorkNeto = hoursWork - hoursObuchenie;
		
		double workHoursExtra = broiWorkersExtra * 2 * days;
		double hoursTotal =  Math.floor(hoursWorkNeto + workHoursExtra);
		
		if(hoursTotal >= neobhodimiHours) {
			System.out.printf("Yes!%.0f hours left.", Math.floor(hoursTotal - neobhodimiHours));
			
		} else if(hoursTotal < neobhodimiHours) {
			
			double difference = Math.abs(hoursTotal - neobhodimiHours);
			System.out.printf("Not enough time!%.0f hours needed.", Math.floor(difference));
			
		}
	}

}
