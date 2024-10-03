package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P05Login {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String username = scanner.nextLine();
		
		String password = "";
		for(int i = username.length(); i > 0; i--) {
			char letter = username.charAt(i-1);
			password += letter;
		}
		
		int count = 1;
		//System.out.println(password);
		
		String passwordInput = scanner.nextLine();
		
		while(!password.equals(passwordInput)) {
			
			if(count == 4) {
				System.out.printf("User %s blocked!", username);
				break;
			} else {
				System.out.println("Incorrect password. Try again.");
			}
			count++;
			passwordInput = scanner.nextLine();
		}
		
		if(password.equals(passwordInput)) {
			System.out.printf("User %s logged in.", username);
		}
	}

}
