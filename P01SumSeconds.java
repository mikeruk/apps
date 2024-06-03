package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P01SumSeconds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = Integer.parseInt(scanner.nextLine());
		int second = Integer.parseInt(scanner.nextLine());
		int third = Integer.parseInt(scanner.nextLine());

		
		int timeInSeconds = first + second + third;
		
		int minutes = timeInSeconds / 60;
		int seconds =  timeInSeconds % 60;
		
		
		
		System.out.printf("%d:%02d",minutes,seconds);
	}

}
