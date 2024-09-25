package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P01Ages {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		double age = Integer.parseInt(scanner.nextLine());
		
		String person = "";
		
		if(age >= 0 && age < 2) {
			//person = "baby";
			System.out.println("baby");
		} else if(age >= 3 && age < 13) {
			//person = "child";
			System.out.println("child");
		} else if(age >= 14 && age < 19) {
			//person = "teenager";
			System.out.println("teenager");
		} else if(age >= 20 && age < 65) {
			//person = "adult";
			System.out.println("adult");
		} else if(age >= 65) {
			//person = "elder";
			System.out.println("elder");
		} else {
			System.out.println("Invalid input");
		}
		//System.out.println(person);
		
	}

}
