package tema09ForLoop;

import java.util.Scanner;

public class P07SumNumbers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		

		int num = Integer.parseInt(scanner.nextLine());
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			int num2 = Integer.parseInt(scanner.nextLine());
			sum += num2;
		}
		
		System.out.println(sum);
	}

}
