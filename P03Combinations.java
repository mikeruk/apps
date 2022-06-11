package tema13NestedLoops;

import java.util.Scanner;

public class P03Combinations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int count = 0;
		
		for(int i = 0; i <= n; i++) {
					for(int x = 0; x <= n; x++) {
						for(int y = 0; y <= n; y++) {
							
							if(i + x + y == n) {
								count++;
							}
						}
					}
					
				}
		System.out.println(count);
	}

}
