package tema15MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		nxn(n);	

	}

	public static void nxn(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n; k++) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
	}
	
}
