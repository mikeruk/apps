package tema19ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BigInteger num1 = new BigInteger(scanner.nextLine());
		
		BigInteger num2 = new BigInteger(scanner.nextLine());
		
		BigInteger sum = num1.add(num2);
		
		System.out.print(sum);
	}
	
	

}
