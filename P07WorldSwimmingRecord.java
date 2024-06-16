package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P07WorldSwimmingRecord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double wRecordSec = Double.parseDouble(scanner.nextLine());
		double distance = Double.parseDouble(scanner.nextLine());
		double mPerSec = Double.parseDouble(scanner.nextLine());
		
		double timeExpected = distance * mPerSec;
		double zabavqne = Math.floor(distance / 15);
		double zabavqneTotal = zabavqne * 12.5;
		double timeReal = timeExpected + zabavqneTotal;
		
		double wRecDifference = Math.abs(wRecordSec - timeReal);
		if(wRecordSec > timeReal) {
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeReal); 
		} else if(wRecordSec <= timeReal) {
			System.out.printf("No, he failed! He was %.2f seconds slower.", wRecDifference);
		}
		
	}

}
