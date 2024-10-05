package tema06BasicSyntaxConditStatAndLoopsExc;

import java.util.Scanner;

public class P06StrongNumber {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int digit1 = 0;
		int digit = 0;
		int fac = 1;
		int facSum = 0;
		int n1 = n;
		
		while(true) {
			
			digit = n1 % 10;
			digit1 = n1 /10;
			for(int i = 1; i <= digit; i++) {
				fac *= i;
			
			}
			facSum += fac;
			if(digit1 == 0) {
				break;
			}
			digit = digit1;
			n1 = digit1;
			fac = 1;
			
		}
		if(facSum == n) {
			System.out.println("yes");
			
		} else {
			System.out.println("no");
		}
	}

}
