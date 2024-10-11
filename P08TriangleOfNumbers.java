package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P08TriangleOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double n = Integer.parseInt(scanner.nextLine());
		
		int k = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}
