package tema15MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int m = Integer.parseInt(scanner.nextLine());
		
		int l = Integer.parseInt(scanner.nextLine());
		
		System.out.println(substractNumbers(n,l, m));
		
	}

	public static int substractNumbers(int n, int l, int m) {
		return addNumbers( n,  m) - l;
		
	}
	
	public static int addNumbers(int n, int m) {
		n += m;
		return n;
	}
}
