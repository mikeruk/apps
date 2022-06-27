package tema13NestedLoops;

import java.util.Scanner;

public class P06Building {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int floors = Integer.parseInt(scanner.nextLine());
		int rooms = Integer.parseInt(scanner.nextLine());
		
		
		
		for(int i = floors; i >= 1; i--) {
			for(int x = 0; x < rooms; x++) {
				if(i % 2 != 0 && i != floors) {
					System.out.printf("A%d%x ",i, x);
				} else if(i % 2 == 0 && i != floors){
					System.out.printf("O%d%x ",i, x);
				} else if(i == floors) {
					System.out.printf("L%d%x ",i, x);
				}
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
