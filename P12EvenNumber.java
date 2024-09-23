package basicSyntaxConditStatAndLoopsLab;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P12EvenNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int n = Integer.parseInt(scanner.nextLine());
			if(n % 2 == 0) {
				n = Math.abs(n);
				System.out.println("The number is: " + n);
				break;
			} else {
				System.out.println("Please write an even number.");
			}
		}
	}

}
