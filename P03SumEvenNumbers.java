package tema11ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] n = Arrays.stream(scanner.nextLine().split(" "))
				.mapToInt(var -> Integer.parseInt(var))
				.toArray();
		int sum = 0;
		for(int i = 0; i <= n.length - 1; i++) {
			
			
			if(n[i] % 2 == 0) {
				sum += n[i];
			}
		}
		System.out.print(sum);
	}

}
