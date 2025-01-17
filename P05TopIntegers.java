package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(var -> Integer.parseInt(var)).toArray();
		
		for(int i = 0; i < n.length - 1; i++) {
			if(n[i] > n[i+1]) {
				System.out.print(n[i] + " ");
			}
		}
		System.out.print(n[n.length - 1]);

	}

}
