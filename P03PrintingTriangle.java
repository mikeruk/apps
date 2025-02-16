package tema14MethodsLab;

import java.util.Scanner;

public class P03PrintingTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		printTop(n);
		
		printBottom(n);

	}
	private static void printTop(int n) {
		for(int i = 1; i <= n; i++) {
			printmiddle(i);
			System.out.println();
		}
		
	}

	private static void printmiddle(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
	}

	private static void printBottom(int n) {
		for(int i = n-1; i >= 1; i--) {
			printmiddle(i);
			System.out.println();
		}
		
	}

	

}
