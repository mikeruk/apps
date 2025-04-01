package tema15MethodsExerciseMoreExc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P01DataTypes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input2 = "";
		String input = scanner.nextLine();
		double n = 0;
		if(input.equals("string")) {
			input2 = scanner.nextLine();
		} else {
			n = Double.parseDouble(scanner.nextLine());
		}
		
		
		checkResult(input, n, input2);
		
		

	}
	
	public static void checkResult(String input, double n, String input2) {
		
		if(checkForInt(input, n)) {
			System.out.printf("%.0f", n * 2);
		}
		
		if(checkForReal(input,n)) {
			System.out.printf("%.2f", (double) n*1.5);
		}
		
		if(checkForString(input,n)) {
			System.out.printf("$%s$",input2);
		}
		
		
		
	}
	
	
	public static boolean checkForString(String input, double n) {
		if(input.equals("string")) {
			input = "$";
			return true;
		}
		return false;
	}
	
	public static boolean checkForReal(String input, double n) {
		if(input.equals("real")) {
			n *= 1.5;
			return true;
		}
		return false;
	}
	
	public static boolean checkForInt(String input, double n) {
		
		if(input.equals("int")) {
			n *= 2;
			return true;
		}
		
		return false;
	}

}
