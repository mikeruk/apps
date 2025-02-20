package tema14MethodsLab;

import java.util.Scanner;

public class P04Calculations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int result = 0;

		
		if(input.equals("add")) {
			result =add(n,m,result);
			System.out.println(result);
		} else if(input.equals("divide")) {
			result = divide(n,m,result);
			System.out.println(result);
		} else if(input.equals("subtract")) {
			result = substract(n,m,result);
			System.out.println(result);
		} else if(input.equals("multiply")) {
			result = multiply(n,m,result);
			System.out.println(result);
		}
		
	}

	private static int divide(int n, int m, int result) {
		result = n / m;
		return result;
		
	}

	private static int multiply(int n, int m, int result) {
		result = n * m;
		return result;
		
	}

	private static int add(int n, int m, int result) {
		result = n + m;
		return result;
		
	}

	private static int substract(int n, int m, int result) {
		result = n - m;
		return result;
	}

}
