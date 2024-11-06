package tema07DataTypesAndVariablesLab;


import java.util.Scanner;

public class P09CenturiesToMinutes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double centuries = Double.parseDouble(scanner.nextLine());
		double years = centuries * 100;
		double days = years * 365.2422;
		double hours = days * 24;
		double minutes = hours * 60;

		
		System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
		
	}

}
