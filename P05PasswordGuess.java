package Tema06Proverki;

import java.util.Scanner;

public class P05PasswordGuess {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		if(input.equals("s3cr3t!P@ssw0rd")){
			System.out.println("Welcome");
		} else {
			System.out.println("Wrong password!");
		}
		

	}

}
