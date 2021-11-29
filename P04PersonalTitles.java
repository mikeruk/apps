package tema07ConditionalStatementsAdv;

import java.util.Scanner;

public class P04PersonalTitles {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double age = Double.parseDouble(scanner.nextLine());
		String gender = scanner.nextLine();
		
		switch(gender) {
		case "m":
			if(age >= 16) {
				System.out.println("Mr.");
			} else if(age < 16) {
				System.out.println("Master");
			}
			break;
		case "f":
			if(age >= 16) {
				System.out.println("Ms.");
			} else if(age < 16) {
				System.out.println("Miss");
			}
		}
	}
}
