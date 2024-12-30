package tema11ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		
		int n[] = Arrays.stream(s).mapToInt(var -> Integer.parseInt(var)).toArray();
		
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 0; i <= n.length - 1; i++) {
			if(n[i] % 2 == 0) {
				sumEven += n[i];
			} else {
				sumOdd += n[i];
			}
			
		}
		System.out.println(sumEven - sumOdd);
	}

}
