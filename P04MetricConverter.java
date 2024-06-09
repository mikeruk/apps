package Tema0601ProverkiUprajnenie;

import java.util.Scanner;

public class P04MetricConverter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number = Double.parseDouble(scanner.nextLine());
		String inputMetric = scanner.nextLine();
		String outputMetric = scanner.nextLine();
		
		if(inputMetric.equals("mm")){
			number = number / 1000;
		} else if(inputMetric.equals("cm")) {
			number = number / 100;
		} 
		
		if(outputMetric.equals("mm")) {
			number = number * 1000;
		} else if(outputMetric.equals("cm")) {
			number = number * 100;
		}
		
		System.out.printf("%.3f", number);
	}

}
