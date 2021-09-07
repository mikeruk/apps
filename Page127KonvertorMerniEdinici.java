package bookExercises;

import java.util.Scanner;

public class Page127KonvertorMerniEdinici {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number = Double.parseDouble(scanner.nextLine());
		String input = scanner.nextLine().toLowerCase();
		String output = scanner.nextLine().toLowerCase();
		
		double meter = 0;
		if(input.equals("mm")) {
			meter = number / 1000;
		} else if(input.equals("cm")) {
			meter = number / 100;
		} else if(input.equals("mi")) {
			meter = number / 0.000621371192;
		} else if(input.equals("in")) {
			meter = number / 39.3700787;
		} else if(input.equals("km")) {
			meter = number / 0.001;
		} else if(input.equals("ft")) {
			meter = number / 3.2808399;
		} else if(input.equals("yd")) {
			meter = number / 1.0936133;
		} else if(input.equals("m")) {
			meter = number;
		} 
		
		double converted = 0;
		if(output.equals("m")){
			converted = meter;
		} else if(output.equals("mm")) {
			converted = meter * 1000;
		} else if(output.equals("cm")) {
			converted = meter * 100;
		} else if(output.equals("mi")) {
			converted = meter * 0.000621371192;
		} else if(output.equals("in")) {
			converted = meter * 39.3700787;
		} else if(output.equals("km")) {
			converted = meter * 0.001;
		} else if(output.equals("ft")) {
			converted = meter * 3.2808399;
		} else if(output.equals("yd")) {
			converted = meter * 1.0936133;
		}
		
		System.out.println(converted);

	}

}
