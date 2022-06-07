package tema12WhileLoopUpr;

import java.util.Scanner;

public class P06Cake {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int width = Integer.parseInt(scanner.nextLine());
		int length = Integer.parseInt(scanner.nextLine());
		
		int cake = width * length;
		int pieces = 0;
		String input = "";
		
		while(cake > 0) {
			
			input = scanner.nextLine();
			
			if(input.equals("STOP")) {
				break;
			}
			pieces = Integer.parseInt(input);
			
			cake -= pieces;
			
		}
		
		
		
		if(input.equals("STOP")) {
			System.out.printf("%d pieces are left.", cake);
		} else if(cake < 0){
			System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
		}
		
		
		

	}

}
