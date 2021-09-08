package bookExercises;

import java.util.Scanner;

public class Page139IzpisvaneNaChisloDoSto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int number = Integer.parseInt(scanner.nextLine());
		
		if(number == 1) {
			System.out.println("one");
		} else if(number == 2) {
			System.out.println("two");
		} else if(number == 3) {
			System.out.println("three");
		} else if(number == 4) {
			System.out.println("four");
		} else if(number == 5) {
			System.out.println("five");
		} else if(number == 6) {
			System.out.println("six");
		} else if(number == 7) {
			System.out.println("seven");
		} else if(number == 8) {
			System.out.println("eight");
		} else if(number == 9) {
			System.out.println("nine");
		}
		
		
		int desetici = 0;
		int edinici = 0;
		if(number >= 10) {
			desetici = number / 10;
			edinici = number % 10;
		} 
		
		
		
		
		if(desetici == 1 && edinici == 0) {
			System.out.println("ten");
		} else if(desetici == 1 && edinici == 1) {
			System.out.println("eleven");
		} else if(desetici == 1 && edinici == 2) {
			System.out.println("twelve");
		} else if(desetici == 1 && edinici == 3) {
			System.out.println("thirteen");
		} else if(desetici == 1 && edinici == 4) {
			System.out.println("fourteen");
		} else if(desetici == 1 && edinici == 5) {
			System.out.println("fifteen");
		} else if(desetici == 1 && edinici == 6) {
			System.out.println("sixteen");
		} else if(desetici == 1 && edinici == 7) {
			System.out.println("seventenn");
		} else if(desetici == 1 && edinici == 8) {
			System.out.println("eighteen");
		} else if(desetici == 1 && edinici == 9) {
			System.out.println("nineteen");
		} else if(desetici == 2 && edinici == 0) {
			System.out.println("twenty");
		} else if(desetici == 3 && edinici == 0) {
			System.out.println("thirty");
		} else if(desetici == 4 && edinici == 0) {
			System.out.println("fourty");
		} else if(desetici == 5 && edinici == 0) {
			System.out.println("fifty");
		} else if(desetici == 6 && edinici == 0) {
			System.out.println("sixty");
		} else if(desetici == 7 && edinici == 0) {
			System.out.println("seventy");
		} else if(desetici == 8 && edinici == 0) {
			System.out.println("eighty");
		} else if(desetici == 9 && edinici == 0) {
			System.out.println("ninety");
		} 
		
		
		
		
		
		
		
		
	
		
	}

}
