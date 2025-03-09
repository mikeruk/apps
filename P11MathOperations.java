package tema14MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		String operator = scanner.nextLine();
		int m = Integer.parseInt(scanner.nextLine());
		calculateResult(n, m , operator);
	}
	
	public static void calculateResult(int n, int m , String operator) {
		int firstNum = firstNum(n);
		int secondNum = secondNum(m);
		operator = assignOperator(operator);
		int result = 0;
		if(operator.equals("+")) {
			result = firstNum + secondNum;
		} 
		if(operator.equals("-")) {
			result = firstNum - secondNum;
		}
		if(operator.equals("/")) {
			result = firstNum / secondNum;
		}
		if(operator.equals("*")) {
			result = firstNum * secondNum;
		}
		
		System.out.println(new DecimalFormat("0.##").format(result));
		
	}
	
	public static String assignOperator(String operator) {
		return operator;		
	}
	
	public static int secondNum(int m) {
		return m;
	}
	
	public static int firstNum(int n) {
		return n;
	}
	

}
