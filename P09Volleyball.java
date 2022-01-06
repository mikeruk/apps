package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P09Volleyball {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		String year = scanner.nextLine();
		int holidaysNoWeekends = Integer.parseInt(scanner.nextLine());
		int weekendsHome = Integer.parseInt(scanner.nextLine());
		
		int weekends = 48;
		
		int weekendsSofia = weekends - weekendsHome;
		double gamesSofia = weekendsSofia * 3.0/4;
		int gamesHome = weekendsHome;
		double gamesOnHolidays = holidaysNoWeekends * 2.0/3;
		double gamesTotal = gamesSofia + gamesHome + gamesOnHolidays;
		
		if(year.equals("leap")) {
			gamesTotal = gamesTotal + gamesTotal*.15;
		}
		
		System.out.printf("%.0f",Math.floor(gamesTotal));
		
	}

}
