package Tema0602ProverkiUprajnenie2;

import java.util.Scanner;

public class P01PipesInPool {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int V = Integer.parseInt(scanner.nextLine());
		int P1 = Integer.parseInt(scanner.nextLine());
		int P2 = Integer.parseInt(scanner.nextLine());
		double H = Double.parseDouble(scanner.nextLine());
		
		
		double totalLitresP1 = P1 * H;
		double totalLitresP2 = P2 * H;
		double totalP1P2 = totalLitresP1 + totalLitresP2;
		
		double poolFull = (totalP1P2 / V) * 100;
		double contributionP1 = (totalLitresP1  / totalP1P2) * 100;
		double contributionP2 = (totalLitresP2 / totalP1P2) * 100;
		
		double overflow = 0;
		if(totalP1P2 > V) {
			overflow = totalP1P2 - V;
		}
		
		
		if(totalP1P2 <= V) {
			System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% Pipe 2: %.2f%%",poolFull,contributionP1,contributionP2);
		} else if(totalP1P2 > V) {
			System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,overflow);
		}
		
	}

}
