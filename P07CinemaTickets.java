package tema13NestedLoops;

import java.util.Scanner;

public class P07CinemaTickets {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();
		int seats = Integer.parseInt(scanner.nextLine());
		
		
		int standard = 0;
		int student = 0;
		int kid = 0;
		
		double currentSeats = 0;
		double totalSeats = 0;
		
		
		
		double allStudents = 0;
		double allStandards = 0;
		double allKids = 0;
		
		
		
		while(!input.equals("Finish")) {
			currentSeats = 0;
			standard = 0;
			student = 0;
			kid = 0;
			
			
			while(currentSeats < seats) {
				
				String ticket = scanner.nextLine();
				
				
				if(ticket.equals("standard")) {
					currentSeats++;
					standard++;
					allStandards += 1;
				}
				if(ticket.equals("student")) {
					currentSeats++;
					student++;
					allStudents += 1;
					
				}
				
				if(ticket.equals("kid")) {
					currentSeats++;
					kid++;
					allKids += 1;
				}
				if(ticket.equals("End")) {
					break;
				}
				
				
			}
			
			System.out.printf("%s - %.2f%% full.%n",input, currentSeats/seats*100);
			
			
			
			input = scanner.nextLine();
			if(input.equals("Finish")) {
				break;
			} 
			
			seats = Integer.parseInt(scanner.nextLine());
		}
		
		totalSeats = allStudents + allStandards + allKids;
		
		
		System.out.printf("Total tickets: %.0f%n", totalSeats);
		System.out.printf("%.2f%% student tickets.%n", allStudents/totalSeats*100);
		System.out.printf("%.2f%% standard tickets.%n", allStandards/totalSeats*100);
		System.out.printf("%.2f%% kids tickets.%n", allKids/totalSeats*100);

	}

}
