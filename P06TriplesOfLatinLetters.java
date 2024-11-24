package tema09DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		//int m = Integer.parseInt(scanner.nextLine());
		
		for(int i = 97; i <= 96+n; i++) {
			
			for(int j = 97; j <= 96+n; j++) {
				
				for(int k = 97; k <= 96+n; k++) {
					
					System.out.printf("%c%c%c \n",i,j,k);
					
				}
			}
		}
	}
}
