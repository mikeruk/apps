package tema15MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int minNum = Integer.MAX_VALUE;
		
		for(int i = 1; i <= 3; i++) {
			int n = Integer.parseInt(scanner.nextLine());
			giveMinNum(n,minNum);
			minNum = giveMinNum(n,minNum);
		}
		
		System.out.print(minNum);
	}

	public static int giveMinNum(int n, int minNum) {
		if(n <= minNum) {
			minNum = n;
		}
		return minNum;
	}
	
}
