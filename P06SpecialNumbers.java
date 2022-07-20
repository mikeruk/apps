package tema14NestedLoopsExercise;

import java.util.Scanner;

public class P06SpecialNumbers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
						for(int k = 1; k <= 9; k++) {
								for(int x = 1; x <= 9; x++) {
									if(n % i == 0 && n % j == 0 && n % k == 0 && n % x == 0) {
										System.out.printf("%d%d%d%d ", i, j, k, x);
									}
								}
						}
				}
		}
	}
}
