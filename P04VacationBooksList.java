package Exercises;

import java.util.Scanner;

public class P04VacationBooksList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		int totalPages = Integer.parseInt(scanner.nextLine());
		int pagesPerHour = Integer.parseInt(scanner.nextLine());
		int numDays = Integer.parseInt(scanner.nextLine());
		
		

		int timePerBook =  totalPages / pagesPerHour;
		int HoursPerDay = timePerBook / numDays;
		
		System.out.println(HoursPerDay);
		
	}

}
