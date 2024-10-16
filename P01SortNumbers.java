package tema06BasicSyntaxCondStatemLoopsMoreExc;

import java.util.Scanner;

public class P01SortNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		int num3 = Integer.parseInt(scanner.nextLine());
		
		
		int smallest = Math.min(num1,Math.min(num2, num3));
		
		int biggest = Math.max(num1, Math.max(num2, num3));
		
		int middle = 0;		
		if(num1 != smallest && num1 != biggest) {
			middle = num1;
		}
		if(num2 != smallest && num2 != biggest) {
			middle = num2;
		}
		if(num3 != smallest && num3 != biggest) {
			middle = num3;
		}
		System.out.println(biggest);
		System.out.println(middle);
		System.out.println(smallest);
		
	}

}
