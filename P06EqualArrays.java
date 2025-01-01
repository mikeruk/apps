package tema11ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s = scanner.nextLine().split(" ");
		String[] s2 = scanner.nextLine().split(" ");
		
		int n[] = Arrays.stream(s).mapToInt(var -> Integer.parseInt(var)).toArray();
		int n2[] = Arrays.stream(s2).mapToInt(var -> Integer.parseInt(var)).toArray();
		boolean equal = true;
		
		int sum = 0;
		
		if(n.length == n2.length) {
			for(int i = 0; i <= n.length - 1; i++) {
				sum += n[i];
				if(n[i] != n2[i]) {
					System.out.printf("Arrays are not identical. Found difference at %d index.", i);
					equal = false;
					break;
				}
			}
		}
		if(equal == true) {
			System.out.printf("Arrays are identical. Sum: %d", sum);
		}
		
	}

}
