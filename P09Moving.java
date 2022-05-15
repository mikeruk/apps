package tema11WhileLoop;

import java.util.Scanner;

public class P09Moving {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);


		int width = Integer.parseInt(scanner.nextLine());
		int length = Integer.parseInt(scanner.nextLine());
		int heigth = Integer.parseInt(scanner.nextLine());
		
		int vHouse = width * length * heigth;
		
		String input = scanner.nextLine();
		int allBoxes = 0;
		
		
		
		while(!input.equals("Done")) {
			
			int boxesNum = Integer.parseInt(input);
			
			allBoxes += boxesNum;
			
			if(allBoxes >= vHouse) {
				break;
			}
			
			input = scanner.nextLine();
		}
		
		if(allBoxes >= vHouse) {
			System.out.printf("No more free space! You need %d Cubic meters more.", allBoxes - vHouse);
		} else {
			System.out.printf("%d Cubic meters left.", vHouse - allBoxes);
		}
	}

}
