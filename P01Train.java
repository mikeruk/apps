package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] wagon = new int[n];
		
		
		int sum = 0;
		for(int i = 0; i <= wagon.length - 1; i++) {
			wagon[i] = Integer.parseInt(scanner.nextLine());
			
			sum += wagon[i];
			System.out.print(wagon[i] + " ");
		}
		System.out.println();
		System.out.println(sum);

		
//		for(int pr: wagon) {
//			System.out.print(pr);
//		}
	}

}
