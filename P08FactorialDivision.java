package tema15MethodsExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08FactorialDivision {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int m = Integer.parseInt(scanner.nextLine());
		
		double sum = 1;
		
		divideNandM( n,  m,  sum);
		
	}
	
	public static void divideNandM(int n, int m, double sum) {
		sum = factorialFromN(n, sum) / factorialFromM(m, sum);
		System.out.printf("%.2f",sum);
	}
	
	public static double factorialFromM(int m, double sum) {
		
		for(int i = 1; i < m; i++) {
			sum *= i+1;
		}
		
		return sum;
	}
	
	public static double factorialFromN(int n, double sum) {
		
		for(int i = 1; i < n; i++) {
			sum *= i+1;
		}
		
		return sum;
	}
}
