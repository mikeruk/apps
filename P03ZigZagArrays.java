package tema12ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		String[] array1 = new String[n];
		String[] array2 = new String[n];
		
		for(int i = 1; i <= n; i++) {
			String[] s = scanner.nextLine().split(" ");
			
			if(i % 2 == 0) {
				array2[i-1] = s[0];
				array1[i-1] = s[1];

			} else {
				array1[i-1] = s[0];
				array2[i-1] = s[1];
			}
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(array1[i-1] + " ");
		}
		System.out.println();
		for(int i = 1; i <= n; i++) {
			System.out.print(array2[i-1] + " ");
		}

	}

}
