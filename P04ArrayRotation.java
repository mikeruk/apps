package tema12ArraysExercise;

import java.util.Scanner;

public class P04ArrayRotation {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		int rotations = Integer.parseInt(scanner.nextLine());
		
		
		for(int i = 1; i <= rotations; i++) {
			String firstValue = s[0];
			
			for(int k = 0; k < s.length - 1; k++) {
				s[k] = s[k + 1];
			}
			s[s.length-1] = firstValue;
			
		}
		
		for(int j = 0; j <= s.length - 1; j++) {
			System.out.print(s[j] +" ");
		}
		
	}

}
