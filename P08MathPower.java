package tema14MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num = Double.parseDouble(scanner.nextLine());
		int power = Integer.parseInt(scanner.nextLine());
		
		double pow = calculatePower(num, power);
		System.out.println(new DecimalFormat("0.####").format(calculatePower(num, power)));
	}
	
	public static double calculatePower(double num, int power) {
		double pow = Math.pow(num, power);
		return pow;
		
	}
	

}
