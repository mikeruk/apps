package tema17ListsExercise;

import java.util.Scanner;

public class P07AppendArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String[] arrays = input.split("\\|");
		
		for(int i = arrays.length-1; i >= 0; i--) {
			String elements = arrays[i].trim();
			
			if(elements.equals(" ") || elements.equals("")) {
				continue;
			}
			
			String[] numbers = elements.split("\\s+");
			System.out.print(String.join(" ", numbers));
			System.out.print(" ");
			
			
		}
			
		
	}

}
