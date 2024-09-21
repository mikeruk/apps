package basicSyntaxConditStatAndLoopsLab;

import java.util.Scanner;

public class P11MultiplicationTable2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int multi = Integer.parseInt(scanner.nextLine());
		int result = 0;
		
		for(int i = multi; i <= 10; i++) {
			result = n * i;
			System.out.printf("%d X %d = %d%n", n, i, result);
		}
		
		if(multi > 10) {
			System.out.printf("%d X %d = %d%n", n, multi, n*multi);
		}
	}

}
