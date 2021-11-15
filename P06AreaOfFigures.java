package Tema06Proverki;

import java.util.Scanner;

public class P06AreaOfFigures {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String figure = scanner.nextLine();
		double length;
		double sideA;
		double sideB;
		double radius;
		double base;
		double height;
		
		if(figure.equals("square")) {
			length = Double.parseDouble(scanner.nextLine());
			double faceSq = length * length;
			System.out.printf("%.3f", faceSq);
		} else if(figure.equals("rectangle")) {
			sideA = Double.parseDouble(scanner.nextLine());
			sideB = Double.parseDouble(scanner.nextLine());
			double faceRect = sideA * sideB;
			System.out.printf("%.3f", faceRect);
		} else if(figure.equals("circle")){
			radius = Double.parseDouble(scanner.nextLine());
			double faceCirc = Math.PI * Math.pow(radius, 2);
			System.out.printf("%.3f", faceCirc);
		} else if(figure.equals("triangle")) {
			base = Double.parseDouble(scanner.nextLine());
			height = Double.parseDouble(scanner.nextLine());
			double faceTri = base * height / 2;
			System.out.printf("%.3f", faceTri);
		}
		

	}

}
