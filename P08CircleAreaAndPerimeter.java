package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double r = Double.parseDouble(scanner.nextLine());
		
		double area = Math.pow(r, 2) * Math.PI;
		
		double perimetar = 2 * Math.PI * r;
		
		
		System.out.printf("%.2f \n", area);
		System.out.printf("%.2f", perimetar);
		
	}

}
