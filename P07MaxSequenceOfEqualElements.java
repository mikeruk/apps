package tema12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		
		int[] n = Arrays.stream(s).mapToInt(var -> Integer.parseInt(var)).toArray();
		
		int maxCount = Integer.MIN_VALUE;
		int finalCount = 0;
		int mostLeftIndex = 0;
		
		for(int i = 0; i < s.length - 1; i++) {
			int count = 1;
			if(n[i] == n[i+1]) {
				int k = i;
				while(k < n.length-1) {
					if(n[k] == n[k+1]) {
						count++;
						k++;
						if(count > maxCount) {
							maxCount = count;
							mostLeftIndex = i;
						}
					} else {
						count = 1;
						break;
						
						}
					}
				}
			}
		
	
		for(int j = mostLeftIndex; j <= mostLeftIndex + maxCount -1; j++) {
			System.out.print(s[mostLeftIndex]+" ");
		}
	}

}

