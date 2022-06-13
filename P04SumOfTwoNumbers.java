package tema13NestedLoops;

import java.util.Scanner;

public class P04SumOfTwoNumbers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int start = Integer.parseInt(scanner.nextLine());
		int end = Integer.parseInt(scanner.nextLine());
		
		int num = Integer.parseInt(scanner.nextLine());
		
		boolean flag = false;
		
		
		int count = 0;
		
		for(int i = start; i <= end; i++) {
			for(int x = start; x <= end; x++) {
				count++;
				
				if(i + x == num) {
					System.out.printf("Combination N:%d (%d + %d = %d)",count, i, x, i + x);
					flag = true;
				}
			}
			
			if (flag) {
				break;
			}
		}
		
		if(!flag) {
			System.out.printf("%d combinations - neither equals %d",count, num);
		}
		
		
	}

}
