package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int array[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(var -> Integer.parseInt(var)).toArray();
		
		int sumToRight = 0;
		int sumToLeft = 0;
		boolean found = false;
		for(int i = 0; i <= array.length - 1; i++) {
			
			for(int k = i+1; k <= array.length - 1; k++) {
				sumToRight += array[k];
			}
			
			if(i > 0) {
				for(int j = i; j > 0; j--) {
					sumToLeft += array[j - 1];
				}
			}
			
			if(sumToRight == sumToLeft) {
				System.out.printf("%d",i);
				found = true;
			}
			//System.out.println(sumToRight);
			//System.out.println(sumToLeft);
			sumToRight = 0;
			sumToLeft = 0;
		}
		if(!found) {
			System.out.println("no");
		}
		
	}

}
